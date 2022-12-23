package mav;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
public class Flipkart {
	WebDriver wd;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		 wd=new ChromeDriver();
		 wd.navigate().to("https://www.google.co.in//");
		 wd.manage().window().maximize()
  }
  // wd.findElement(By.xpath("//*[@class=\'\']")).click();
  @Test(priority = 0)
 public void actions() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement link wd=wd.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
	  Thread.sleep(3000);
	  Actions act=new Actions(wd);
	  act.contextClick(null).build().perform();
	  
	 // Robor rb=new Robot();
	//  rb.keyPress(MenuKeyEvent)

	
  }
}
