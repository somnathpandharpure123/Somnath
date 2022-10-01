package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.LoginOrSignupPage;
import Facebook.MessengerPage;
import Facebook.RoomPage;

public class VerifyReturntoMessenger {
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
		
		if(url1.equals("https://www.messenger.com/rooms") && Title1.equals("Messenger | Page Not Found"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
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
		
	
	}

}
