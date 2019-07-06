package stepdefn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_1 {

	WebDriver driver;
	
	@Given("opens TestMeApp")
	public void opens_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("the user clicks on signup page")
	public void the_user_clicks_on_signup_page() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    
	}
	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(string);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String string) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(string);
	}

	@When("user clicks on gender as female")
	public void user_clicks_on_gender_as_female() {
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().perform();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(string);
	}

	@When("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String string) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(string);
	}

	@When("user enters DOB as {string}")
	public void user_enters_DOB_as(String string) {
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(string);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(string);
	}

	@When("user selects security  question")
	public void user_selects_security_question() {
		Select qn=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		qn.selectByIndex(0);
	}

	@When("user enters Answer as {string}")
	public void user_enters_Answer_as(String string) {
	driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(string);
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}

	@Then("verify registration success")
	public void verify_registration_success() {
	 String title=driver.getTitle();
	 Assert.assertEquals("Login", title);
	 System.out.println("successful registration");
	}
	
}
