package driven12;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class data {
	WebDriver wd;
	public String URL="https://opensource-demo.orangehrmlive.com/";
	public String username2, password2;
	@BeforeTest
	public void BT() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get(URL);
		Thread.sleep(3000);
	}
  @Test
  public void datadriven() throws IOException, InterruptedException {
	 
	  File excel =new File("C:\\Users\\soura\\Downloads\\Datadriven.xlsx");
	  FileInputStream fis = new FileInputStream(excel);
	  XSSFWorkbook book = new XSSFWorkbook(fis);
	  XSSFSheet sheet = book.getSheet("Sheet1");
	 
	  int rowcount = sheet.getLastRowNum();
	 
	  for(int i=0; i<=rowcount; i++) {
		 String username1 = sheet.getRow(i).getCell(0).getStringCellValue();
		 String password1 = sheet.getRow(i).getCell(1).getStringCellValue();
		 System.out.println("firstloop");
		 wd.findElement(By.name("username")).sendKeys(username1);
		 wd.findElement(By.name("password")).sendKeys(password1);
		 wd.findElement(By.xpath("//*[@type='submit']")).click();
		 Thread.sleep(3000);
		
          if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
			 Thread.sleep(1000);
			  wd.findElement(By.linkText("Logout")).click();
			  Thread.sleep(3000);
		 }
		
          else if(wd.findElement(By.xpath("//*[@class='oxd-alert-content oxd-alert-content--error']")).isDisplayed()) {
			 for(int j=i+1; j<rowcount; j++) {
				 username2 = sheet.getRow(j).getCell(0).getStringCellValue();
				 password2 = sheet.getRow(j).getCell(1).getStringCellValue();
				System.out.println("second loop");
				 wd.findElement(By.name("username")).sendKeys(username2);
				 wd.findElement(By.name("password")).sendKeys(password2);
				
				 wd.findElement(By.xpath("//*[@type='submit']")).click();
				 Thread.sleep(3000);
			
			 if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
				
				 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
				 Thread.sleep(1000);
				  wd.findElement(By.linkText("Logout")).click();
				  Thread.sleep(3000);
			 }
		 }
			
		 }
	  }
  }
  @AfterTest
	  public void teardown() {
	  wd.close();
	  
  }
  
}










