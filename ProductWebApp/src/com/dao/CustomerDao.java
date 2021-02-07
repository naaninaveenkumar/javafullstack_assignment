package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Customer;
import com.resource.Resource;

public class CustomerDao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public int createAccountDao(Customer c)
	{
		try {
			con=Resource.getConnection();
			ps=con.prepareStatement("insert into customer1 values(?,?,?,?,?,?,?,?)");
			ps.setString(1, c.getFirstname());
			ps.setString(2, c.getLastname());
			ps.setString(3, c.getGender());
			ps.setInt(4, c.getAge());
			ps.setInt(5, c.getPhnnumber());
			ps.setString(6, c.getUsername());
			ps.setString(7, c.getPassword());
			ps.setString(8, "customer");
			return ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}
	
	public int checkLogin(String user1,String pass)
	{
		try
		{
			con=Resource.getConnection();
			ps=con.prepareStatement("select username,password,user from customer1");
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(user1.equals(rs.getString(3)) && pass.equals(rs.getString(2)))
				{
					return 2;
				}
				else if(user1.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
					return 1;
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}

}
