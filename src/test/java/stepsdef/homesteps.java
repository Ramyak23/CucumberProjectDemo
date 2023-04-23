package stepsdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.homepage;
import utilities.ConfigFileReader;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class homesteps {
    	
	 WebDriver driver = DriverManager.driverFactory();
	 homepage hp = new homepage(driver);
	 	
	 @Given("The user on home page")
	 public void the_user_on_home_page() {
		 LoggerLoad.info("*****Opening DsAlgo Portal*****");
		 LoggerLoad.info("Automating Home Page");
		 driver.get(ConfigFileReader.launchWebsite("dsAlgoURL"));
	 }
	 @When("The user clicks on Get Started button of Data Structures without login")
	 public void the_user_clicks_on_get_started_button_of_data_structures_without_login() {
	    hp.clickDSGetStartBtn();
	 }
	 @Then("The user get warning message {string}")
	 public void the_user_get_warning_message(String warningmsg) {
		   String actualwarnmsg=driver.findElement(By.xpath("//body/div[2]")).getText();
		   Assert.assertEquals(actualwarnmsg,warningmsg);
	 }
	 @Given("User clicks Data Structures dropdown menu")
	 public void user_clicks_data_structures_dropdown_menu() {
	     hp.clickDSMenu();
	 }
	 @Then("User should be able to see list of all the options in the dropdown")
	 public void user_should_be_able_to_see_list_of_all_the_options_in_the_dropdown() throws InterruptedException {
		 Thread.sleep(1000);
	 }
	 @Given("User clicks on Sign in link")
	 public void user_clicks_on_sign_in_link() {
	    hp.clickSigninBtn();
	 }
	 @Then("User should land in the Login page")
	 public void user_should_land_in_the_login_page() {
		    String title=driver.getTitle();
		    Assert.assertEquals("Login", title);
		    driver.navigate().back();
	 }
	 @Given("The user click Data Structures dropdown menu and select Arrays options")
	 public void the_user_click_data_structures_dropdown_menu_and_select_arrays_options() {
	     hp.clickDSArrayOption();
	 }
     @Given("User clicks on Register link")
	 public void user_clicks_on_register_link() {
	     hp.clickRegisterBtn();
	 }
	 @Then("User should land in the Register page")
	 public void user_should_land_in_the_register_page() {
		    String title=driver.getTitle();
		    Assert.assertEquals("Registration", title);
	 }
}
