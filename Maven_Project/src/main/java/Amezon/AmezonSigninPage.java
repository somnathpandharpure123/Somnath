package Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmezonSigninPage {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement EmailorMobileNo;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement Continue;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement Passward;
	
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement SignInSubmit;
	
	//Variable Initialization
	
	public AmezonSigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable use
	
	public void SendEmailorMobileNo()
	{
		EmailorMobileNo.sendKeys("8806009553");
	}
	
	public void ClickonContinue()
	{
		Continue.click();
	}
	
	public void SendPassward()
	{
		Passward.sendKeys("Somnath@1234");
	}
	
	public void ClickonSignInSubmit()
	{
		SignInSubmit.click();
	}
	
}
