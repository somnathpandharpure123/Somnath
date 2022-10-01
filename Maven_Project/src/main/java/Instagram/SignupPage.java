package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	//Variable Declaration
	
	@FindBy(xpath="//input[@name=\"emailOrPhone\"]")
	private WebElement MobileorEmail;
	
	@FindBy(xpath="//input[@name=\"fullName\"]")
	private WebElement FullName;
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement passward;
	
	@FindBy(xpath="(//button[@class=\"sqdOP  L3NKy   y3zKF     \"])[2]")
	private WebElement SignUp;
	
	//Variable Initialization
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use - WebElement Actions
	
	public void SendMobileorEmail()
	{
		MobileorEmail.sendKeys("8806009553");
	}
	
	public void SendFullName()
	{
		FullName.sendKeys("Somnath Pandharpure");
	}
	
	public void SendUserName()
	{
		UserName.sendKeys("pandharpure1234");
	}
	
	public void Sendpassward()
	{
		passward.sendKeys("Somnath@123");
	}
	
	public void clickonSignUp()
	{
		SignUp.click();
	}

}
