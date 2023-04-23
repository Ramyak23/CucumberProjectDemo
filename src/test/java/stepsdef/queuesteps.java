package stepsdef;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageobject.queuepage;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class queuesteps {

	 WebDriver driver = DriverManager.driverFactory();
	 queuepage qp = new queuepage(driver);
	 
	 @Given("User click Implementation of Queue in Python link in Queue home page")
	 public void user_click_implementation_of_queue_in_python_link_in_queue_home_page() {
		 LoggerLoad.info("Validating Queue Page");
	     qp.clickqLinkTxt1();
	 }

	 @Given("Clicks Try Here button in that specific link page")
	 public void clicks_try_here_button_in_that_specific_link_page() {
	     qp.clickQueueTryHereBtn();
	 }

	 @Given("User click Implementation using collections.deque link")
	 public void user_click_implementation_using_collections_deque_link() {
	     qp.clickqLinkTxt2();
	 }

	 @Given("User click Implementation using array link")
	 public void user_click_implementation_using_array_link() {
	     qp.clickqLinkTxt3();
	 }

	 @Given("User click Queue Operations link")
	 public void user_click_queue_operations_link() {
	     qp.clickqLinkTxt4();
	 }

	 @Then("User navigated to Linked List module")
	 public void user_navigated_to_linked_list_module() {
	    qp.navigation();
	 }
}
