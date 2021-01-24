package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import bean.Product;

public class ProductService implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = -4048523558536427746L;
		ArrayList<Product> ll=new ArrayList<Product>();
		FileOutputStream fosd;
		ObjectOutputStream oos;
		Product p;
		
		
		
		public int addproduct(int id,String Pname,int price) throws Exception {
			int flag=0;
			try {
			for(Product p:ll)
			{
				if(id==p.getPid())
				{
					flag=1;
				}
			}
			}
			catch(Exception e)
			{
				System.err.println(e.toString());
			}
		   if(flag==0)		
				{
					try {
						p=new Product(id,Pname,price);
						ll.add(p);
						fosd =new FileOutputStream("product1.txt",true);
						oos=new ObjectOutputStream(fosd);
						oos.writeObject(p);
					} catch (Exception e) {
				
						System.err.println(e.toString());
					}
					return 0;
				}
		   else
		     {
			   return 1;
		   
			}
			
		}
		public int update(int id,int price) throws Exception
		{
			int flag=0;
			try {
			for(Product p:ll)
			{
				if(id==p.getPid())
				{
					flag=1;
					p.setPrice(price);
					fosd =new FileOutputStream("product1.txt",true);
					oos=new ObjectOutputStream(fosd);
					oos.writeObject(p);
				}
			}
			}
			catch(Exception e)
			{
				System.err.println(e.toString());
			}
			if(flag==1)		
				{
					
					return 1;
				}
			else
				return 0;
		}
		public int delete(int id) throws Exception
		{
			int flag=0;
			try {
			for(Product p:ll)
			{
				if(id==p.getPid())
				{
					flag=1;
					int x=ll.indexOf(p);
					ll.remove(x);
					fosd=new FileOutputStream("product1.txt",true);
					oos=new ObjectOutputStream(fosd);
					oos.writeObject(p);
					oos.close();
					fosd.close();
				}
			}
			}
			catch(Exception e)
			{
				System.err.println(e.toString());
			}
			if(flag==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		public ArrayList<Product> displayall()
		{
			return ll;
		}
		public int retrieve(int id)
		{
			for(Product p:ll)
			{
				if(id==p.getPid())
				{
					return p.getPrice();	
				}
			}
			return 0;
		}
		
}


