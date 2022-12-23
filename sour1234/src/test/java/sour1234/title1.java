package sour1234;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class title1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			WebDriver wb=new ChromeDriver();
			wb.navigate().to("https://opensource-demo.orangehrmlive.com");
			wb.manage().window().maximize();
			Thread.sleep(5000);	
			WebElement we1=wb.findElement(By.xpath("//*[@class=\'oxd-input oxd-input--active\']"));
       // String Actual_Title=wb.getTitle();
      //  System.out.println(Actual_Title);
       Assert.assertEquals(true,we1.isDisplayed());
       System.out.println("passed");
       wb.close();
	}
	
}
