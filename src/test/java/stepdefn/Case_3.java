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

public class Case_3 {
WebDriver driver;
@Given("user enters un and pwd")
public void user_enters_un_and_pwd() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click(); 
	
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).click();
	
}

@When("user enters the name of item {string}")
public void user_enters_the_name_of_item(String string) {
   driver.findElement(By.id("myInput")).sendKeys(string);
   
   
   
}

@When("user clicks on find details")
public void user_clicks_on_find_details() {
	Actions actions=new Actions(driver);
	   actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  // driver.findElement(By.xpath("/html/body/div[1]/form/input ")).click();
}

@Then("verify search engine")
public void verify_search_engine() {
	String actual=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4 ")).getText();
    Assert.assertEquals("Headphone", actual);
    System.out.println("successful search");
}

}
