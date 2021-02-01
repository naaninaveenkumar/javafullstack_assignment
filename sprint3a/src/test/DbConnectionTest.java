package test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import resource.DbConnection;

public class DbConnectionTest {

	@Test
	public void test() {
		Connection res = DbConnection.getConnect();
		assertEquals(null,res);
	}

}
