package com.jd.hibernate.dao;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jd.hibernate.dto.WeatherDTO;



public class WeatherDAO
{
  
	
	
	public void save(WeatherDTO weatherDTO) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WeatherDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(weatherDTO);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}
	public List<WeatherDTO> fetchAll() {
		String hqlSyntax = "select weather "
				+ " from WeatherDTO weather";
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WeatherDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		try {
			Query query = session.createQuery(hqlSyntax);
			List<WeatherDTO> list = query.list();
			return list;
			
		} finally {
			session.close();
		}
	}
	
	
	
	
	
	
}
