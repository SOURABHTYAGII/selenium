package sour1234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterTest;

public class jseTest {
	WebDriver wd;
  @Test
  public void tc1() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('userName').value='sourabh'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('userEmail').value='sourabh@gmail.com'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('submit').click()");
	  Thread.sleep(3000);  
	 js.executeScript("history.go(0)");
	 // js.executeScript("window.history.forward(0)");
	  
	  
	  
	  js.executeScript("window.scrollBy(0,5OO)");
	  System.out.println(js.executeAsyncScript("return document.title"));
	  System.out.println(js.executeAsyncScript("return document.domain"));
	  System.out.println(js.executeAsyncScript("return document.documentElement.innerText"));
	  System.out.println(js.executeAsyncScript("return document.getElementById('submit').innerTextS"));
	  wd.findElement(By.id("submit")).click();
	  
	  // its replace webdriver to java script executor
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver wd= new ChromeDriver();
	  wd.get("https://demoqa.com/text-box");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
