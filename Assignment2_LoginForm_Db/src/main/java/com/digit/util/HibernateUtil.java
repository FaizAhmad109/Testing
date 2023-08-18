package com.digit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.digit.dto.LoginDetails;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	static
	{
		sessionFactory = new Configuration().configure().addAnnotatedClass(LoginDetails.class).buildSessionFactory();
	}
	
	private HibernateUtil()
	{
		
	}
	
	public static Session getConnection()
	{
		if(sessionFactory !=null)
		{
			session = sessionFactory.openSession();
		}
		
		return session;
	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}

}
