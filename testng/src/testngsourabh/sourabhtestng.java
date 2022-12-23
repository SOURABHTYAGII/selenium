package testngsourabh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@Test (priority=0)
public class sourabhtestng {
	WebDriver wb;
	
	
	@BeforeTest 
	public void beforeTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		wb=new ChromeDriver();
		Robot rb =new Robot();
		wb.navigate().to("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);	
		//System.print("title");
		wb.getTitle();
		String ActualTitle=wb.getTitle();
		System.out.println(ActualTitle);
	}
	@Test (priority=1)
	public void login() throws InterruptedException, AWTException {
		Robot rb =new Robot();
		wb.findElement(By.name("username")).sendKeys("Admin");
		wb.findElement(By.name("password")).sendKeys("admin123");
		wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();// click on login
		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click(); // click on admin
		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[@class='oxd-select-text-input'][1]")).click();// user role
		Thread.sleep(3000);	
		WebElement selectrole=wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\']"));
		Select ur= new Select(selectrole);
		ur.selectByIndex(2);
		
		wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\']")).click();
		Thread.sleep(3000);		
		rb.keyPress(KeyEvent.VK_DOWN);
		wb.findElement(By.xpath("//*[@class=\'oxd-icon bi-trash'][5]")).click();
		Thread.sleep(3000);	
	
		
	}
		
	
		
		
	
	@AfterTest(enabled=true)
	public void afterTest() {
	wb.close();

}
}
