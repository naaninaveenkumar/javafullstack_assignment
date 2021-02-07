package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import daolayer.ProductDao;

public class ProductDaoTest {
	static ProductDao pd;
	List<Product> ll=new ArrayList<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pd=new ProductDao();
		
	}

	@Test
	public void testAddproductDao() throws Exception {
		int res;
		try {
		Product p=new Product(2,"computer",30000,LocalDate.now());
		res=pd.addProductDao(p);
		assertEquals(1,res);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}



	@Test
	public void testDeleteProductDao()  {
		try {
			int res;
			int id=2;
			res=pd.deleteProductDao(id);
			assertEquals(1,res);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Test
	public void testUpdateProductDao()  {
		try {
			int res=0,id=1;
			float price=27000;
			res=pd.updateProductDao(id, price);
			assertEquals(1,res);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testGetDetails(){
		try {
			ll=pd.getDetails();
			Product p=ll.get(1);
			assertEquals(2,p.getPid());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
