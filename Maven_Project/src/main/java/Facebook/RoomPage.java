package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomPage {
	
	// Variable Declaration
	
	@FindBy(xpath="//a[text()=' Return to messenger.com ']")
	private WebElement ReurntoMessenger;
	
	@FindBy(xpath="//a[text()=' Visit our help center ']")
	private WebElement VisitOurHelpCenter;
	
	//Variable Initialization
	
	public RoomPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use - WebElement Actions
	
	public void ClickonReurntoMessenger()
	{
		ReurntoMessenger.click();
	}
	
	public void ClickonVisitOurHelpCenter()
	{
		VisitOurHelpCenter.click();
	}

}
