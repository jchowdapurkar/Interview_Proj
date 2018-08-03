package com.jd.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;




@Entity//@Entity is a Annotation defines that a class can be mapped to a table// 

@Table(name="Weather_Table")//It allows you to specify the details of the table name etc//

	
public class WeatherDTO implements Serializable
{

	
	@Id
	//It is used to specify the identifier property of the entity bean//
	
	@GenericGenerator(name="jd",strategy="increment")
	//GenericGenarator-This Annotation is used to create an object of Identifier Generator//
	
	@GeneratedValue(generator="jd")
	//This annotation is used to generate & set the primary key//
	
	@Column(name="wid")
	//This Represents the mapped table column name//
	
	private int wid;
	@Column(name="CityName")
	private String CityName;
	@Column(name="Day")
	private String Day;
	@Column(name="Temparature")
	private int Temparature;
	@Column(name="Time")
	private String Time;
	
	
	public WeatherDTO(int wid, String cityName, String day, int temparature, String time)
	{
		
		this.wid = wid;
		CityName = cityName;
		Day = day;
		Temparature = temparature;
		Time = time;
	}
	



	public WeatherDTO() {
		System.out.println("Created....");
	}
	public int getWid() {
		return wid;
	}


	public void setWid(int wid) {
		this.wid = wid;
	}


	public String getCityName() {
		return CityName;
	}


	public void setCityName(String cityName) {
		CityName = cityName;
	}


	public String getDay() {
		return Day;
	}


	public void setDay(String day) {
		Day = day;
	}


	public int getTemparature() {
		return Temparature;
	}


	public void setTemparature(int temparature) {
		Temparature = temparature;
	}


	public String getTime() {
		return Time;
	}


	public void setTime(String time) {
		Time = time;
	}


	@Override
	public String toString() {
		return "WeatherDTO [wid=" + wid + ", CityName=" + CityName + ", Day=" + Day + ", Temparature=" + Temparature
				+ ", Time=" + Time + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
