package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Product;
import daolayer.ProductDao;

public class ProductService {
		 ProductDao pd=new ProductDao();
		 
		 List<Product> l=new ArrayList<>();
		 Product p;
		
	
		public String addProduct(Product q) 
		 {
			 try {
				if(q.getPprice()<0) 
				 	{
						return "Price must be +ve";
					}
				 else if(q.getPprice()>0 && q.getPprice()<500) 
				 	{
						return "Minimum price must be > 500";
				 	}
				 else if(pd.addProductDao(q)>0) 
				 	{
						return "Record stored successfully";
					}
				 else
				 	{
						return "Record didn't store";
				 	}
			} catch (Exception e) {
				System.err.println(e.toString());
			}
			 return null;
		 }
		 public String updateProduct(int id,float price)
		 {
			 try {
				 if(price<0)
				 {
					return "price must be positive value"; 
				 }
			     else if(pd.updateProductDao(id,price)>0)
				 {
					 return "price updated";
				 }
				 else
				 {
					return "price not updated"; 
				 }
				 
			 }
			 catch (Exception e) {
				 System.err.println(e.toString()); 	
			 }
			 
			return null; 
		 }
		 public String deleteProduct(int pid)
		 {
			 try {
				 if(pd.deleteProductDao(pid)>0)
				 {
					 return "deleted successfully";
				 }
				 else
				 {
					 return "product details not deleted";
				 }
			 }
			 catch (Exception e) {
				 System.err.println(e.toString());
			}
			 return null;
		 }
		 public List<Product> displayAll()
		 {
			l=pd.getDetails();
			return l;
			 
		 }
		 public List<Product> getAllProductByNameAsc() {	
				l = pd.getDetails();
				Collections.sort(l,(p1,p2)->p1.getPname().compareTo(p2.getPname()));
				return l;
			}
		 public List<Product> getAllProductByNameDesc() {	
				l = pd.getDetails();
				Collections.sort(l,(p1,p2)->p2.getPname().compareTo(p1.getPname()));
				return l;
			} 
		 public List<Product> getAllProductByPriceAsc() {	
				l = pd.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p1.getPprice()-p2.getPprice()));
				return l;
			}
		 public List<Product> getAllProductByPriceDesc() {	
			 l = pd.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p2.getPprice()-p1.getPprice()));
				return l;
			} 
		 public List<Product> getAllProductByPidAsc() {	
			 l = pd.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p1.getPid()-p2.getPid()));
				return l;
			}
		 public List<Product> getAllProductByPidDesc() {	
				l = pd.getDetails();
				Collections.sort(l,(p1,p2)->(int)(p2.getPid()-p1.getPid()));
				return l;
			}

}
