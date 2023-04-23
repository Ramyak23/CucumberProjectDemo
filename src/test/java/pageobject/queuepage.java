package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class queuepage {
	WebDriver driver;
	public queuepage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	@FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement btnSignin;
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(xpath="//input[@type='submit']")WebElement btnLogin;
	@FindBy(xpath="//h5[contains(text(), 'Queue')]/following::a[1]")WebElement butnQueueGetStart;
	@FindBy(linkText="Implementation of Queue in Python")WebElement qlinktxt1;
	@FindBy(xpath="//div[@id=\"content\"]/li[2]/a")WebElement qlinktxt2;
	@FindBy(xpath="//div[@id=\"content\"]/li[3]/a")WebElement qlinktxt3;
	@FindBy(xpath="//div[@id=\"content\"]/li[4]/a")WebElement qlinktxt4;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
    @FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement qtxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/a")WebElement dsMenu;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/div/a[2]")WebElement selectLL;
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	public void clickBtnLogin() {
		btnLogin.click();
		}
    public void clickQueueGetStartButn() {
		butnQueueGetStart.click();
	}
	public void clickqLinkTxt1() {
		qlinktxt1.click();
	}
    public void clickqLinkTxt2() {
		qlinktxt2.click();
	}
    public void clickqLinkTxt3() {
		qlinktxt3.click();
	}
    public void clickqLinkTxt4() {
		qlinktxt4.click();
	}
    public void clickQueueTryHereBtn() {
	    btntryhere.click();
	}
	public void clickRunBtn() {
		btnrun.click();
	}
	public void navigation() {
		dsMenu.click();
		selectLL.click();
	}
}
