package com.display;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import com.info.Emp;
import com.dao.Emp_Dao;
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/View_Data")
public class View_Data extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        
    	response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        out.println("<link rel='stylesheet' href='css/bootstrap.css'></link>");
        out.print("<br><br><br>");
        out.print("Welcome... you can view all the data");
        
        out.print("<center>");
        out.println("<h1>Employee Data</h1>");
          
        List<Emp> list=Emp_Dao.getAllEmployees();  
          
        out.println("<div style='margin:auto;width:900px;margin-top:100px;'>");
        out.println("<table class='table table-hover table-bordered'>");
        out.print(
        		"<tr><th>Id</th> "+ 
        		"<th>Name</th>" + 
        		"<th>Date</th>" + 
        		"<th>City</th>" +
        		"<th>Status</th>" +
        		"<th>Edit</th>" +
        		"<th>Delete</th></tr>");
        
        for(Emp e:list){  
         out.print(
        		 	"<tr><td>"+e.getId()+"</td>"
        		 		+ "<td>"+e.getName()+"</td>"
        		  		+ "<td>"+e.getDate()+"</td>"
        		  		+ "<td>"+e.getCity()+"</td>"
        		  		+ "<td><a href='Detail_Data?id="+e.getId()+"'><button type=\"button\">Status</button></a></td>"
        		  		+ "<td><a href='edit-data.jsp?id="+e.getId()+"'><button type=\"button\">Edit</button></a></td>"
        		  		+ "<td><a href='Delete_Data?id="+e.getId()+"'><button type=\"button\">Delete</button></a></td></tr>"); 
         
        }  
        out.print("</table>");
        out.println("</div>");
        out.print("</center>");
        out.close();  
    }  
}  