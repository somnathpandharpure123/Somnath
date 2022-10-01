package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Facebook.LoginOrSignupPage;
import Facebook.MessengerPage;
import Facebook.RoomPage;

public class TestNG {
	
	WebDriver driver;//Global Variable
	
	@BeforeClass
	public void LunchtheBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		
	}
	@BeforeMethod
	public void EnterURL() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		LoginOrSignupPage loginOrSignupPage = new LoginOrSignupPage(driver);
		loginOrSignupPage.ClickonMessenger();
	
		MessengerPage messengerPage = new MessengerPage(driver); //open Room Page
		messengerPage.ClickonRooms();
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		if(url1.equals("https://www.messenger.com/rooms") && Title1.equals("Messenger | Page Not Found"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	@Test
	public void ReturntoBackPage()
	{
		RoomPage roomPage = new RoomPage(driver);
		roomPage.ClickonReurntoMessenger();	  //Return to back Page
		
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		
		if(url2.equals("https://www.messenger.com/") && Title2.equals("Messenger"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("Return to Back Page");
	}
	
	@Test
	public void test2()
	{
		RoomPage roomPage = new RoomPage(driver);
		roomPage.ClickonVisitOurHelpCenter();	  //Return to back Page
		
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		
		if(url3.equals("https://www.messenger.com/help") && Title3.equals("Messenger Help Centre"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
}
