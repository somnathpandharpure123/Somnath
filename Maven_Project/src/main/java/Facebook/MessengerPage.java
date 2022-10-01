package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	//Variable Declaration
	
	@FindBy(xpath="//a[text()='Rooms']")
	private WebElement Rooms;
	
	@FindBy(xpath="//a[text()='Features']")
	private WebElement Features;
	
	@FindBy(xpath="//a[text()='Desktop app']")
	private WebElement DesktopApp;
	
	@FindBy(xpath="//a[text()='Privacy and safety']")
	private WebElement PrivacyandSafety;
	
	@FindBy(xpath="//a[text()='For developers']")
	private WebElement Fordevelopers;
	
	//variable Initialization
	
	public MessengerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Variable Use-Webelement Actions
	
	public void ClickonRooms()
	{
		Rooms.click();
	}
	
	public void ClickonFeatures()
	{
		Features.click();
	}
	
	public void ClickonDesktopApp()
	{
		DesktopApp.click();
	}
	
	public void ClickonPrivacyandSafety()
	{
		PrivacyandSafety.click();
	}
	
	public void ClickonFordevelopers()
	{
		Fordevelopers.click();
	}

}
