package Org.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day1 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
		
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void tc1() {
		System.out.println("M1");
	}
	@Test
	public void tc2() {
		System.out.println("M2");
	}
	

}
