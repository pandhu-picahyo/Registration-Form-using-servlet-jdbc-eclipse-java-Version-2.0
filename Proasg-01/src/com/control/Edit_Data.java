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
public class Edit_Data extends HttpServlet {  
	private static final long serialVersionUID = 102831973239L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {   
        
    	int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String education = request.getParameter("education");
        
          
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
                    "update registration set name=?, email=?, "
                    + "address=?, phone=?, city=?, country=?, "
                    + "education=? where id=?");  
                    
            ps.setString(1, e.getName());  
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getAddress());
            ps.setString(4, e.getPhone());
            ps.setString(5, e.getCity());
            ps.setString(6, e.getCountry());
            ps.setString(7, e.getEducation());
                      
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