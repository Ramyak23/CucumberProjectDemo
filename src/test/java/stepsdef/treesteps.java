package stepsdef;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pageobject.treepage;
import utilities.DriverManager;
import utilities.LoggerLoad;

public class treesteps {

	WebDriver driver = DriverManager.driverFactory();
	treepage tp = new treepage(driver);
	
	
	@Given("User click Overview of Trees link in Tree home page")
	public void user_click_overview_of_trees_link_in_tree_home_page() {
		LoggerLoad.info("Automating Tree Module");
	   tp.clickTLinkTxt1();
	}

	@Given("User click Terminologies link")
	public void user_click_terminologies_link() {
	    tp.clickTLinkTxt2();
	}

	@Given("User click Types of Trees link")
	public void user_click_types_of_trees_link() {
	    tp.clickTLinkTxt3();
	}

	@Given("User click Tree Traversals link")
	public void user_click_tree_traversals_link() {
	 tp.clickTLinkTxt4();   
	}

	@Given("User click Traversals-Illustration link")
	public void user_click_traversals_illustration_link() {
	    tp.clickTLinkTxt5();
	}

	@Given("User click Binary Trees link")
	public void user_click_binary_trees_link() {
	    tp.clickTLinkTxt6();
	}

	@Given("User click Types of Binary trees link")
	public void user_click_types_of_binary_trees_link() {
	    tp.clickTLinkTxt7();
		}

	@Given("User click Implementation in Python link")
	public void user_click_implementation_in_python_link() {
	   tp.clickTLinkTxt8();
	}

	@Given("User click Binary Tree Traversals link")
	public void user_click_binary_tree_traversals_link() {
	    tp.clickTLinkTxt9();
	}

	@Given("User click Implementation of Binary Trees link")
	public void user_click_implementation_of_binary_trees_link() {
	   tp.clickTLinkTxt10();
	}

	@Given("User click Applications of Binary trees link")
	public void user_click_applications_of_binary_trees_link() {
	    tp.clickTLinkTxt11();
	  	}

	@Given("User click Binary Search Trees link")
	public void user_click_binary_search_trees_link() {
	    tp.clickTLinkTxt12();
	}

	@Given("User click Implementation Of BST link")
	public void user_click_implementation_of_bst_link() {
	    tp.clickTLinkTxt13();
	}

	@Then("User navigated to Array module")
	public void user_navigated_to_array_module() {
	   tp.navigation();
	}


}
