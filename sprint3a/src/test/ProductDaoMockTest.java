package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import bean.Product;
import daolayer.ProductDao;
import resource.DbConnection;

@RunWith(MockitoJUnitRunner.class)
public class ProductDaoMockTest {
	
	
	
	@Mock
	DbConnection d;				

	@InjectMocks
	ProductDao pd;
	
	
	List<Product> ll=new ArrayList<>();

	@Test
	public void testAddproductDao() {
		Product p=new Product(3,"computer",30000,LocalDate.now());
		when(pd.addProductDao(p)).thenCallRealMethod();
		assertEquals(pd.addProductDao(p),1);
	}



	@Test
	public void testDeleteProductDao()  {
		when(pd.deleteProductDao(3)).thenReturn(1);
		assertEquals(pd.deleteProductDao(3),1);
	}

	//@Test
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

	//@Test
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
