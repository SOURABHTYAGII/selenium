package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QA_slider {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Actions act=new Actions(wd);
		 wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/slider");// website open
		Robot rb=new Robot();
		Thread.sleep(3000);
		WebElement A=wd.findElement(By.xpath("(//*[@class=\'range-slider range-slider--primary\'])"));
		act.dragAndDropBy(A, 25, 70).perform();
		Thread.sleep(3000);
		wd.close();
		
		//wd.findElement(By.xpath("(//*[@class=\'rct-icon rct-icon-uncheck\'])")).click();
		
		
		
		/*rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		wd.findElement(By.id("item-3")).click();
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);*/
		
		
		

}
}
