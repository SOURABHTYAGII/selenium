package sour1234;

import org.testng.annotations.Test;

public class testsmoke {
	@Test(groups = "smoke",priority = 0)
	public void testcase1() {
		System.out.println("this is my first smoke test case");
	}
	@Test(groups="regression",priority=1)
	public void testcase2() {
		System.out.println("this is my first regression case");
	}
	@Test(groups="smoke",priority=2)
	public void testcase3() {
		System.out.println("this is my second smoke test case");
	}
}
