package stepsdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.registerpage;
import utilities.DriverManager;
import utilities.ConfigFileReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;


public class registersteps {

	 WebDriver driver = DriverManager.driverFactory();
	 registerpage rp = new registerpage(driver);
	
	@Given("User navigates to Register page")
	public void user_navigates_to_register_page() throws IOException {
		System.out.println("Validating DsAlgo Register Page");
  	    LoggerLoad.info("Validating DsAlgo Register Page");
  	    rp.clickhomeregbtn();
	}

	@When("User enters user data from given sheetname {string} and rownumber {int}")
	public void user_enters_user_data_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("src/test/resources/ExcelData/RegisterData.xlsx", sheetName);
		String username = testData.get(rowNumber).get("username");
		String password = testData.get(rowNumber).get("password");
		String confirmpassword = testData.get(rowNumber).get("confirmpassword");
		rp.setregdetails(username, password, confirmpassword);
		Thread.sleep(1000);
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() throws InterruptedException {
	    rp.clicksubmitregbutn();
	    Thread.sleep(1000);
	   	}

	@Then("User see an approriate message regarding password mismatch")
	public void user_see_an_approriate_message_regarding_password_mismatch() {
		    if(driver.getPageSource().contains("password_mismatch:")) {
		    	Assert.assertTrue(true);
		    }else {
		    	Assert.assertTrue(false);
		    }
	   
	   	}
	
	@When("User enters user data {string} {string} \"hello\"only in specific textbox by leaving other fields empty")
	public void user_enters_user_data_hello_only_in_specific_textbox_by_leaving_other_fields_empty(String string, String string2) {
	   rp.enterdataset1(string, string2);
	}

	@Then("It should display an error {string}")
	public void it_should_display_an_error(String expectedmsg) {
		
	    //String actualmsg = driver.findElement(By.name("username")).getAttribute("validationMessage");
	    //Assert.assertEquals(actualmsg, expectedmsg);
	    String actualmsg1 = driver.findElement(By.name("password1")).getAttribute("validationMessage");
		Assert.assertEquals(actualmsg1, expectedmsg);
		//String actualmsg2 = driver.findElement(By.name("password2")).getAttribute("validationMessage");
		//Assert.assertEquals(actualmsg2, expectedmsg);
		driver.get(ConfigFileReader.launchWebsite("dsAlgoURL"));
	}

	@When("User enters user data {string} {string} \"helloworld\"only in specific textbox by leaving other fields empty")
	public void user_enters_user_data_helloworld_only_in_specific_textbox_by_leaving_other_fields_empty(String string, String string2) {
		 rp.enterdataset2(string, string2);
	}

	@When("User enters user data {string} {string} \"\"only in specific textbox by leaving other fields empty")
	public void user_enters_user_data_only_in_specific_textbox_by_leaving_other_fields_empty(String string, String string2) {
	   rp.enterdataset3(string, string2);
	}
}
