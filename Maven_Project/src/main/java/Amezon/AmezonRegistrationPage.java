package Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmezonRegistrationPage {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@id=\"ap_customer_name\"]")
	private WebElement Your_Name;
	
	@FindBy(xpath="//input[@id=\"ap_phone_number\"]")
	private WebElement Mobile_No;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement Email_Optional;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	private WebElement Passward;
		
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement Continue;
	
	//Variable Initialization
	
	public AmezonRegistrationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	//Variable Use-WebElement Actions
	
	public void SendYourname()
	{
		Your_Name.sendKeys("Somnath Pandharpure");
	}
	
	public void SendMobileNo()
	{
		Mobile_No.sendKeys("8806009553");
	}
	
	public void SendEmail()
	{
		Email_Optional.sendKeys("pandharpure21@gmail.com");
	}
	
	public void SendPassward()
	{
		Passward.sendKeys("Somnath@123");
	}
	
	public void clickonContinue()
	{
		Continue.click();
	}
	

}
