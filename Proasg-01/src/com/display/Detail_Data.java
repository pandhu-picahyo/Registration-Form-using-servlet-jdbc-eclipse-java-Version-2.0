package com.display;

import java.io.IOException;  
import java.io.PrintWriter;

import com.info.Emp;
import com.dao.Emp_Dao;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/Detail_Data")  
public class Detail_Data extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        
        out.println("<link rel='stylesheet' href='css/bootstrap.css'></link>");
        out.print("<br><br><br>");
        out.print("<center>");
        out.println("<h1>Employee Data</h1>");  
        
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Emp e=Emp_Dao.getEmployeeById(id);  
          
        out.print( 
        		"<br><h2>Name       : "+e.getName()+"</h2>" + 
        		"<h2>Email          : "+e.getEmail()+"</h2>" + 
        		"<h2>Address        : "+e.getAddress()+"</h2>" +
        		"<h2>Phone          : "+e.getPhone()+"</h2>" +
        		"<h2>City           : "+e.getCity()+"</h2>" +
        		"<h2>Country        : "+e.getCountry()+"</h2> " +
        		"<h2>Education      : "+e.getEducation()+"</h2>");
        
        out.print( 
        			"<img src=\'Image_Data?id="+e.getId()+"' width= '300px' />");
        out.print(
        		 		"<br><br><tr><td>"
        		 		
        		 		+ "<h1><a href='edit-data.jsp?id="+e.getId()+"'><button type=\"button\" class=\"btn btn-outline-primary\">Edit</button></a>"
        		 		    		 		
        		 		+ "<input type=\"submit\" value=\"Download PDF\" name=\"download\" onclick=\"window.print()\">"
        		 		
        		  		+ "<a href='Delete_Data?id="+e.getId()+"'><button type=\"button\" class=\"btn btn-outline-primary\">Delete</button></a>"
        		  				
        		  		+ "</h1></td></tr>");  
        
        out.print("</center>");
        }  
            
}  