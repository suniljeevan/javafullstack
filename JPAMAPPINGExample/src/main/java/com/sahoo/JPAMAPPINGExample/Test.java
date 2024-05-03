package com.sahoo.JPAMAPPINGExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sahoo.JPAMAPPINGExample.Entities.Department;
import com.sahoo.JPAMAPPINGExample.Entities.HOD;

public class Test {

	public static void main(String[] args) throws Exception{
		try {
			final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
			SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		System.out.println("factory");
		Session session=factory.openSession();
		System.out.println("session");
		Transaction transaction = session.beginTransaction();
		System.out.println("transaction");
		HOD hod = new HOD();
		hod.setHodid(103);
		hod.setHodname("Dr. Blessed");
		Department department = new Department();
		department.setDepartmentid(1003);
        department.setDepartmentname("CSE");
        hod.setDepartment(department);
        department.setHod(hod);
		session.save(hod);
		session.save(department);
		transaction.commit();
		System.out.println("Objects persisted");
		session.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}