package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.dao.Emp_Dao;
import com.info.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig(maxFileSize = 16177216) 
public class Edit_Dao extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter ("id"));
		String name = request.getParameter ("name");
		String email = request.getParameter ("email");
		String address = request.getParameter ("address");
		String phone = request.getParameter ("phone");
		String city = request.getParameter ("city");
		String country = request.getParameter ("country");
		String education = request.getParameter ("education");
		
		try {
			
			Connection con=Emp_Dao.getConnection();  
			PreparedStatement st = con.prepareStatement("update registration set name=?, email=?, address=?, phone=?, city=?, country=?, education=? where id=?");
			
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, address);
			st.setString(4, phone);
			st.setString(5, city);
			st.setString(6, country);
			st.setString(7, education);
			st.setInt(8, id);
			
			st.executeUpdate () ;
			
			st.close();
			con.close();
			PrintWriter out = response.getWriter();
			out.println ("<html><body><b>Successfully Updated"	+ "</b></body></html>") ;
			response.sendRedirect("front-page.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Emp getRecordById(int id){  
	    Emp d=null;  
	    try{  
	    	Connection con=Emp_Dao.getConnection(); 
	        PreparedStatement ps=con.prepareStatement("select * from registration where id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            d=new Emp();  
	            d.setId(rs.getInt("id"));
	            d.setName(rs.getString("name"));
	            d.setEmail(rs.getString("email"));
	            d.setAddress(rs.getString("address"));
	            d.setPhone(rs.getString("phone"));
	            d.setCity(rs.getString("city"));	            
	            d.setCountry(rs.getString("country"));
	            d.setEducation(rs.getString("education"));
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    	return d;  
	}  

}