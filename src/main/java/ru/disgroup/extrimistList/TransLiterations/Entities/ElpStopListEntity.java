package ru.disgroup.extrimistList.TransLiterations.Entities;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Margarita Bocheva on 31.10.2014.
 * Company: DIS
 */
@Entity
@Table(name = "ELP_STOP_LIST", schema = "", catalog = "test")
public class ElpStopListEntity {
    private int idElem;
    private Integer idBaseElement;
    private int groupId;
    private String elem;
    private String elemType;
    private String elemTerr;
    private String iif;
    private int ces;
    private Long ama;
    private String description;
    private int idDoc;
    private int idDocInsert;

    public ElpStopListEntity() {}

    public ElpStopListEntity(
            Integer idBaseElement
            , int groupId
            , String elem
            , String elemType
            , String elemTerr
            , String iif
            , int ces
            , String description
            , int idDoc
            , int idDocInsert) {
//        this.idElem = idElem;
        this.idBaseElement = idBaseElement;
        this.groupId = groupId;
        this.elem = elem;
        this.elemType = elemType;
        this.elemTerr = elemTerr;
        this.iif = iif;
        this.ces = ces;
//        this.ama = ama;
        this.description = description;
        this.idDoc = idDoc;
        this.idDocInsert = idDocInsert;

    }

    @Id
    @GenericGenerator(name = "elemGen", strategy = "increment")
    @GeneratedValue(generator = "elemGen")
    @Column(name = "ID_ELEM", nullable = false, insertable = true, updatable = true)
    public int getIdElem() {
        return idElem;
    }

    public void setIdElem(int idElem) {
        this.idElem = idElem;
    }

    @Basic
    @Column(name = "ID_BASE_ELEMENT", nullable = true, insertable = true, updatable = true)
    public Integer getIdBaseElement() {
        return idBaseElement;
    }

    public void setIdBaseElement(Integer idBaseElement) {
        this.idBaseElement = idBaseElement;
    }

    @Basic
    @Column(name = "GROUP_ID", nullable = false, insertable = true, updatable = true)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "ELEM", nullable = false, insertable = true, updatable = true, length = 1025)
    public String getElem() {
        return elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

    @Basic
    @Column(name = "ELEM_TYPE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getElemType() {
        return elemType;
    }

    public void setElemType(String elemType) {
        this.elemType = elemType;
    }

    @Basic
    @Column(name = "ELEM_TERR", nullable = false, insertable = true, updatable = true, length = 1)
    public String getElemTerr() {
        return elemTerr;
    }

    public void setElemTerr(String elemTerr) {
        this.elemTerr = elemTerr;
    }

    @Basic
    @Column(name = "IIF", nullable = true, insertable = true, updatable = true, length = 1)
    public String getIif() {
        return iif;
    }

    public void setIif(String iif) {
        this.iif = iif;
    }

    @Basic
    @Column(name = "CES", nullable = false, insertable = true, updatable = true)
    public int getCes() {
        return ces;
    }

    public void setCes(int ces) {
        this.ces = ces;
    }

    @Basic
    @Column(name = "AMA", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getAma() {
        return ama;
    }

    public void setAma(Long ama) {
        this.ama = ama;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "ID_DOC", nullable = false, insertable = true, updatable = true)
    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    @Basic
    @Column(name = "ID_DOC_INSERT", nullable = false, insertable = true, updatable = true)
    public int getIdDocInsert() {
        return idDocInsert;
    }

    public void setIdDocInsert(int idDocInsert) {
        this.idDocInsert = idDocInsert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElpStopListEntity that = (ElpStopListEntity) o;

        if (ces != that.ces) return false;
        if (groupId != that.groupId) return false;
        if (idDoc != that.idDoc) return false;
        if (idDocInsert != that.idDocInsert) return false;
        if (idElem != that.idElem) return false;
        if (ama != null ? !ama.equals(that.ama) : that.ama != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (elem != null ? !elem.equals(that.elem) : that.elem != null) return false;
        if (elemTerr != null ? !elemTerr.equals(that.elemTerr) : that.elemTerr != null) return false;
        if (elemType != null ? !elemType.equals(that.elemType) : that.elemType != null) return false;
        if (idBaseElement != null ? !idBaseElement.equals(that.idBaseElement) : that.idBaseElement != null)
            return false;
        if (iif != null ? !iif.equals(that.iif) : that.iif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idElem;
        result = 31 * result + (idBaseElement != null ? idBaseElement.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + (elem != null ? elem.hashCode() : 0);
        result = 31 * result + (elemType != null ? elemType.hashCode() : 0);
        result = 31 * result + (elemTerr != null ? elemTerr.hashCode() : 0);
        result = 31 * result + (iif != null ? iif.hashCode() : 0);
        result = 31 * result + ces;
        result = 31 * result + (ama != null ? ama.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + idDoc;
        result = 31 * result + idDocInsert;
        return result;
    }

//    private int idElem;
//    private Integer idBaseElement;
//    private int groupId;
//    private String elem;
//    private String elemType;
//    private String elemTerr;
//    private String iif;
//    private int ces;
//    private Long ama;
//    private String desc;
//    private int idDoc;
//    private int idDocInsert;

    public void add(Integer groupId, Integer idBaseElement, String elem, String elemType, String elemTerr, String iif,
                    int ces, Long ama, String desc, int idDoc, int idDocInsert){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        this.idBaseElement = idBaseElement;
        this.groupId = groupId;
        this.elem = elem;
        this.elemType = elemType;
        this.elemTerr = elemTerr;
        this.iif = iif;
        this.ces = ces;
        this.ama = ama;
        this.description = desc;
        this.idDoc = idDoc;
        this.idDocInsert = idDocInsert;
        session.save(this);
        session.getTransaction().commit();
    }

    public void update(int idSubject, int idDoc, int ces) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ElpStopListEntity elpStopListEntity = (ElpStopListEntity)session.get(this.getClass(), idSubject);
        elpStopListEntity.setIdDoc(idDoc);
        elpStopListEntity.setCes(ces);
        session.update(elpStopListEntity);
        session.getTransaction().commit();
    }

    public int elemExist(Integer groupId
            , String elem
            , String elemType
            , String elemTerr) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(this.getClass())
                .setProjection(Projections.projectionList()
                        .add(Projections.property("idElem"), "idElem"))
                .add(Restrictions.eq("groupId", groupId))
                .add(Restrictions.eq("elem", elem))
                .add(Restrictions.eq("elemType", elemType))
                .add(Restrictions.eq("elemTerr", elemTerr));

        List list = criteria.list();
        session.getTransaction().commit();
        if (list.isEmpty()) {
            return 0;
        }
        return (Integer)list.get(0);
    }

    public void saveOrUpdate() {
        int idRecord = elemExist(groupId, elem, elemType, elemTerr);
        if (idRecord!= 0) {
            update(idRecord, idDoc, ces);
        }
        else {
            add(groupId, idBaseElement, elem, elemType, elemTerr, iif, ces, ama, description, idDoc, idDocInsert);
        }
    }

    public List<ElpStopListEntity> getRecordsByDoc(int idDoc) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ElpStopListEntity> list = null;

        org.hibernate.Query query = session.createQuery("from ElpStopListEntity where idDoc = :idDoc ");
        query.setParameter("idDoc", idDoc);
        list = query.list();

        return list;
    }
}
