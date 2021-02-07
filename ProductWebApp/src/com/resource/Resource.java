package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class Resource {

static private Connection con=null; 
		static
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Ink@2120");
			}
			catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		public static Connection getConnection() {
			return con;
		}

}
