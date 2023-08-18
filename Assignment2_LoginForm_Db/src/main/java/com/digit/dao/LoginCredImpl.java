package com.digit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.digit.dto.LoginDetails;
import com.digit.util.HibernateUtil;

public class LoginCredImpl implements ILoginCred {
//	public static void main(String[] args) {
//		LoginCredImpl i = new LoginCredImpl();
//		i.getDetails();
//	}

	@Override
	public List<LoginDetails> getDetails() {
		Session session = HibernateUtil.getConnection();
		List<LoginDetails> list = null;
//		Transaction transaction = null;
//		Integer id =null;
//		boolean flag = false;
		try {
			if (session != null) {
				@SuppressWarnings("unchecked")
				Query<LoginDetails> query = session.createQuery(" FROM com.digit.dto.LoginDetails"); // same as Select *
																										// from
																										// LoginDetails;
				list = query.list();
				list.forEach(System.out::println);
				return list;
				// transaction = session.beginTransaction();

//				if(transaction != null)
//				{
//					LoginDetails l = new LoginDetails();
//					l.setUsername("mortal1234");
//					l.setPassword("mortal12345");
//					
//					id=(Integer) session.save(l);
//					flag=true;
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			if(flag)
//			{
//				transaction.commit();
//				System.out.println("Object is created to the database ::"+id);
//			}
//			else
//			{
//				transaction.rollback();
//				System.out.println("Object is not created ");
//			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();

		}

		return list;
	}

}
