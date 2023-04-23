package stepsdef;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageobject.stackpage;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class stacksteps {
	
	 WebDriver driver = DriverManager.driverFactory();
	 stackpage sp = new stackpage(driver);
	 
	@Given("User click Operations in Stack link in Stack home page")
	public void user_click_operations_in_stack_link_in_stack_home_page() {
		LoggerLoad.info("Automating Stack Page");
	    sp.clickOSLinkTxt();
	}

	@Given("Clicks Try Here button in Operations in Stack page")
	public void clicks_try_here_button_in_operations_in_stack_page() {
	    sp.clickStackTryHereBtn();
	}

	@Given("User click Implementation link")
	public void user_click_implementation_link() {
	   sp.clickImpLinkTxt();
	}

	@Given("Clicks Try Here button in Implementation page")
	public void clicks_try_here_button_in_implementation_page() {
	   sp.clickStackTryHereBtn();
	}

	@Given("User click Applications link")
	public void user_click_applications_link() {
	   sp.clickAppLinkTxt();
	}

	@Given("Clicks Try Here button in Applications page")
	public void clicks_try_here_button_in_applications_page() {
	    sp.clickStackTryHereBtn();
	}

	@Then("User navigated to Queue module")
	public void user_navigated_to_queue_module() {
	    sp.navigation();
	}


}
