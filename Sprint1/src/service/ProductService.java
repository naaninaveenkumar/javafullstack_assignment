package service;

import java.util.ArrayList;
import java.util.List;


import bean.Product;

public class ProductService{
		ArrayList<Product> ll=new ArrayList<Product>();	
		Product p;
		int i=0;
		
		
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
					p=new Product(id,Pname,price);
					ll.add(p);
					return 0;
				}
		   else {
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


