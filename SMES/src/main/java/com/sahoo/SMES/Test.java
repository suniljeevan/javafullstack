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
	    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    System.out.println("1");
	    Session session = factory.openSession();  
	    System.out.println("2");
	   Transaction t = session.beginTransaction(); 
	    System.out.println("3");
	       //5.Save your object to database
	       session.save(student);
	       //6/ Commit your transaction 
	       t.commit();
	       session.close();
	       factory.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	    }
	}
