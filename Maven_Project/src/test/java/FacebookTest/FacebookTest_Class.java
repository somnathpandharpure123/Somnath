package FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Facebook.LoginOrSignupPage;

public class FacebookTest_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			//object Create of LoginOrSignupPage
			
			/*LoginOrSignupPage loginOrSignupPage=new LoginOrSignupPage(driver);
			loginOrSignupPage.ClickonMessenger();
			
			String url=driver.getCurrentUrl();
			String Title = driver.getTitle();
			
			System.out.println(url);
			System.out.println(Title);*/
			
			Thread.sleep(3000);
			
			LoginOrSignupPage loginOrSignupPage = new LoginOrSignupPage(driver);
			loginOrSignupPage.sendUsername();
					
			
		
		
	}

}
