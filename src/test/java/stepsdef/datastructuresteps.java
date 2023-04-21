package stepsdef;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.datastructurepage;
import utilities.DriverManager;
//import utilities.LoggerLoad;

public class datastructuresteps {

	 WebDriver driver = DriverManager.driverFactory();
	 datastructurepage dsp = new datastructurepage(driver);
	

	@Given("User clicks on Get Started button of Data Structures-Introduction tab")
	public void user_clicks_on_button_of_data_structures_introduction_tab() {
		System.out.println("Validating DataStructures Module");
		//LoggerLoad.info("********Data Structures-Introduction********");
	    dsp.clickDSGetStartButn();
	}

	@When("User click time complexity link in data structures page")
	public void user_click_time_complexity_link_in_data_structures_page() {
	   dsp.clickDSLinkTxt();
	}

	@When("User clicks Try Here button in time complexity page")
	public void user_clicks_try_here_button_in_time_complexity_page() {
	   dsp.clickDSTryHereBtn();
	}

	@Then("User navigated to tryEditor page and enters the Python code as {string}")
	public void user_navigated_to_try_editor_page_and_enters_the_python_code_as(String printcode) {
	    dsp.setCode(printcode);
	}

	@Then("Clicks Run button and gets the output")
	public void clicks_run_button_and_gets_the_output()  {
	    dsp.clickRunBtn();
	    driver.navigate().back();
	  	}
	
	@Then("User navigated to tryEditor page and enters the incorrect Python code syntax as {string}")
	public void user_navigated_to_try_editor_page_and_enters_the_incorrect_python_code_syntax_as(String wrngcode) {
		dsp.setCode(wrngcode);
	}

	@Then("Clicks Run button and gets the popup error message")
	public void clicks_run_button_and_gets_the_popup_error_message() {
		dsp.clickRunBtn();
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'NumpyNinja')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	}

}
