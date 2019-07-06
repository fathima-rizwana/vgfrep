package stepdefn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_2 {
	WebDriver driver;
	
	@Given("click on signin")
	public void click_on_signin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
		
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();    
	}

	@When("user enters uname {string}")
	public void user_enters_uname(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	  
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	   
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.name("Login")).click();
	   
	}

	@Then("verify successful login")
	public void verify_successful_login() {
		String title=driver.getTitle();
		 Assert.assertEquals("Home", title);
		 System.out.println("successful login");
	}
}
