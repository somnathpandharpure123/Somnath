package Adidas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasHomePage {
	
	//Variable Declaration
	
	@FindBy(xpath="//a[text()=\"sign up\"]")
	private WebElement Signup;
	
	@FindBy(xpath="//input[@id=\"registration-email-field\"]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id=\"registration-password-field\"]")
	private WebElement Passward;
	
	@FindBy(xpath="//span[text()='SHOW']")
	private WebElement Show;
	
	@FindBy(xpath="//input[@id=\"minimalRegistration-registration-ageconfirmation-field\"]")
	private WebElement FirstCheckBox;
	
	@FindBy(xpath="//input[@id=\"registration-newsletter-field\"]")
	private WebElement SecondCheckBox;
	
	@FindBy(xpath="//input[@id=\"registration-terms-field minimalRegistration\"]")
	private WebElement ThirdCheckBox;
	
	@FindBy(xpath="//span[text()=\"Register\"]")
	private WebElement Register;
	
	@FindBy(xpath="//span[text()=\"facebook\"]")
	private WebElement Facebook;

	 WebDriver driver;
	
	//Variable Initialization
	
	public AdidasHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Variable use
	
	public void ClickOnSignup()
	{
	Signup.click();
	}
	
	public void SendonEmail()
	{
		Email.sendKeys("pandharpure21@gmail.com");
	}
	
	public void SendonPassward()
	{
		Passward.sendKeys("Somnath@123");
	}
	
	public void ClickOnShow()
	{
		Show.click();
	}
	
	public void ClickOnFirststCheckBox()
	{
		FirstCheckBox.click();
	}
	
	public void ClickOnSecondstCheckBox()
	{
		SecondCheckBox.click();
	}
	
	public void ClickOnThirdCheckBox()
	{
		ThirdCheckBox.click();
	}
	
	public void ClickOnRegister()
	{
		Register.click();
	}
	
	public void ClickOnFacebook()
	{
		Facebook.click();
	}

}
