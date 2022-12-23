package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		 wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com");// website open
		Robot rb=new Robot();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
	wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click(); //elements
	Thread.sleep(2000);
	wd.findElement(By.xpath("(//*[@class=\'element-list collapse show\'])/ul[1]/li[1]")).click();// text box
	wd.findElement(By.xpath("(//*[@class=\' mr-sm-2 form-control\'])[1]")).sendKeys("Sourabh");//username
	Thread.sleep(2000);
	wd.findElement(By.id("userEmail")).sendKeys("mailatsourabh@gmail.com");// emailid 
	Thread.sleep(2000);
	wd.findElement(By.xpath("(//*[@class=\'form-control\'])[1]")).sendKeys("Delhi(NCR)");// address
	Thread.sleep(2000);
	wd.findElement(By.id("permanentAddress")).sendKeys("Roorkee(UK)");//permanent address
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	wd.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_PAGE_UP);
	Thread.sleep(2000);
	wd.findElement(By.id("item-3")).click();
	//wd.findElement(By.xpath("(//*[@class=\'element-list collapse show\'])ul[1]/li[4]")).click();
	Thread.sleep(2000);
	wd.findElement(By.id("edit-record-1")).click();//
	Thread.sleep(2000);
	wd.findElement(By.id("firstName")).clear();//first name 
	Thread.sleep(2000);
	wd.findElement(By.id("firstName")).sendKeys("Sourabh");//lastName
	Thread.sleep(2000);
	wd.findElement(By.id("lastName")).clear();
	Thread.sleep(2000);
	wd.findElement(By.id("lastName")).sendKeys("tyagi");
	Thread.sleep(2000);
	wd.findElement(By.id("userEmail")).clear();
	Thread.sleep(2000);
	wd.findElement(By.id("userEmail")).sendKeys("mailatsourabh@gmail.com");
	Thread.sleep(2000);
	wd.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	wd.findElement(By.xpath("(//*[@id=\'delete-record-1\'])")).click();
	Thread.sleep(2000);
	wd.close();
	
	
	
	/*wd.findElement(By.id("item-4")).click();
	Thread.sleep(3000);
	Actions act=new Actions(wd);
	WebElement yy=wd.findElement(By.id("doubleClickBtnull"));
	act.doubleClick().perform();
	wd.findElement(By.id("doubleClickBtn")).click();
	Thread.sleep(3000);*/
	}

}
