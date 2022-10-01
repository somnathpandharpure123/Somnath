package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignupPage {
	
	//variable Declaration
	
	@FindBy(xpath = "//input[@id=\"email\"]") 
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id=\"pass\"]") 
	private WebElement Passward;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']") 
	private WebElement ForgotPassward;
	
	@FindBy(xpath = "//button[contains(@id,\"u_0_5_Ab\")]") 
	private WebElement Login;
	
	@FindBy(xpath = "//a[text()='Messenger']") 
	private WebElement Messenger;
	
	//variable Initilization
	
	public LoginOrSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//variable Use-WebElement Actions
	
	public void sendUsername() {
		Username.sendKeys("Somnath Mahadev Pandharpure");
	}
	
	public void sendPassward() {
		Passward.sendKeys("Somnath@123");
	}
	
	public void ClickonForgotPassward() {
		ForgotPassward.click();
	}
	
	public void ClickonLogin() {
		Login.click();
	}
	
	public void ClickonMessenger() {
		Messenger.click();
	}
	
	//OR
	
	/*public void LogintoPage() {
		Username.sendKeys("Somnath Mahadev Pandharpure");
		Passward.sendKeys("Somnath@123");
		ForgotPassward.click();
		Login.click();
		Messenger.click();*/

	}


