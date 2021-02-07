package test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import resource.DbConnection;

public class DbConnectionTest {
 Connection con;
	@Test
	public void test() {
		Connection res = DbConnection.getConnect();
		assertNotNull(res);
	}

}
