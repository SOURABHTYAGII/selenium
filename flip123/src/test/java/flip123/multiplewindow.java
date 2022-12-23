package flip123;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.RecvByteBufAllocator.Handle;

public class multiplewindow {
	WebDriver wd;
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver wd=new ChromeDriver();
		 wd.navigate().to("https://demoqa.com/browser-windows");
		 wd.manage().window().maximize();
		
		 String Parent=wd.getWindowHandle();
		 System.out.println(Parent);
		
		 for(int i=0;i<3;i++)
		 {
		 wd.findElement(By.id("windowButton")).click();
		 Thread.sleep(2000);
		 }
		 Set<String> all=wd.getWindowHandles();
		 System.out.println(all);
		 System.out.println(all.size());
		 String lastwindow="";
		 for(String Handle : all) {
			
		 wd.switchTo().window(Handle);
		 wd.get("https://www.google.com/");
		 lastwindow = Handle;
		
			 }
		 Thread.sleep(3000);
		 wd.switchTo().window(Parent);
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         wd.close();
         wd.switchTo().window(lastwindow);
         wd.get("https://mail.google.com/mail/");
		}
}