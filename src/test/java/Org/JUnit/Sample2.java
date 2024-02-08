package Org.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class Sample2 {
	@Test
	public void tc01() {
		System.out.println("M21");
	}
	@Test
	public void tc02() {
		System.out.println("M22");
		Assert.assertTrue(false);
	}
	@Test
	public void tc03() {
		System.out.println("M23");
	}
}
