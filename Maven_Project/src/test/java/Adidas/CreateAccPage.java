package Adidas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccPage {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//adidasHomePage = new AdidasHomePage(driver);
		
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	
		driver.get("https://www.adidas.co.in/");
		
		AdidasHomePage adidasHomePage1 = new AdidasHomePage(driver);
		adidasHomePage1.ClickOnSignup();
		String URL = driver.getCurrentUrl();
		String Title = driver.getTitle();
		if(Title.equals("adidas India Official Website | Sportswear") && URL.equals("https://www.adidas.co.in/"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test(priority=1)
	public void VerifyRegisterButton()
	{
		AdidasHomePage adidasHomePage = new AdidasHomePage(driver);
		adidasHomePage.SendonEmail();
		adidasHomePage.SendonPassward();
		adidasHomePage.ClickOnShow();
		adidasHomePage.ClickOnFirststCheckBox();
		adidasHomePage.ClickOnSecondstCheckBox();
		adidasHomePage.ClickOnThirdCheckBox();
		adidasHomePage.ClickOnRegister();
	}
	
	@Test(priority=2)
	public void VerifyFacebookButton()
	{
		AdidasHomePage adidasHomePage2 = new AdidasHomePage(driver);
		adidasHomePage2.ClickOnFacebook();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.navigate().back();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("End");
	}

}
