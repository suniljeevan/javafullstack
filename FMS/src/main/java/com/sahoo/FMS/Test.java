package com.sahoo.FMS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sahoo.FMS.Entities.Faculty;

public class Test {

	public static void main(String[] args) throws Exception{
        Faculty faculty = new Faculty("100","sahoo","AP","java");
        Configuration config=new Configuration();
        SessionFactory sf=config.configure().buildSessionFactory();
        Session session =sf.openSession();
        Transaction t = session.beginTransaction(); 
        session.save(faculty);
        t.commit();
        session.close();
	       sf.close();
	}

}





