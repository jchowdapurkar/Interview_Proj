package com.jd.hibernate.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jd.hibernate.dto.WeatherDTO;

public class WeatherHQLDAO 
{
	
	
	public WeatherDTO FetchBywid(int wid)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WeatherDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String hqlsyntax =  "select weather from WeatherDTO " + "weather where weather.CityName=?"
				+ "weather where weather.Temparature=?"+"weather where weather.Day=?"
				+" weather where weather.Time=?";
		try
		{
			Query qry = session.createQuery(hqlsyntax);
			
			qry.setParameter("wid", wid);
			
			WeatherDTO weatherDTO = (WeatherDTO)qry.uniqueResult();
			
			return weatherDTO;
			
		}
		finally {
			session.close();
		}

	
		
	}
	public static void main(String[] args) {
		 WeatherHQLDAO weatherHQLDAO = new WeatherHQLDAO();
		WeatherDTO weatherDTO = weatherHQLDAO.FetchBywid(1);
		WeatherDTO weatherDTO = weatherHQLDAO.FetchBywid(2);
		WeatherDTO weatherDTO = weatherHQLDAO.FetchBywid(3);
		WeatherDTO weatherDTO = weatherHQLDAO.FetchBywid(4);
	}
	

}
