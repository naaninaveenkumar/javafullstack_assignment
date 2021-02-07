package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.Resource;

public class Dao {
	Resource r=new Resource();
	Connection con;
	PreparedStatement ps,ps1;
	public int addProduct(Product p) throws SQLException
	{
		con=Resource.getConnection();
		ps=con.prepareStatement("insert into product1 values(?,?,?,?,?)");
		ps.setInt(1, p.getPid());
		ps.setString(2, p.getPname());
		ps.setFloat(3, p.getPprice());
		ps.setInt(4, p.getQuantity());
		ps.setInt(5, 0);
		return ps.executeUpdate();
		
	}

	public List<Product> retrive() 
	{
		List<Product> lp=new ArrayList<Product>();
		try {
			con=Resource.getConnection();
			ps=con.prepareStatement("select * from product1");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPprice(rs.getFloat(3));
				p.setQuantity(rs.getInt(4));
				p.setOrdered(rs.getInt(5));
				lp.add(p);
			}
			
		} catch (SQLException e) {
			System.err.println(e.toString());
		}
		return lp;
	}
	
	public int deleteProduct(int pid) throws SQLException
	{
		con=Resource.getConnection();
		ps=con.prepareStatement("delete from product1 where pid=?");
		ps.setInt(1, pid);
		return ps.executeUpdate();
		
	}
	
	public int updateProduct(int pid,float price,int quantity) throws SQLException
	{
		con=Resource.getConnection();
		ps=con.prepareStatement("update product1 set pprice=?,quantity=? where pid=?");
		ps.setFloat(1, price);
		ps.setInt(2, quantity);
		ps.setInt(3, pid);
		return ps.executeUpdate();
		
	}
	
	public int orderProduct(int pid,int quantity) throws SQLException
	{
		int a=0,b=0;
		con=Resource.getConnection();
		
		ps=con.prepareStatement("select quantity,ordered from product1 where pid=?");
		ps.setInt(1, pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			a=rs.getInt(1);
			b=rs.getInt(2);
		}
		a=a-quantity;
		b=b+quantity;
		ps1=con.prepareStatement("update product1 set quantity=?,ordered=? where pid=?");
		ps1.setInt(1, a);
		ps1.setInt(2, b);
		ps1.setInt(3, pid);
		return ps1.executeUpdate();
	}
}
