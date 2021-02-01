package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Product;
import daolayer.Dao;

public class ProductService {
	 List<Product> l=new ArrayList<>();
	 Dao d=new Dao();
	 
     public int addProduct(Product q) throws Exception
     {
    	 int res;
    	 if(q.getPprice()>500)
    	 {
    		
    		res=d.addProductDao(q);
    		if(res>0)
    		{
    		return 1;
    		}
    		 else
        	 {
        		return 0; 
        	 }		 
    	 }
    	 else
    	 {
    		return 0; 
    	 }
    	  	 
     }
     public int update(int id,int price) throws Exception
		{
			int flag=0;
			flag=d.updateProductDao(id, price);
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
			flag=d.deleteProductDao(id);
			if(flag==1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		public List<Product> displayAll()
		{
			l=d.getDetails();
			return l;
		}
		public float retrieve(int id)
		{
			float price=d.getPrice(id);
			return price;
		}
		 public List<Product> getAllProductByNameAsc() {	
				l = d.getDetails();
				Collections.sort(l,(p1,p2)->p1.getPname().compareTo(p2.getPname()));
				return l;
			}
		 public List<Product> getAllProductByNameDesc() {	
				l = d.getDetails();
				Collections.sort(l,(p1,p2)->p2.getPname().compareTo(p1.getPname()));
				return l;
			} 
		 public List<Product> getAllProductByPriceAsc() {	
				l = d.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p1.getPprice()-p2.getPprice()));
				return l;
			}
		 public List<Product> getAllProductByPriceDesc() {	
			 l = d.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p2.getPprice()-p1.getPprice()));
				return l;
			} 
		 public List<Product> getAllProductByPidAsc() {	
			 l = d.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p1.getPid()-p2.getPid()));
				return l;
			}
		 public List<Product> getAllProductByPidDesc() {	
				l = d.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p2.getPid()-p1.getPid()));
				return l;
			}

}
