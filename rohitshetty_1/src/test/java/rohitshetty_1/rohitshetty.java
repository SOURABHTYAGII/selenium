package rohitshetty_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rohitshetty {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Robot rb=new Robot();
		wd.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");// website open
		 wd.manage().window().maximize();
		 
		// radio button
		 wd.findElement(By.name("radioButton")).click();
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).click();
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[3]/input[1]")).click();
		 Thread.sleep(3000);
		 
		 // suggestion class example
		 wd.findElement(By.xpath("//input[@id='autocomplete']")).click();
    	rb.keyPress(KeyEvent.VK_R);
    	 Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_U);
    	 Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_S);
    	 Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_S);
    	 Thread.sleep(2000);
    	rb.keyPress(KeyEvent.VK_DOWN); 
    	rb.keyPress(KeyEvent.VK_DOWN); 
	    rb.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    
	    //Dropodown Example
	    wd.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	    Thread.sleep(3000);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_DOWN);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    
	    //Checkbox example
	    wd.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	    Thread.sleep(3000);
	    
	    //Open window
	    wd.findElement(By.xpath("//button[@id='openwindow']")).click();
	    Thread.sleep(3000);
	    Set<String> Handler= wd.getWindowHandles();
	   System.out.println(Handler);
	    
	    Iterator<String> iterator=Handler.iterator();
	    String parent=iterator.next();
	   System.out.println(parent);
	    
	    String child=iterator.next();
	    System.out.println(child);
	    
	   wd.switchTo().window(child);
	   wd.close();
	   
	   // new tab
	  Thread.sleep(3000);
	   wd.findElement(By.xpath("//a[@id='opentab']")).click();
	   Thread.sleep(2000);
	   String Maintab = wd.getWindowHandle();
	   System.out.println(Maintab);
	   for(String AnotherTab : wd.getWindowHandles())
	   {
	   System.out.println(AnotherTab);
	   if (!AnotherTab.equals(Maintab)) {
	   Thread.sleep(2000);
	   wd.switchTo().window(AnotherTab);
	   Thread.sleep(2000);
	   wd.close();
	   }
	   }
	   wd.switchTo().window(Maintab);
	   
	   //Switch to alerts
		 Thread.sleep(2000);
	     wd.findElement(By.xpath("//input[@id='name']")).sendKeys("sourabh");
		 Thread.sleep(2000);
	     wd.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	     Thread.sleep(2000);
	     Alert alt=wd.switchTo().alert();
	     System.out.println(alt.getText());
	     alt.accept();
	     //alt.dismiss();
	    
	 
	}

}
