package com.jd.hibernate.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jd.hibernate.dao.WeatherDAO;
import com.jd.hibernate.dto.WeatherDTO;

public class Tester
{

	
	
	
	public static void main(String[] args) {
		
		
		
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setWid(1);
		weatherDTO.setCityName("Bangalore");
		
		weatherDTO.setTemparature(30);
		weatherDTO.setDay("Tuesday");
		weatherDTO.setTime("Morning");
		
		weatherDTO.setWid(2);
		weatherDTO.setCityName("Chennai");
		weatherDTO.setTemparature(36);
		weatherDTO.setDay("Monday");
		weatherDTO.setTime("Evening");
		
		weatherDTO.setWid(3);
		weatherDTO.setCityName("Delhi");
		weatherDTO.setTemparature(38);
		weatherDTO.setDay("Monday");
		weatherDTO.setTime("Night");
		
		
		weatherDTO.setWid(4);
		weatherDTO.setCityName("Kolkata");
		weatherDTO.setTemparature(35);
		weatherDTO.setDay("Wednesday");
		weatherDTO.setTime("Noon");
		
		
		WeatherDAO weatherDAO = new WeatherDAO();
		weatherDAO.save(weatherDTO);
		
	
	}
	
	}
	
	

