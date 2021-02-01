package daolayer;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.Product;

public class Dao  {
	List<Product> ll=new ArrayList<>();
	
	
	public int addProductDao(Product p)
	{
		int r = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
			 PreparedStatement ps=con.prepareStatement("insert into product1 values(?,?,?)");
    		 int pid=p.getPid();
    		 String pname=p.getPname();
    		 float pprice=p.getPprice();
    		 ps.setInt(1,pid);
    		 ps.setString(2,pname);
    		ps.setFloat(3,pprice);
    		r=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return r;
		
		}
	
	public int deleteProductDao(int id)
	{
		int r;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
		PreparedStatement ps=con.prepareStatement("delete from product1 where pid=?");
		ps.setInt(1, id);
		r=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return 1;
	}
	public int updateProductDao(int id,float price)
	{
		int r;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
		PreparedStatement ps=con.prepareStatement("update product1 set pprice=? where pid=?");
		ps.setFloat(1, price);
		ps.setInt(2, id);
		r=ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return 1;
	}
	public List<Product> getDetails()
	{
		int r;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
			PreparedStatement ps = con.prepareStatement("select * from product1");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPprice(rs.getFloat(3));
				//p.setStoredate(rs.getDate(4).toLocalDate());     
				ll.add(p);
				
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return ll;
	
	}
	
	public float getPrice(int id)
	{
		float val = 0;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ink@2120");
			PreparedStatement ps = con.prepareStatement("select pprice from product1 where pid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			val=rs.getFloat(1);
			
			}
		 catch (Exception e) {
			 System.err.println(e.toString());
		 }
		return val;
				
	}
}
