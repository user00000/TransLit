package ru.disgroup.extrimistList.TransLiterations.Entities;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Margarita Bocheva on 30.10.2014.
 * Company: DIS
 */
@Entity
@Table(name = "ELP_WORD_FORMS", schema = "", catalog = "test")
public class ElpWordFormsEntity {
    private int idWordForms;
    private String elem;
    private int padeg;

    @Id
    @GenericGenerator(name = "wordFormsGen", strategy = "increment")
    @GeneratedValue(generator = "wordFormsGen")
    @Column(name = "ID_WORD_FORMS", nullable = false, insertable = true, updatable = true)
    public int getIdWordForms() {
        return idWordForms;
    }

    public void setIdWordForms(int idWordForms) {
        this.idWordForms = idWordForms;
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
    @Column(name = "PADEG", nullable = false, insertable = true, updatable = true)
    public int getPadeg() {
        return padeg;
    }

    public void setPadeg(int padeg) {
        this.padeg = padeg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElpWordFormsEntity that = (ElpWordFormsEntity) o;

        if (idWordForms != that.idWordForms) return false;
        if (padeg != that.padeg) return false;
        if (elem != null ? !elem.equals(that.elem) : that.elem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWordForms;
        result = 31 * result + (elem != null ? elem.hashCode() : 0);
        result = 31 * result + padeg;
        return result;
    }

    public int nameExist(String elem, int padeg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(this.getClass())
                .setProjection(Projections.projectionList()
                        .add(Projections.property("idWordForms"), "idWordForms"))
                .add(Restrictions.eq("elem", elem))
                .add(Restrictions.eq("padeg", padeg));

        List terrorList = criteria.list();
        session.getTransaction().commit();
        if (terrorList.isEmpty()) {
            return 0;
        }
        return (Integer)terrorList.get(0);
    }
//private String elem;
//private int padeg;

    
/*
    public int add(String elem, int padeg){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        this.elem = elem;
        this.padeg = padeg;
        int idWordForms = (int)session.save(this);
        session.getTransaction().commit();

        return idWordForms;
    }
*/
    
}
