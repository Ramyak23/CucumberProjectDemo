package stepsdef;

import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageobject.graphpage;
import utilities.DriverManager;
//import utilities.LoggerLoad;

public class graphsteps {

	 WebDriver driver = DriverManager.driverFactory();
	 graphpage gp = new graphpage(driver);
	 
	@Given("User clicks on Get Started button of Graph in home page")
	public void user_clicks_on_get_started_button_of_graph_in_home_page() {
		//LoggerLoad.info("****Validating Graph Page****");
		gp.clickGraphGetStartButn();
	}

	@When("User click Graph link in Graph home page")
	public void user_click_graph_link_in_graph_home_page() {
	    gp.clickGraphLinkTxt();
	}

	@Then("Clicks Try Here button in Graph page")
	public void clicks_try_here_button_in_graph_page() {
	    gp.clickGraphTryHereBtn();
	}

	@Then("User navigated to tryEditor page and enters the Python code")
	public void user_navigated_to_try_editor_page_and_enters_the_python_code(DataTable table) {
		Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	}

	@Then("Clicks Run button and gets the respected output")
	public void clicks_run_button_and_gets_the_respected_output() throws InterruptedException {
	    gp.clickRunBtn();
	    Thread.sleep(1000);
	    driver.navigate().back();
	 	}

	
	@Then("User navigated to tryEditor page and enters the incorrect Python code")
	public void user_navigated_to_try_editor_page_and_enters_the_incorrect_python_code(DataTable table) {
	    Map<String,String> map= table.asMap(String.class,String.class);
	    driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea")).sendKeys(map.get("pythoncode"));
	}

	@Then("Clicks Run button and gets popup error message")
	public void clicks_run_button_and_gets_popup_error_message() throws InterruptedException {
	    gp.clickRunBtn();
	    Thread.sleep(1000);
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		driver.navigate().back();
	}

	@Given("User click Graph Representation link")
	public void user_click_graph_representation_link() {
	   gp.clickGraphRepLinkTxt();
	}

	@Then("Clicks Try Here button in Graph Representation page")
	public void clicks_try_here_button_in_graph_representation_page() {
	    gp.clickGraphTryHereBtn();
	}

	
}
