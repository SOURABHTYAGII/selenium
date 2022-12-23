package testngsourabh;

import org.testng.annotations.Test;

import graphql.PublicApi;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class testngfilenew {
	WebDriver wd;
	public String URL1="https://demoqa.com/upload-download";
	public String URL2="https://demoqa.com/alerts";
	
  @BeforeTest(enabled = false)
  public void uploading() {
		wd.get(URL1);
		wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\soura\\OneDrive\\Pictures\\Screenshots");
	  
  }
  @Test(enabled = true)
  public void Alerts() throws InterruptedException {
	  wd.get(URL2);
	  wd.findElement(By.id("")).click();
	  Alert alt=wd.switchTo().alert();
	  Thread.sleep(3000);
	  alt.accept();
	  System.out.println("Alert" +alt.getText());
	  
	  wd.findElement(By.id("timeAlertButton")).click();
	  //wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebDriverWait wt= new WebDriverWait(wd, 180);
	  wt.until(ExpectedConditions.alertIsPresent());
	  alt.accept();
	  wd.findElement(By.id("confirmButton")).click();
	  
	  
	  
  }
  
 
  @Test
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
