package operation;
import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import bean.Product;
import service.ProductService;
public class ProductOperation implements Serializable{
	public static void main(String[] args) throws Exception {
		ProductService ps = new ProductService();
		// TODO Auto-generated method stub
		int var;	
		do {
			
			ArrayList<Product> l=new ArrayList<Product>();
			//Product p;
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add\n2.Update\n3.Delete\n4.DisplayAll\n5.price using id\n6.exit");
			System.out.println("choose one option");
			var=sc.nextInt();
			switch(var) {
			case 1: System.out.println("enter product details id");
					int id3=sc.nextInt();
					sc.nextLine();
					System.out.println("enter product detail name");
					String pname=sc.nextLine();
					System.out.println("enter product details like price");
					int price=sc.nextInt();
					int q=ps.addproduct(id3,pname,price);
					if(q==1)
					{
						System.out.println("you are entering a duplicate id");
					}
					else
					{
						System.out.println("product added successfully");
						System.out.println("Object Serialized");
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
						System.out.println("Object Serialized");
					}
					else
					{
						System.out.println("product not found");
					}
					break;
			case 3: System.out.println("enter index value of product id to delete");
					int id1=sc.nextInt();
					int c=ps.delete(id1);
					if(c==1)
					{
						System.out.println("product deleted successfully");
						System.out.println("Object Serialized");
					}
					else
					{
						System.out.println("product not found");
					}
					break;
			case 4:System.out.println("products details");
			       l=ps.displayall();
			       for(Product a:l)
			       {
			    	   System.out.println(l.indexOf(a)+":"+ a);
			       }
			       try {
			   		FileInputStream fis = new FileInputStream("product1.txt"); 
			   			 ObjectInputStream ois = new ObjectInputStream(fis); 
			   			 Object obj = ois.readObject(); 
			   			 System.out.println("Object De-Seriliazed"); 
			   			 ois.close();
			   			 fis.close();
			   			} 
			       catch (Exception e) {
			   		System.err.println(e.toString());
			   		} 
			       break;
			case 5:System.out.println("enter product id to view the price");
			       int id2=sc.nextInt();
			       int d=ps.retrieve(id2);
			       if(d>0)
			       {
			    	   System.out.println("product price is "+d);   
			       }
			       else
			       {
			    	   System.out.println("product not found");
			       }
			       
			       break;
			case 6:System.exit(0);
			
			default: System.out.println("enter valid option");
			       
			
			}
					
		}while(var<=6);
	}
}

