package com.pu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
       Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Address ab=(Address) factory.getBean("addressbean");
		Student ob=(Student)factory.getBean("studentbean");
		System.out.println(ob.getCgpa());
		System.out.println(ob.getName());
		System.out.println(ab.getCountry());
		System.out.println(ab.getState());
		System.out.println(ab.getPin());
		System.out.println(ab.getParentname());
	}

}
