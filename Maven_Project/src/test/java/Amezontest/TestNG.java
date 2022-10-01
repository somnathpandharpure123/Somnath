package Amezontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amezon.AmezonHomePage;

public class TestNG {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.amazon.in/amezon/s?k=amezon");
	}
	
	@Test
	public void VerifyAccandList() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AmezonHomePage amezonHomePage1 = new AmezonHomePage(driver);
		amezonHomePage1.MoveonAccandList();
		
		AmezonHomePage amezonHomePage2 = new AmezonHomePage(driver);
		amezonHomePage2.ClickonSignin();
		
		driver.navigate().back();
	}
	@Test
	public void VerifyAmezonLogo()
	{
		AmezonHomePage amezonHomePage = new AmezonHomePage(driver);
		amezonHomePage.ClickonAmezonlogo();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

}
