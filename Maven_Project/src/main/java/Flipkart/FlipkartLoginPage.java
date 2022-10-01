package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	
	//Variable Declaration
	
	@FindBy(xpath="(//input[@type=\"text\"])[6]")
	private WebElement EmailorMobileNo;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement Paasward;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement login;
	
	//Variable Initialization
	
	public FlipkartLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//variable Use-WebElement Actions
	
	public void sendEmailorMobileNo()
	{
		EmailorMobileNo.sendKeys("8806009553");
	}
	
	public void sendPaasward()
	{
		Paasward.sendKeys("Somnath@123");
	}
	
	public void Clickonlogin()
	{
		login.click();
	}


}
