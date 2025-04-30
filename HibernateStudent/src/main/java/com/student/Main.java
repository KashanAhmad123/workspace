package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		Student s1= new Student();
		s1.setName("Mohan");
		s1.setAge(23);
		s1.setRoll(11889);
		
		Configuration cg= new Configuration();
		SessionFactory sf= cg.buildSessionFactory();
		Session session= sf.openSession();
		session.persist(s1);
		
		System.out.println(s1);
		
		
		
		
	}

}
