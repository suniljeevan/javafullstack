package com.pu.SMES;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //step 1
    	Configuration config=new Configuration();
    	//step 2
    	SessionFactory sf=config.configure().buildSessionFactory();
    	//step 3
    	Session session = sf.openSession();
    	//step 4
    	Student s=new Student(8,"yash",8.5);
    	session.save(s);
    	//step 5
    	Transaction t = session.beginTransaction();
    	t.commit();
    	session.close();
    	sf.close();
    	System.out.println("STudent Inserted/persisted");
    }
}








