package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DbConnectionTest.class, ProductDaoTest.class, ProductServiceTest.class })
public class AllTests {

}