package sour1234;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class Assertcondition {
  @Test(priority = 0)
  public void sourabh() {
	  AssertJUnit.assertEquals("sourabh1", "sourabh1");
	  System.out.println("this is first case");
  }
  @Test(priority = 1,dependsOnMethods = "sourabh")
  public void sourabh2() {
	  //AssertJUnit.assertEquals("sourabh3", "alibaba2");
	  System.out.println("this is second case");  
  }
  @Test(priority = 2,dependsOnMethods = "sourabh")
  public void sourabh4() {
	//  AssertJUnit.assertEquals("sourabh3", "alibaba2");
	  System.out.println("this is second case");  
  }
  @Test(priority = 3)
  public void sourabh5() {
	 
  }
	   

  @AfterTest
  public void afterTest() {
  }

}