package operation;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import bean.Product;
import daolayer.Dao;
import service.ProductService;

public class ProductOperation {

	public static void main(String[] args) throws Exception {
		ProductService ps = new ProductService();
		Product p ;
		List<Product> l=new ArrayList<Product>();
		List<Product> ll=new ArrayList<Product>();
		Dao dao=new Dao();
		
		int var;	
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add\n2.Update\n3.Delete\n4.DisplayAll\n5.get price using id\n6.dispaly Products in low price\n7.dispaly Products in high price\n8.dispaly Products in asc of name\n9.dispaly Products in desc of name\n10 display products by id asc\n11.display product id by desc\n 12. exit");
			System.out.println("choose one option");
			var=sc.nextInt();
			switch(var) {
			case 1: System.out.println("enter product details id");
					p=new Product();
					p.setPid(sc.nextInt());
					sc.nextLine();
					System.out.println("enter product detail name");
					p.setPname(sc.nextLine());
					System.out.println("enter product details like price");
					p.setPprice(sc.nextInt());
					int q=ps.addProduct(p);
					if(q==0)
					{
						System.out.println("you are entering product price less than 500");
					}
					else
					{
						System.out.println("product added successfully");
					}
					break;
			case 2: System.out.println("enter product id ");
					int id=sc.nextInt();
					System.out.println("enter  price ");
					int price1=sc.nextInt();
					int b=ps.update(id, price1);
					if(b==1)
					{
						System.out.println("product updated successfully");
					}
					else
					{
						System.out.println("product not found");
					}
					break;
			case 3: System.out.println("enter product id to delete");
					int id1=sc.nextInt();
					int c=ps.delete(id1);
					if(c==1)
					{
						System.out.println("product deleted successfully");
					}
					else
					{
						System.out.println("product not found");
					}
					break;
			case 4:System.out.println("products details");
			       ll=ps.displayAll();
			       ll.stream().forEach(e->System.out.println("Id is "+e.getPid()+",Name is "+e.getPname()+", Price is "+e.getPprice()*.2+e.getPprice()));
			       ll.clear();
			       break;
			case 5:System.out.println("enter product id to view the price");
			       int id2=sc.nextInt();
			       float d1=ps.retrieve(id2);
			       if(d1>0)
			       {
			    	   System.out.println("product price is "+d1);   
			       }
			       else
			       {
			    	   System.out.println("product not found");
			       }
			       
			       break;
		   case 6:		l=ps.getAllProductByPriceAsc();
		   				System.out.println("ProductByPriceAsc\n");
		   		  		l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
		   		  		l.clear();
		   		  		break;
		   case 7:		l=ps.getAllProductByPriceDesc();
		   				System.out.println("ProductByPriceDesc\n");
		   				l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
		   				l.clear();
		   				break;
		   case 8:		l=ps.getAllProductByNameAsc();
		   				System.out.println("ProductByNameAsc\n");
		   				l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
		   				l.clear();
		   				break;
		   case 9:		l=ps.getAllProductByNameDesc();
		   				System.out.println("ProductByNameDesc\n");
		   				l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
		   				l.clear();
		   				break;
		   case 10:		l=ps.getAllProductByPidAsc();
		   				System.out.println("ProductByPidAsc\n");
   						l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
   						l.clear();
   						break;
			case 11:	l=ps.getAllProductByPidDesc();
						System.out.println("ProductByPidDesc\n");
   						l.stream().forEach(e->System.out.println("Id is "+e.getPid()+", Name is "+e.getPname()+", Price is "+e.getPprice()));
   						l.clear();
   						break;
			case 12:System.exit(0);			
			default: System.out.println("enter valid option");       
			
			}
					
		}while(var<=12);
	}

}
