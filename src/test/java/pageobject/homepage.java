package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	public homepage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }

	@FindBy(xpath="//button[contains(text(),'Get Started')]")WebElement btnGetStart;
	@FindBy(xpath="//div[1]/a[contains(text(),'Get Started')]")WebElement btnDSGetStart;
	@FindBy(xpath="//div[@id=\"navbarCollapse\"]/div[1]/div/a")WebElement dsMenu;
	@FindBy(xpath="//div[@class='dropdown-menu show']")WebElement dsMenuShow;
	@FindBy(xpath="//div[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")WebElement selectArrays;
	@FindBy(xpath="//a[contains(text(),' Register ')]")WebElement registerBtn;
	@FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement signinBtn;
	
	public void clickGetStartBtn() {
		btnGetStart.click();
	}
	
	public void clickDSGetStartBtn() {
		btnDSGetStart.click();
	}
	public void clickDSMenu() {
		dsMenu.click();
	}
	public void clickDSArrayOption() {
		selectArrays.click();
	}
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	public void clickSigninBtn() {
		signinBtn.click();
	}
}
	
