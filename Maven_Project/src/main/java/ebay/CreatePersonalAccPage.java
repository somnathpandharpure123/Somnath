package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePersonalAccPage {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@id=\"personalaccount-radio\"]")
	private WebElement PersonalAccount;
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement Passward;
	
	@FindBy(xpath="//button[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	private WebElement Register;
	
	//Variable Initialization
	
	public CreatePersonalAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use-WebElement Actions
	
	public void clickonPersonalAccount()
	{
		PersonalAccount.click();
	}
	
	public void sendFirstName()
	{
		FirstName.sendKeys("Somnath");
	}
	
	public void sendLastName()
	{
		LastName.sendKeys("Pandharpure");
	}
	
	public void sendEmail()
	{
		Email.sendKeys("pandharpure21@gmail.com");
	}
	
	public void sendPassward()
	{
		Passward.sendKeys("Somnath@123");
	}
	
	public void clickonRegister()
	{
		Register.click();
	}

}
