package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class widge {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	Robot rb = new Robot();
	wd.get("https://demoqa.com/accordian");
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_DOWN);
	wd.findElement(By.id("section1Heading")).click();
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_DOWN);
	System.out.println("paas1");
	wd.findElement(By.id("section2Heading")).click();
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	System.out.println("paas2");
	/*wd.findElement(By.id("section3Heading")).click();
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_DOWN);
	System.out.println("paas3");*/
	
	
	wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();

}
}
