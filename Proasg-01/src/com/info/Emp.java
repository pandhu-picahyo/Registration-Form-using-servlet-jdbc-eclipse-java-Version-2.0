package com.info;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;

import javax.servlet.http.Part;

public class Emp 
{
	
	private int id;
	private String name, email, address, phone, city, country, education;
	Date date;
	Blob photo;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Date getDate() 
	{
		return date;
	}
	
	public void setDate(Date date2) 
	{
		this.date = date2;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String getEducation() 
	{
		return education;
	}
	
	public void setEducation(String education) 
	{
		this.education = education;
	}
	
	public Blob getPhoto() 
	{
		return photo;
	}
	public void setPhoto(Blob photo) 
	{
		this.photo = photo;
	}
}