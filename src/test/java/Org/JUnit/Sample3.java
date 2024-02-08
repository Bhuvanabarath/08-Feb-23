package Org.JUnit;

import org.junit.Ignore;
import org.junit.Test;

public class Sample3 {
	@Test
	public void tc01() {
		System.out.println("M31");
	}
	@Test
	public void tc02() {
		System.out.println("M32");
	}
	@Ignore
	@Test
	public void tc03() {
		System.out.println("M33");
	}
}
