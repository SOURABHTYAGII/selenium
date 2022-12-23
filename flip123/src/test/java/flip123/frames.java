package flip123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	WebDriver wd;
	@BeforeTest
	public void BT() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		 wd.navigate().to("https://demoqa.com/frames");
		 Thread.sleep(3000);
		
	}
	@Test
	public void frame() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)wd;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		List<WebElement> we = wd.findElements(By.tagName("iframe"));
		System.out.println(we.size());
		for(int i=0;i<8;i++)
		{
		String str =we.get(i).getAttribute("id");
		System.out.println(str);
		}
		wd.switchTo().frame("frame2");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	}
}
