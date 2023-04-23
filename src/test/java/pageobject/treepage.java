package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class treepage {
	WebDriver driver;
	public treepage(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(d, this);
		
	    }
	
	@FindBy(xpath="//h5[contains(text(), 'Tree')]/following::a[1]")WebElement butnTreeGetStart;
	@FindBy(linkText="Overview of Trees")WebElement tlinktxt1;
	@FindBy(xpath="//div[@id='content']/li[2]/a")WebElement tlinktxt2;
	@FindBy(xpath="//div[@id='content']/li[3]/a")WebElement tlinktxt3;
	@FindBy(xpath="//div[@id='content']/li[4]/a")WebElement tlinktxt4;
	@FindBy(xpath="//div[@id='content']/li[5]/a")WebElement tlinktxt5;
	@FindBy(xpath="//div[@id='content']/li[6]/a")WebElement tlinktxt6;
	@FindBy(xpath="//div[@id='content']/li[7]/a")WebElement tlinktxt7;
	@FindBy(xpath="//div[@id='content']/li[8]/a")WebElement tlinktxt8;
	@FindBy(xpath="//div[@id='content']/li[9]/a")WebElement tlinktxt9;
	@FindBy(xpath="//div[@id='content']/li[10]/a")WebElement tlinktxt10;
	@FindBy(xpath="//div[@id='content']/li[11]/a")WebElement tlinktxt11;
	@FindBy(xpath="//div[@id='content']/li[12]/a")WebElement tlinktxt12;
	@FindBy(xpath="//div[@id='content']/li[13]/a")WebElement tlinktxt13;
	@FindBy(xpath="//div[2]/div/div[2]/a")WebElement btntryhere;
	@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")WebElement treetxtarea;
	@FindBy(xpath="//button[contains(text(),'Run')]")WebElement btnrun;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/a")WebElement dsMenu;
	@FindBy(xpath="//div[@id='navbarCollapse']/div[1]/div/div/a[1]")WebElement selectArray;
	
	
	public void clickTreeGetStartButn() {
		butnTreeGetStart.click();
	}
	public void clickTLinkTxt1() {
		tlinktxt1.click();
	}
	public void clickTLinkTxt2() {
		tlinktxt2.click();
	}
	public void clickTLinkTxt3() {
		tlinktxt3.click();
	}
	public void clickTLinkTxt4() {
		tlinktxt4.click();
	}
	public void clickTLinkTxt5() {
		tlinktxt5.click();
	}
	public void clickTLinkTxt6() {
		tlinktxt6.click();
	}
	public void clickTLinkTxt7() {
		tlinktxt7.click();
	}
	public void clickTLinkTxt8() {
		tlinktxt8.click();
	}
    public void clickTLinkTxt9() {
		tlinktxt9.click();
	}
    public void clickTLinkTxt10() {
		tlinktxt10.click();
	}
    public void clickTLinkTxt11() {
		tlinktxt11.click();
	}
    public void clickTLinkTxt12() {
		tlinktxt12.click();
	}
    public void clickTLinkTxt13() {
		tlinktxt13.click();
	}
    public void clickTreeTryHereBtn() {
	    btntryhere.click();
	}
	public void clickRunBtn() {
		btnrun.click();
	}
	public void navigation() {
		dsMenu.click();
		selectArray.click();
	}
}
