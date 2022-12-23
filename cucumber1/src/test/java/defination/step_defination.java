package defination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defination {
	
	WebDriver wd;
	@Given("Enter User should be in login page")
	public void enter_user_should_be_in_login_page() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	@When("Enter the valid username {string}")
	public void enter_the_valid_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys(string);
	   
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String string) {
		wd.findElement(By.name("password")).sendKeys(string);
	   
	}
	@When("Click on login button")
	public void click_on_login_button() {
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	   
	}
	@Then("I should get the title of Orange hrm {string}")
	public void i_should_get_the_title_of_orange_hrm(String string) {
		Assert.assertEquals(wd.getTitle(),string);
		
	   
	}

}
