package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datastructurepage {

	
	WebDriver driver;
	public datastructurepage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	@FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement btnSignin;
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(xpath="//input[@type='submit']")WebElement btnLogin;
	@FindBy(xpath="//h5[contains(text(), 'Data Structures-Introduction')]/following::a[1]")WebElement butnDSGetStart;
	@FindBy(linkText="Time Complexity")WebElement dslinktxt;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
    @FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement dstxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	public void setUserName(String uname) {
		txtUserName.clear();
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
		}
	public void clickDSGetStartButn() {
		butnDSGetStart.click();
	}
	public void clickDSLinkTxt() {
		dslinktxt.click();
	}
	public void clickDSTryHereBtn() {
	    btntryhere.click();
	}
	public void setCode(String code) {
		dstxtarea.sendKeys(code);
	}
	public void clickRunBtn() {
		btnrun.click();
	}
}
