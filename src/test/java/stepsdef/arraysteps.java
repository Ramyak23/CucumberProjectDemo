package stepsdef;

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.arraypage;
import utilities.ConfigFileReader;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class arraysteps {

	WebDriver driver = DriverManager.driverFactory();
	arraypage ap = new arraypage(driver);
	
	@Given("User click Arrays in Python link in Array home page")
	public void user_click_arrays_in_python_link_in_array_home_page() {
		LoggerLoad.info("Validating Array module");
		//driver.findElement(By.xpath("//h5[contains(text(), 'Array')]/following::a[1]")).click();
			 ap.clickArrayLinkTxt1();
	}

	@Given("User click Arrays Using List link")
	public void user_click_arrays_using_list_link() {
	   ap.clickArrayLinkTxt2();
	}

	@Given("User click Basic Operations in Lists link")
	public void user_click_basic_operations_in_lists_link() {
	    ap.clickArrayLinkTxt3();
	}

	@Given("User click Applications of Array link")
	public void user_click_applications_of_array_link() {
	   ap.clickArrayLinkTxt4();
	}

	@Given("User click Practice Questions link")
	public void user_click_practice_questions_link() {
	    ap.clickArrayLinkTxt5();
	}

	@Then("User navigated to array practice page with respective four practice link")
	public void user_navigated_to_array_practice_page_with_respective_four_practice_link() {
		if(driver.findElement(By.xpath("//body/div[2][@class='list-group']")).isDisplayed()) {
	    	Assert.assertTrue(true);
	    }
	}

	@Given("User clicks Search the array practice link")
	public void user_clicks_search_the_array_practice_link() {
	   ap.clickArrayLinkTxt6();
	}
	
	@Then("User enters the Python code in the respective field")
	public void user_enters_the_python_code_in_the_respective_field(DataTable table) throws InterruptedException {
		Map<String,String> map= table.asMap(String.class,String.class);
		 WebElement txtfield=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.SHIFT).sendKeys(txtfield, "a").perform();
		 txtfield.sendKeys(Keys.DELETE);
		 txtfield.sendKeys(map.get("pythoncode"));
	     Thread.sleep(1000);
	}
	
	@Then("Clicks the Run button and gets the respected output")
	public void clicks_the_run_button_and_gets_the_respected_output() {
		ap.clickRunBtn();
		driver.navigate().back();
	}
	
	@Then("User validates with the wrong Python code")
	public void user_validates_with_the_wrong_python_code(DataTable table) throws InterruptedException {
		//driver.navigate().back();
	    ap.clickArrayLinkTxt6();
	    Map<String,String> map= table.asMap(String.class,String.class);
	    WebElement txtfield=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.SHIFT).sendKeys(txtfield, "a").perform();
		 txtfield.sendKeys(Keys.DELETE);
		 txtfield.sendKeys(map.get("pythoncode"));
	     Thread.sleep(1000);
	}
	
	@Then("Again click the Run button and gets popup error message")
	public void Again_click_the_Run_button_and_gets_popup_error_message() throws InterruptedException {
		ap.clickRunBtn();
	    Thread.sleep(1000);
		//Handle Alerts 
	    Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
	}
    @Then("User navigated to home page")
	public void user_navigated_to_home_page() {
		driver.get(ConfigFileReader.launchWebsite("dsAlgoURL"));
		String title=driver.getTitle();
	    Assert.assertEquals("Registration", title);
		LoggerLoad.info("Closing DsAlgo Portal Successfully");
		LoggerLoad.info("Closing Browser");
		driver.quit();
	}
	
	}
