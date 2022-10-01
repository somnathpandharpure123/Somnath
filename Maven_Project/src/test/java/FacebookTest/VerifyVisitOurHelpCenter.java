package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.LoginOrSignupPage;
import Facebook.MessengerPage;
import Facebook.RoomPage;

public class VerifyVisitOurHelpCenter {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //Lunch the Browser
	
	driver.get("https://www.facebook.com/");//Open Facebook Link
	
	//click on messenger link
	
	LoginOrSignupPage loginOrSignupPage = new LoginOrSignupPage(driver);
	loginOrSignupPage.ClickonMessenger(); 
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
	if(url.equals("https://www.messenger.com/") && Title.equals("Messenger"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
		
	//Object of POM class(MessengerPage)
	
	MessengerPage messengerPage = new MessengerPage(driver); //open Room Page
	messengerPage.ClickonRooms();
	
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	
	String Title1 = driver.getTitle();
	System.out.println(Title1);
	
	if(url.equals("https://www.messenger.com/rooms") && Title.equals("Page Not Found"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	RoomPage roomPage = new RoomPage(driver);
	roomPage.ClickonVisitOurHelpCenter();	  //Return to back Page
	
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	
	String Title3 = driver.getTitle();
	System.out.println(Title3);
	
	if(url.equals("https://www.messenger.com/help") && Title.equals("Messenger Help Centre"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	

}
}



