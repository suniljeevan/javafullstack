package com.sahoo.smes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//low level components
public class App 
{
    public static void main( String[] args )
    {
    	//Step1 - configuration object
    Configuration c=new Configuration();
    //step 2 - create Session Factory
    SessionFactory sf=c.configure().buildSessionFactory();
    //step 3 - create a session
    Session ses=sf.openSession();
    //step 4 - create student object to persist
    Student ob=new Student("20211cse0388","thousif",9.4,6);
    //step 5 - use hql to insert on session
    ses.save(ob);
    //step 6 - create transaction to make commit
    Transaction t=ses.beginTransaction();
    t.commit();
    //step 7 - close connection
    ses.close();
    sf.close();
    System.out.println("object inserted");
    }
}









