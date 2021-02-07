package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
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
	static List<Product> l;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 ps= new ProductService();
		l=new ArrayList<>();
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
		Product p=new Product(1,"tv",1234,LocalDate.now());
		res=ps.addProduct(p);
		assertEquals("Record stored successfully",res);
	}

	//@Test
	public void testUpdateProduct() throws Exception {
		String res;
		res=ps.updateProduct(1, 21000);
		assertEquals("price updated",res);
	}

	//@Test
	public void testDeleteProduct() {
		String res;
		res=ps.deleteProduct(10);
		assertEquals("deleted successfully",res);
	}

	@Test
	public void testDisplayAll() throws Exception {
		l=ps.displayAll();
		Product p=l.get(0);
		assertEquals(1,p.getPid());
		
	}

	@Test
	public void testGetAllProductByNameAsc() throws Exception {
		 l = ps.getAllProductByNameAsc();
		Product p= l.get(0);
		assertEquals("computer", p.getPname());
	}

	@Test
	public void testGetAllProductByNameDesc() throws Exception{
		l = ps.getAllProductByNameDesc();
		Product p= l.get(0);
		assertEquals("tv", p.getPname());
	}

	
	@Test
	public void testGetAllProductByPriceAsc() throws Exception {
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(27000.0,p.getPprice(),0.0f);
	}

	
	@Test
	public void testGetAllProductByPriceDesc() throws Exception{
		List<Product> l=ps.getAllProductByPriceDesc();
		Product p=l.get(0);
		assertEquals(30000.0,(int)p.getPprice(),0.0f);
	}

	@Test
	public void testGetAllProductByPidAsc()throws Exception {
		List<Product> l=ps.getAllProductByPidAsc();
		Product p=l.get(0);
		assertEquals(1,p.getPid());
	}
	@Test
	public void testGetAllProductByPidDesc()throws Exception {
		List<Product> l=ps.getAllProductByPidDesc();
		Product p=l.get(0);
		assertEquals(2,p.getPid());
	}
}
