package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class arraypage {

	WebDriver driver;
	public arraypage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	@FindBy(xpath="//h5[contains(text(), 'Array')]/following::a[1]")WebElement butnArrayGetStart;
	@FindBy(linkText="Arrays in Python")WebElement arraylinktxt1;
	@FindBy(xpath="//div[@id='content']/li[2]/a")WebElement arraylinktxt2;
	@FindBy(xpath="//div[@id='content']/li[3]/a")WebElement arraylinktxt3;
	@FindBy(xpath="//div[@id='content']/li[4]/a")WebElement arraylinktxt4;
	@FindBy(xpath="//div[@id='content']/a")WebElement arraylinktxt5;
	@FindBy(linkText="Search the array")WebElement arraylinktxt6;
	@FindBy(linkText="Max Consecutive Ones")WebElement arraylinktxt7;
	@FindBy(linkText="Find Numbers with Even Number of Digits")WebElement arraylinktxt8;
	@FindBy(xpath="//body/div[5]/a")WebElement arraylinktxt9;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement arraytxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	public void clickArrayGetStartButn() {
		butnArrayGetStart.click();
	}
	public void clickArrayLinkTxt1() {
		arraylinktxt1.click();
	}
	public void clickArrayLinkTxt2() {
		arraylinktxt2.click();
	}
	public void clickArrayLinkTxt3() {
		arraylinktxt3.click();
	}
	public void clickArrayLinkTxt4() {
		arraylinktxt4.click();
	}
	public void clickArrayLinkTxt5() {
		arraylinktxt5.click();
	}
	public void clickArrayLinkTxt6() {
		arraylinktxt6.click();
	}
	public void clickArrayLinkTxt7() {
		arraylinktxt7.click();
	}
	public void clickArrayLinkTxt8() {
		arraylinktxt8.click();
	}
	public void clickArrayLinkTxt9() {
		arraylinktxt9.click();
	}
	public void clickArrayTryHereBtn() {
	    btntryhere.click();
    }
    public void clickRunBtn() {
		btnrun.click();
    }

}
