package flip123;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver wd;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			 wd.navigate().to("https://www.flipkart.com/");
	  }// wd.findElement(By.xpath("//*[@class=\'\']")).click();
	  @Test(priority = 0)
	  public void Login() throws InterruptedException {
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class=\'_2KpZ6l _2doB4z\']")).click(); //Close Button//_2KpZ6l _2doB4z
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class=\'_1_3w1N\']")).click();//Login Button
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class=\'_2IX_2- VJZDxU\']")).sendKeys("9360949081");//PhoneNo
		  wd.findElement(By.xpath("//*[@class=\'_2IX_2- _3mctLh VJZDxU\']")).sendKeys("8248739335");//Password
		  wd.findElement(By.xpath("//*[@class=\'_2KpZ6l _2HKlqd _3AWRsL\']")).click();//Login BUtton
	  }
	  @Test(priority = 1)
	  public void Search() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'_3704LK\']")).click();//Search Bar
	  wd.findElement(By.xpath("//*[@class=\'_3704LK\']")).sendKeys("ball");//Search "Ball"
	  wd.findElement(By.xpath("//*[@class=\'L0Z3Pu\']")).click();//Click Search Button
		  }
	  @Test(priority = 2)
	  public void Ball() throws InterruptedException {
	  Thread.sleep(6000);
	  wd.findElement(By.xpath("//*[@class=\'_396cs4\']")).click();//Click FirstBAll
	 }
	  @AfterTest
	  public void afterTest()  {
		
	  }
	}
