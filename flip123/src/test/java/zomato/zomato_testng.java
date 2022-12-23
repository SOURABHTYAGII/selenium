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

public class zomato_testng {
	WebDriver wd;
	  @BeforeTest
	 
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			 wd=new ChromeDriver();
			 wd.navigate().to("https://www.google.co.in//");
			 wd.manage().window().maximize();
	  }
	  // wd.findElement(By.xpath("//*[@class=\'\']")).click();
	  @Test(priority = 0)
	 public void actions() throws InterruptedException, AWTException {
		  Thread.sleep(3000);
		  WebElement link =wd.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		  Thread.sleep(3000);
		  Actions act=new Actions(wd);
		  act.contextClick(null).build().perform();
		  Robot rb=new Robot();
		 rb.keyPress(MenuKeyEvent.VK_DOWN);
		 rb.keyPress(MenuKeyEvent.VK_ENTER);
		 Thread.sleep(3000);
		 rb.keyPress(MenuKeyEvent.VK_CONTROL);
		 rb.keyPress(MenuKeyEvent.VK_TAB);
		 Thread.sleep(3000);
		 rb.keyPress(MenuKeyEvent.VK_CONTROL);
		 rb.keyPress(MenuKeyEvent.VK_TAB);
		 
	  }
	  @AfterTest
	  public void afterTest()  {
		
	  }
}