package com.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.domain.ClassDetails;
import com.domain.StudentDetails;
import com.domain.SubjectDetails;
import com.domain.TeacherDetails;

public class Util {
	
		private static SessionFactory factory;
		
		public static SessionFactory buildConnection() {
			
			factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(StudentDetails.class)	
					.addAnnotatedClass(TeacherDetails.class)
					.addAnnotatedClass(ClassDetails.class)
					.addAnnotatedClass(SubjectDetails.class)
					.buildSessionFactory();
			
			return factory;
		}
	
}