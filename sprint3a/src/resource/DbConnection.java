package resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 static Connection con;
	 
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("sql exception and class not found exception handled");
		}
		return con;	
	}
public void Dbclose()
{
	try {
		con.close();
	}
	catch (SQLException e) {
		System.out.println(e.toString());
	}
}
}
