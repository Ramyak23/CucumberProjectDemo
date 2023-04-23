package stepsdef;

import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageobject.linkedlistpage;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class linkedliststeps {

	
	 WebDriver driver = DriverManager.driverFactory();
	 linkedlistpage llp = new linkedlistpage(driver);
	 
	 
	@Given("User click Introduction link in LinkedList home page")
	public void user_click_introduction_link_in_linked_list_home_page() {
		LoggerLoad.info("Validating Linked List Page");
	   llp.clickLLLinkTxt1();
	}

	@Given("User click Creating Linked LIst link")
	public void user_click_creating_linked_l_ist_link() {
	    llp.clickLLLinkTxt2();
	}

	@Given("User click Types of Linked List link")
	public void user_click_types_of_linked_list_link() {
	    llp.clickLLLinkTxt3();
	}

	@Given("User click Implement Linked List in Python link")
	public void user_click_implement_linked_list_in_python_link() {
	    llp.clickLLLinkTxt4();
	}

	@Given("User click Traversal link")
	public void user_click_traversal_link() {
	    llp.clickLLLinkTxt5();
	}

	@Given("User click Insertion link")
	public void user_click_insertion_link() {
	    llp.clickLLLinkTxt6();
	}

	@Given("User click Deletion link")
	public void user_click_deletion_link() {
	    llp.clickLLLinkTxt7();
	}
    
	@Then("User navigated back to tryEditor page and enters the wrong Python code")
	public void user_navigated_back_to_try_editor_page_and_enters_the_wrong_python_code(DataTable table) {
		llp.clickLLTryHereBtn();
		Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	}

	@Then("Again clicks Run button and gets popup error message")
	public void again_clicks_run_button_and_gets_popup_error_message() throws InterruptedException {
		    llp.clickRunBtn();
		    Thread.sleep(1000);
			//Handle Alerts 
		    Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept(); 
			driver.navigate().back();
	}
	@Then("User navigated to Tree module")
	public void user_navigated_to_tree_module() {
	    llp.navigation();
	}


}
