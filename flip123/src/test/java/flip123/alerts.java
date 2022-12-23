package flip123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alerts {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Actions act=new Actions(wd);
		 wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/browser-windows");// window open
		Robot rb=new Robot();
		wd.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_TAB);
//		WebElement A=wd.findElement(By.id("windowButton"));
		for(int i=0;i<3;i++) {
			Set<String>allwindow=wd.getWindowHandles();// getting all the id's
			System.out.println(allwindow.size());//how many id's 
			System.out.println(allwindow);
			
//			act.click(A).perform();
//			Thread.sleep(2000);
//			String parentwindow=wd.getWindowHandle();
//			System.out.println(parentwindow);
			
			
			
			
//			wd.findElement(By.id("tabButton")).click();
//			rb.keyPress(KeyEvent.VK_CONTROL);
//			rb.keyPress(KeyEvent.VK_TAB);
//			wd.close();
				
		}

	}

}
