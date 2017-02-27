package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestEven() {
		MyInteger mint1 = new MyInteger(5);
		MyInteger mint2 = new MyInteger(4);
		MyInteger mint3 = new MyInteger(5);
		
		assertEquals(false, mint1.isEven());
		assertEquals(true, mint1.isOdd());
		assertEquals(true, mint1.isPrime());
		
		assertEquals(true, mint2.isEven());
		assertEquals(false, mint2.isOdd());
		assertEquals(false, mint2.isPrime());
		
		assertEquals(true, MyInteger.isEven(2));
		assertEquals(false, MyInteger.isEven(3));
		assertEquals(false, MyInteger.isOdd(2));
		assertEquals(true, MyInteger.isOdd(3));
		assertEquals(false, MyInteger.isPrime(4));
		assertEquals(true, MyInteger.isPrime(2));
		
		assertEquals(true, MyInteger.isEven(mint2));
		assertEquals(false, MyInteger.isEven(mint1));
		assertEquals(false, MyInteger.isOdd(mint2));
		assertEquals(true, MyInteger.isOdd(mint1));
		assertEquals(false, MyInteger.isPrime(mint2));
		assertEquals(true, MyInteger.isPrime(mint1));
		
		assertEquals(true, mint1.equals(5));
		assertEquals(false, mint1.equals(4));
		assertEquals(true, mint1.equals(mint3));
		assertEquals(false, mint1.equals(mint2));
	}

}
