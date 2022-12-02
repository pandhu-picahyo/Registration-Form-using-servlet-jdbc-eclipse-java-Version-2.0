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
     
        Connection con=null;  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "root", "root");  
                     
            PreparedStatement ps=con.prepareStatement(  
                    "update registration set name=?, email=?, "
                    + "address=?, phone=?, city=?, country=?, "
                    + "education=? where id=?");  
                    
            ps.setString(1, name);  
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setString(5, city);
            ps.setString(6, country);
            ps.setString(7, education);
            
            ps.executeUpdate();  
            ps.close();
            con.close();
            
            response.sendRedirect("front-page.jsp");
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }  

       
    }  
  
}  