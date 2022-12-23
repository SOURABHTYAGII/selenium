package sour1234;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_title {
	
	@Test
	WebDriver wd;

	public static void main(String[] args) {
		wd.get("https://www.flipkart.com/");
		String actualtitle=wd.getTitle();
		String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers";
		WebDriver wd = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		wd.manage().window().maximize();
	//	wd.get("https://www.flipkart.com/");
		//String actualtitle=wd.getTitle();
	Assert.	assertEquals(actualtitle, expectedtitle);
		

	}

}
