package stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Case_4 {
	WebDriver driver;
	int c;
	@Given("Alex has registered into TestMeApp")
	public void alex_has_registered_into_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click(); 
		
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("alex search for particular item like headphone")
	public void alex_search_for_particular_item_like_headphone() {
		driver.findElement(By.id("myInput")).sendKeys("head");
		Actions actions=new Actions(driver);
		   actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	   
	}

	@When("try to proceed to payment without adding any item to cart")
	public void try_to_proceed_to_payment_without_adding_any_item_to_cart() {
	  c=driver.findElements(By.partialLinkText("Cart")).size();
	}

	@Then("TestMeApp does not display cart icon")
	public void testmeapp_does_not_display_cart_icon() {
		//boolean c=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).size()!=0;
	  // System.out.println(c);
		if(c==0)
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
		driver.close();
	}

}
