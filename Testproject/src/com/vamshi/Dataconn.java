package com.vamshi;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dataconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/karokee","root","error");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from gamer");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
			}catch(Exception ent){ System.out.println(ent);}  
			}  
	}


