package com.control;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.info.Emp;
import javax.servlet.annotation.MultipartConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;  
import javax.servlet.annotation.MultipartConfig;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;  

@MultipartConfig(maxFileSize = 16177216) 
public class Save_Data extends HttpServlet {  
	private static final long serialVersionUID = 102831973239L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
    	
    	DateFormat dateform = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date dates = new Date();  
          
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String education = request.getParameter("education");
        String date = dateform.format(dates);
        Part filepart = request.getPart("photo"); 
          
        Emp e=new Emp();  
        e.setName(name);
        e.setEmail(email);
        e.setAddress(address);
        e.setPhone(phone);
        e.setCity(city);
        e.setCountry(country);
        e.setEducation(education);
     
        Connection con=null;  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "root", "root");  
     
                     
            PreparedStatement ps=con.prepareStatement(  
                    "insert into registration" +
                    "(name, email, address, phone, city, country, education, photo, date)" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?)");  
                    
            ps.setString(1, e.getName());  
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getAddress());
            ps.setString(4, e.getPhone());
            ps.setString(5, e.getCity());
            ps.setString(6, e.getCountry());
            ps.setString(7, e.getEducation());
                    
        	InputStream is = filepart.getInputStream();
        	ps.setBlob(8, is);
            ps.setString(9, date);
                      
            ps.executeUpdate();  
            ps.close();
            con.close();
            
            request.getRequestDispatcher("front-page.jsp").include(request, response);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }  

       
    }  
  
}  