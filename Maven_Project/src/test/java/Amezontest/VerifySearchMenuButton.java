package Amezontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amezon.AmezonHomePage;

public class VerifySearchMenuButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/amezon/s?k=amezon");
		
		driver.manage().window().maximize();//To Maximize the Window
		
		AmezonHomePage amezonHomePage = new AmezonHomePage(driver);
		amezonHomePage.ClickonSearch();

}
}
