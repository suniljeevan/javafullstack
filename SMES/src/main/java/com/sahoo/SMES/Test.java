package com.sahoo.SMES;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) throws Exception{
		try {
		Student student = new Student();
	       student.setRoll(1);
	       student.setName("god");
	       student.setMarks(100);
            Configuration configuration = new Configuration();
             //step1
	    SessionFactory factory = configuration.configure().buildSessionFactory();
            //step2
	    Session session = factory.openSession();  
            //step 3
	    Transaction t = session.beginTransaction(); 
	    
	       //4.Save your object to database
	       session.save(student);
	       //5 Commit your transaction 
	       t.commit();
	       session.close();
	       factory.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	    }
	}
