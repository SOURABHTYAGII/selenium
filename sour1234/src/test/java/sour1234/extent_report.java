package sour1234;

import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class extent_report {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
	@Test
	//public void orangehrm() {
		//logger=extent.startTest("demo");
		//wd.get("https://opensource-demo.orangehrmlive.com/");
	//}
  @BeforeTest
   public void BT() {
	  extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/sourabh.html",true);// try to save the html file on test-output
			  extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));// try to load config. on src/test/java
			  WebDriverManager.chromedriver().setup();
			  wd=new ChromeDriver();
	  	
  }
  @Test
	public void orangehrm() throws InterruptedException {
		logger=extent.startTest("orangehrm");//this indicates that logger will have a influence on the test
		wd.get("https://opensource-demo.orangehrmlive.com/");
		logger.log(LogStatus.PASS, "web page has opened");
		Thread.sleep(3000);//in the report we will have a record of the steps performed
		
		String title=wd.getTitle();
		logger.log(LogStatus.PASS, "title");
		Thread.sleep(3000);
		
		Assert.assertEquals("demo", "demo");
		logger.log(LogStatus.PASS, "Assert passed");
		Thread.sleep(3000);
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		logger.log(LogStatus.PASS, "username Entered");
		Thread.sleep(3000);
		
		wd.findElement(By.name("password")).sendKeys("admin123");
		logger.log(LogStatus.PASS, "username Entered");
		Thread.sleep(3000);
		
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		logger.log(LogStatus.PASS, "login successfully");
		Thread.sleep(3000);
		wd.manage().window().maximize();
  }
 /* @Test(dependsOnMethods = "orangehrm")
	public void logout() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
	  logger.log(LogStatus.PASS, "drop down icon clicked successfully");
	  Thread.sleep(3000);
	  
	  wd.findElement(By.linkText("logout")).click();  
	  logger.log(LogStatus.PASS, "logout");
	  Thread.sleep(3000);*/
	  
  
  @AfterTest
	public void AT() {
	  extent.endTest(logger);// end the logger functions
	  
	  extent.flush();//it will push the all logger data on html report
	  
	  extent.close();// it will give end to the reports
	  
  }
  
  

}
