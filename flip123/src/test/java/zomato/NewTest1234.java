package zomato;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest1234 {
 WebDriver wd;
  @BeforeTest 
  public void beforeTest() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  wd=new ChromeDriver();
	  wd.navigate().to("https://rahulshettyacademy.com/practice-project");
	WebElement we=  wd.findElement(By.linkText("More"));
	Actions act=new Actions(wd);
	Thread.sleep(3000);
	act.moveToElement(we).build().perform();
	 Robot rb=new Robot();
	// rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	 rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	 rb.keyPress(MenuKeyEvent.VK_PAGE_UP);
	// wd.findElement(By.xpath("//[*@class='nav-outer clearfix']/nav/div[2]/ul/li[1]")).click();//"//*[@class=\'_3704LK\']"
	 wd.findElement(By.xpath("//*[@class=\'_3704LK\']")).click();
	 Thread.sleep(7000);
  }
 @Test
  public void f() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
