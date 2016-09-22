package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger firstNbr=new MyInteger(8);
	MyInteger SecondNbr=new MyInteger(9);
	MyInteger thirdNbr=new MyInteger(8);
	MyInteger fourthNbr=new MyInteger(7);
	MyInteger sixNbr=new MyInteger(1);
	
	@Test
	public void test() {

		
		
		
		//First set
		assertTrue(firstNbr.isEven());
		assertFalse(SecondNbr.isEven());
		
		assertFalse(firstNbr.isOdd());
		assertTrue(SecondNbr.isOdd());
		

		assertTrue(sixNbr.isPrime());
		assertTrue(fourthNbr.isPrime());
		assertFalse(firstNbr.isPrime());
		assertFalse(SecondNbr.isPrime());
		
	}
	
	@Test
	public void test2(){
		
		
		//Second set
		assertTrue(MyInteger.isEven(8));
		assertFalse(MyInteger.isEven(9));
		
		
		assertFalse(MyInteger.isOdd(8));
		assertTrue(MyInteger.isOdd(9));
		
		assertTrue(MyInteger.isPrime(1));
		assertTrue(MyInteger.isPrime(7));
		assertFalse(MyInteger.isPrime(8));
		assertFalse(MyInteger.isPrime(9));
		
	}
	
	@Test
	public void test3(){
		
		
		// Third set
		
		assertTrue(MyInteger.isEven(firstNbr));
		assertFalse(MyInteger.isEven(SecondNbr));
		
		
		assertFalse(MyInteger.isOdd(firstNbr));
		assertTrue(MyInteger.isOdd(SecondNbr));
		
		assertTrue(MyInteger.isPrime(sixNbr));
		assertTrue(MyInteger.isPrime(fourthNbr));
		assertFalse(MyInteger.isPrime(firstNbr));
		assertFalse(MyInteger.isPrime(SecondNbr));
		
		
	}
	
	@Test
	public void test4(){
		
		// Method equrals
		assertTrue(firstNbr.equals(firstNbr));
		assertTrue(SecondNbr.equals(SecondNbr));
		assertTrue(thirdNbr.equals(thirdNbr));
		assertFalse(thirdNbr.equals(sixNbr));
		
		
		assertEquals(firstNbr.getiValue(),8);
		assertEquals(SecondNbr.getiValue(),9);
		assertEquals(thirdNbr.getiValue(),8);
	
		
		
	}
	
	

}
