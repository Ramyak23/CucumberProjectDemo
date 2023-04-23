package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedlistpage {

	WebDriver driver;
	public linkedlistpage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	@FindBy(xpath="//h5[contains(text(), 'Linked List')]/following::a[1]")WebElement butnLLGetStart;
	@FindBy(linkText="Introduction")WebElement LLlinktxt1;
	@FindBy(xpath="//div[@id='content']/li[2]/a")WebElement LLlinktxt2;
	@FindBy(xpath="//div[@id='content']/li[3]/a")WebElement LLlinktxt3;
	@FindBy(xpath="//div[@id='content']/li[4]/a")WebElement LLlinktxt4;
	@FindBy(xpath="//div[@id='content']/li[5]/a")WebElement LLlinktxt5;
	@FindBy(xpath="//div[@id='content']/li[6]/a")WebElement LLlinktxt6;
	@FindBy(xpath="//div[@id='content']/li[7]/a")WebElement LLlinktxt7;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement LLtxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/a")WebElement dsMenu;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/div/a[5]")WebElement selectTree;
	
	
	public void clickLLGetStartButn() {
		butnLLGetStart.click();
	}
	public void clickLLLinkTxt1() {
		LLlinktxt1.click();
	}
	public void clickLLLinkTxt2() {
		LLlinktxt2.click();
	}
	public void clickLLLinkTxt3() {
		LLlinktxt3.click();
	}
	public void clickLLLinkTxt4() {
		LLlinktxt4.click();
	}
	public void clickLLLinkTxt5() {
		LLlinktxt5.click();
	}
	public void clickLLLinkTxt6() {
		LLlinktxt6.click();
	}
	public void clickLLLinkTxt7() {
		LLlinktxt7.click();
	}
	public void clickLLTryHereBtn() {
		    btntryhere.click();
	}
	public void clickRunBtn() {
			btnrun.click();
	}
	public void navigation() {
		dsMenu.click();
		selectTree.click();
	}
}
