package testngsourabh;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class parlleltest1 {
	WebDriver wd;
	@Parameters("mybrowser")
	
 @BeforeTest
  public void beforeTest(String mybrowser) {
	 if(mybrowser.equalsIgnoreCase("Chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 wd =new ChromeDriver();
		
	 }
	 else if(mybrowser.equalsIgnoreCase("FireFox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 wd =new FirefoxDriver();
		
	 }
	 else if(mybrowser.equalsIgnoreCase("Safari"))
	 {
		 WebDriverManager.safaridriver().setup();
		 wd =new SafariDriver();
	 }
 }
  @Test
  public void Pair() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
	 Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Logout")).click();
	  Thread.sleep(3000);
	  wd.close();
	 
  }
  @AfterTest
  public void afterTest() {
  }
}

 
