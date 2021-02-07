package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import service.ProductService;
import bean.Product;
import daolayer.ProductDao;


@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTestMock {
	
	@Mock
	ProductDao pd;				

	@InjectMocks
	ProductService ps;	
	
	static List<Product> l;
	Product p;
	
	//@Test
	public void testAddProduct() {
		Product p=new Product(1,"tv",1234,LocalDate.now());
		when(ps.addProduct(p)).thenCallRealMethod();
		assertEquals(ps.addProduct(p),"Record stored successfully");
	}

	@Test
	public void testUpdateProduct() throws Exception {
		when(ps.updateProduct(1, 21000)).thenCallRealMethod();
		assertEquals(ps.updateProduct(1, 21000),"price updated");
	}

	@Test
	public void testDeleteProduct() {
		when(ps.deleteProduct(1)).thenCallRealMethod();
		assertEquals(ps.deleteProduct(1),"deleted successfully");
	}

	@Test
	public void testDisplayAll() throws Exception {
		when(ps.displayAll()).thenCallRealMethod();
		assertEquals(ps.displayAll(),l);
		
	}

	//@Test
	public void testGetAllProductByNameAsc() throws Exception {
		
		when(l=ps.getAllProductByNameAsc()).thenCallRealMethod();
		assertEquals(ps.getAllProductByNameAsc(),l);
	}

	//@Test
	public void testGetAllProductByNameDesc() throws Exception{
		l = ps.getAllProductByNameDesc();
		Product p= l.get(0);
		assertEquals("tv", p.getPname());
	}

	
	//@Test
	public void testGetAllProductByPriceAsc() throws Exception {
		List<Product> l=ps.getAllProductByPriceAsc();
		Product p=l.get(0);
		assertEquals(27000.0,p.getPprice(),0.0f);
	}

	
	//@Test
	public void testGetAllProductByPriceDesc() throws Exception{
		List<Product> l=ps.getAllProductByPriceDesc();
		Product p=l.get(0);
		assertEquals(30000.0,(int)p.getPprice(),0.0f);
	}

	//@Test
	public void testGetAllProductByPidAsc()throws Exception {
		List<Product> l=ps.getAllProductByPidAsc();
		Product p=l.get(0);
		assertEquals(1,p.getPid());
	}
	//@Test
	public void testGetAllProductByPidDesc()throws Exception {
		List<Product> l=ps.getAllProductByPidDesc();
		Product p=l.get(0);
		assertEquals(2,p.getPid());
	}
}
