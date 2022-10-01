package Amezontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amezon.AmezonHomePage;
import Amezon.AmezonSigninPage;

public class AmezonProjectTestClass {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/amezon/s?k=amezon");
	}
	
	@Test
	public void test1()
	{
		AmezonHomePage amezonHomePage=new AmezonHomePage(driver);
		amezonHomePage.MoveonAccandList();
		
		amezonHomePage.ClickonSignin();
		
		AmezonSigninPage amezonSigninPage = new AmezonSigninPage(driver);
		amezonSigninPage.SendEmailorMobileNo();
		amezonSigninPage.ClickonContinue();
		amezonSigninPage.SendPassward();
		amezonSigninPage.ClickonSignInSubmit();
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		AmezonHomePage amezonHomePage = new AmezonHomePage(driver);
		amezonHomePage.ClickonAllMenu();
		Thread.sleep(3000);
		amezonHomePage.ClickonAmezonPrimeVideo();
		Thread.sleep(3000);
		amezonHomePage.ClickonMovies();
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		if(Url.equals("https://www.primevideo.com/storefront/movie/ref_=atv_nb_sf_mv?ref_=nav_em_0_2_6_3"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}

}
