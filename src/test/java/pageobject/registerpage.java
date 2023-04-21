package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {

	WebDriver driver;
	public registerpage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	
	@FindBy(xpath="//a[contains(text(),' Register ')]")WebElement btnRegister1;
	@FindBy(name="username")WebElement txtusername;
	@FindBy(name="password1")WebElement txtpwd1;
	@FindBy(name="password2")WebElement txtpwd2;
	@FindBy(xpath="//input[@type='submit']")WebElement btnRegister2;
	@FindBy(xpath="//body/div[3]")WebElement regwarnmsg;
	
	public void clickhomeregbtn() {
		btnRegister1.click();
	}
	public void setregdetails(String uname, String pwd1, String pwd2) {
		txtusername.sendKeys(uname);
		txtpwd1.sendKeys(pwd1);
		txtpwd2.sendKeys(pwd2);
	}
	public void clicksubmitregbutn() {
		btnRegister2.click();
	}
	public void enterdataset1(String pwd1, String pwd2) {
		txtpwd1.sendKeys(pwd1);
		txtpwd2.sendKeys(pwd2);
	}
	public void enterdataset2(String uname, String pwd2) {
		txtusername.sendKeys(uname);
		txtpwd2.sendKeys(pwd2);
		}
	public void enterdataset3(String uname, String pwd1) {
		txtusername.sendKeys(uname);
		txtpwd1.sendKeys(pwd1);
		}
}
