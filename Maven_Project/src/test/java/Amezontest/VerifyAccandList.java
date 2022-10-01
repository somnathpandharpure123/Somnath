package Amezontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amezon.AmezonHomePage;

public class VerifyAccandList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/amezon/s?k=amezon");
		
		driver.manage().window().maximize();//To Maximize the Window
		
		AmezonHomePage amezonHomePage1 = new AmezonHomePage(driver);
		amezonHomePage1.MoveonAccandList();
		
		Thread.sleep(3000);
		
		AmezonHomePage amezonHomePage2 = new AmezonHomePage(driver);
		amezonHomePage2.ClickonSignin();
		
		driver.navigate().back();
		}
}
