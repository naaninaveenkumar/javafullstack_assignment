package daolayer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import resource.DbConnection;

public class ProductDao {
	DbConnection dc=new DbConnection();
	 List<Product> ll=new ArrayList<>();
	 Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public int addProductDao(Product p)
	{
		int res=0;
		try {
			
			con = DbConnection.getConnect();
			ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPname());
			ps.setFloat(3, p.getPprice());
			ps.setDate(4, Date.valueOf(p.getStoredate()));
			res=ps.executeUpdate();
			return res;
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return 0;
		
		}
	public int deleteProductDao(int id)
	{
		int res;
		try {
		con = DbConnection.getConnect();
		ps=con.prepareStatement("delete from product where pid=?");
		ps.setInt(1, id);
		res=ps.executeUpdate();
		return res;
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return 0;
	}
	public int updateProductDao(int id,float price)
	{
		int res;
		try {
		con = DbConnection.getConnect();
		ps=con.prepareStatement("update product set pprice=? where pid=?");
		ps.setFloat(1, price);
		ps.setInt(2, id);
		res=ps.executeUpdate();
		return res;
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
		return 0;
	}
	public List<Product> getDetails()
	{
		try {
			con = DbConnection.getConnect();
			ps = con.prepareStatement("select * from product");
			rs = ps.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPprice(rs.getFloat(3));
				p.setStoredate(rs.getDate(4).toLocalDate());     
				ll.add(p);
				
			}
		
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return ll;
			
		
	
	}
}
