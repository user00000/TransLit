package ru.disgroup.extrimistList.TransLiterations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.disgroup.extrimistList.TransLiterations.Entities.ElpStopListEntity;
import ru.disgroup.extrimistList.TransLiterations.Entities.Message;
import ru.disgroup.extrimistList.TransLiterations.Run.Transliterations_2010;



public class TestTransl1 {

	
	    SessionFactory factory;

	    @BeforeClass
	    public void setup() {
	        Configuration configuration = new Configuration();
	        configuration.configure();
	        ServiceRegistryBuilder srBuilder = new ServiceRegistryBuilder();
	        srBuilder.applySettings(configuration.getProperties());
	        ServiceRegistry serviceRegistry = srBuilder.buildServiceRegistry();
	        factory = configuration.buildSessionFactory(serviceRegistry);
	    }

	/*    
	    @Test
	    public void saveMessage() {
	        Message message = new Message("Hello, world");
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(message);
	        tx.commit();
	        session.close();
	    }
	*/
	  
	   
	    
	    /* 
	    @Test
	    public void saveMessage() {
	    	ElpStopListEntity stpList = new ElpStopListEntity();
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.persist(message);
	        tx.commit();
	        session.close();
	    }
	*/
}
