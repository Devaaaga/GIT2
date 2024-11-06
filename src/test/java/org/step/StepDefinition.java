package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
@Given("User Have To Launch The Facebook Application Through Chrome Browser")
public void user_Have_To_Launch_The_Facebook_Application_Through_Chrome_Browser() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
    
}

@Given("User Have To Maximize The Window")
public void user_Have_To_Maximize_The_Window() {
	driver.manage().window().maximize();
    
}

@When("User Have To Enter The valid username and Invalid password")
public void user_Have_To_Enter_The_valid_username_and_Invalid_password(io.cucumber.datatable.DataTable dataTable) {
 Map<String,String> asMap = dataTable.asMap(String.class,String.class);
 driver.findElement(By.id("email")).sendKeys(asMap.get("username"));
 driver.findElement(By.name("pass")).sendKeys(asMap.get("password"));
 
	
   
}

@When("User Have To Click The Loginbutton")
public void user_Have_To_Click_The_Loginbutton() {
   
}

@Then("User Have To Close The Browser")
public void user_Have_To_Close_The_Browser() {
   
}

@When("User Have To Enter The Invalid Username and Invalid password")
public void user_Have_To_Enter_The_Invalid_Username_and_Invalid_password(io.cucumber.datatable.DataTable dataTable) {
List<Map<String, String>> asMaps = dataTable.asMaps();
Map<String, String> map = asMaps.get(0);
driver.findElement(By.id("email")).sendKeys(map.get("username"));
driver.findElement(By.name("pass")).sendKeys(map.get("password"));
	
    
}




@When("User Have To Enter The Invalid Username and valid PaSSword")
public void user_Have_To_Enter_The_Invalid_Username_and_valid_PaSSword(io.cucumber.datatable.DataTable dataTable) {
    
   List<Map<String, String>> asMaps = dataTable.asMaps();
   Map<String, String> map = asMaps.get(0);
   driver.findElement(By.id("email")).sendKeys(map.get("username"));
   driver.findElement(By.name("pass")).sendKeys(map.get("password"));
}
@When("User Have To pass the Invalid Username and Invalid Password")
public void user_Have_To_pass_the_Invalid_Username_and_Invalid_Password(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> asMaps = dataTable.asMaps();
	Map<String, String> map = asMaps.get(0);
	driver.findElement(By.id("email")).sendKeys(map.get("username"));
	driver.findElement(By.name("pass")).sendKeys(map.get("password"));
   
}

@When("User Have To Click The Login button")
public void user_Have_To_Click_The_Login_button() {
    
}



@When("User Have To pass The Invalid Username and valid Password")
public void user_Have_To_pass_The_Invalid_Username_and_valid_Password(io.cucumber.datatable.DataTable dataTable) {
	Map<String,String> asMap = dataTable.asMap(String.class,String.class);
	driver.findElement(By.id("email")).sendKeys(asMap.get("username"));
	driver.findElement(By.name("pass")).sendKeys(asMap.get("password"));
	
	
}

@When("User Have To pass the valid Username  and valid Password")
public void user_Have_To_pass_the_valid_Username_and_valid_Password(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> asMaps = dataTable.asMaps();
	Map<String, String> map = asMaps.get(0);

	driver.findElement(By.id("email")).sendKeys(map.get("username"));
	driver.findElement(By.name("pass")).sendKeys(map.get("password"));
}
	
	




@Then("User Have To Close the Chrome Browser")
public void user_Have_To_Close_the_Chrome_Browser() {
   
}
	@When("User Have To click forgotten password link")
	public void user_Have_To_click_forgotten_password_link() {
		
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	
	
	}

	@When("User Have To pass the values")
	public void user_Have_To_pass_the_values(io.cucumber.datatable.DataTable dataTable) {
	  Map<String,String> asMap = dataTable.asMap(String.class,String.class);
	  driver.findElement(By.id("identify_email")).sendKeys(asMap.get("emilid"));
	
	}

	@Then("User Have To close the browser")
	public void user_Have_To_close_the_browser() {
	    
	}

@When("User Have To click creat nuw ac button")
public void user_Have_To_click_creat_nuw_ac_button() {
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
}
	
   


@When("User Have To pass the vals")
public void user_Have_To_pass_the_vals(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	Thread.sleep(3000);
    Map<String,String> asMap = dataTable.asMap(String.class,String.class);
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(asMap.get("FName"));
    driver.findElement(By.name("lastname")).sendKeys(asMap.get("SName"));
}


    


@Then("User have To close the brosr")
public void user_have_To_close_the_brosr() {
    }


@Then("User Have To Close The Chrome Browser")
public void user_Have_To_Close_The_Chrome_Browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User Have To Click the Login button")
public void user_Have_To_Click_the_Login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("User Have To click The Loginbutton")
public void user_Have_To_click_The_Loginbutton() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


}









	
	