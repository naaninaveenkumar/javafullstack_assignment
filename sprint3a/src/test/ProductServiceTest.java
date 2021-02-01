package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import service.ProductService;
import bean.Product;
public class ProductServiceTest {
	static ProductService ps;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 ps= new ProductService();
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ps = null;
		
	}
	@Before
	public void setUp() throws Exception {
		
	}
	@After
	public void tearDown() throws Exception {
		
	}
	//@Test
	public void testAddProduct() throws Exception {
		String res;
		Product p=new Product(10,"Smarttv",20000,LocalDate.now());
		res=ps.addProduct(p);
		assertEquals("Record stored successfully",res);
	}

	@Test
	public void testUpdateProduct() throws Exception {
		String res;
		res=ps.updateProduct(1, 21000);
		assertEquals("price updated",res);
	}

	@Test
	public void testDeleteProduct() {
		String res;
		res=ps.deleteProduct(1);
		assertEquals("deleted successfully",res);
	}

	//@Test
	public void testDisplayAll() throws Exception {
		List<Product> ll=ps.displayAll();
		Product p=ll.get(0);
		assertEquals(1,p.getPid());
		
	}

	//@Test
	public void testGetAllProductByNameAsc() throws Exception {
		List<Product> l = ps.getAllProductByNameAsc();
		Product p= l.get(0);
		assertEquals("computer", p.getPname());
	}

	//@Test
	public void testGetAllProductByNameDesc() throws Exception{
		List<Product> l = ps.getAllProductByNameAsc();
		Product p= l.get(0);
		assertEquals("tv", p.getPname());
	}

	//@Test
	public void testGetAllProductByPriceAsc() throws Exception {
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(1234,p.getPprice());
	}

	//@Test
	public void testGetAllProductByPriceDesc() throws Exception{
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(21000,p.getPprice());
	}

	//@Test
	public void testGetAllProductByPidAsc()throws Exception {
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(1,p.getPid());
	}
	//@Test
	public void testGetAllProductByPidDesc()throws Exception {
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(2,p.getPid());
	}
}
