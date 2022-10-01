package Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmezonHomePage {

	//Variable Declaration
	
	@FindBy(xpath="//a[@id=\"nav-logo-sprites\"]")
	private WebElement Amezonlogo;
	
	@FindBy(xpath="//a[@id=\"nav-global-location-popover-link\"]")
	private WebElement SelectYourAddress;
	
	@FindBy(xpath="//select[@id=\"searchDropdownBox\"]")
	private WebElement Search;
	
	@FindBy(xpath="//a[@id=\"icp-nav-flyout\"]")
	private WebElement LanguageTab;
	
	@FindBy(xpath="(//i[@class=\"icp-radio\"])[7]")
	private WebElement Marathi;
	
	@FindBy(xpath="//span[text()=\"Account & Lists\"]")
	private WebElement AccandList;
	
	@FindBy(xpath="//span[text()=\"Sign in\"]")
	private WebElement Signin;
	
	@FindBy(xpath="//a[@id=\"nav-orders\"]")
	private WebElement Returntoorder;
	
	@FindBy(xpath="//a[@id=\"nav-cart\"]")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//a[@id=\"nav-hamburger-menu\"]")
	private WebElement AllMenu;
	
	@FindBy(xpath="(//a[@class=\"hmenu-item\"])[8]")
	private WebElement AmezonPrimeVideo;
	
	@FindBy(xpath="//a[text()=\"Movies\"]")
	private WebElement Movies;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[1]")
	private WebElement BestSellers;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[2]")
	private WebElement Mobiles;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[3]")
	private WebElement CustomerService;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[4]")
	private WebElement TodaysDeals;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[5]")
	private WebElement Books;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[6]")
	private WebElement Electronics;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[7]")
	private WebElement Fashion;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[8]")
	private WebElement Prime;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[9]")
	private WebElement NewRelease;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[10]")
	private WebElement HomeandKitchen;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[11]")
	private WebElement AmezonPay;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[12]")
	private WebElement Computers;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[13]")
	private WebElement Sell;
	
	@FindBy(xpath="(//a[@class=\"nav-a  \"])[14]")
	private WebElement Coupons;

		
	//Variable Initialization
	
	public AmezonHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
		select=new Select(Search);
		//Common Waiting time for All Above WebElements
		 wait = new WebDriverWait(driver, 10);
	
	}
	
	//variable use-WebElement actions
	WebDriver driver;
	private Actions act;
	private Select select ;
	private WebDriverWait wait;
	
	public void ClickonAmezonlogo()
	{
		Amezonlogo.click();
	}
	
	public void ClickonSelectYourAddress()
	{
		SelectYourAddress.click();
	}
	
	public void MoveonAccandList()
	{
		act.moveToElement(AccandList).perform();
	}
	
	public void ClickonSignin()
	{
		Signin.click();
	}
	
	public void ClickonSearch()
	{
		select.selectByIndex(3);
	}
	
	public void ClickonLanguageTab()
	{
		//different Wating Time For All Above Element Separately
		//wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(LanguageTab));
		act.moveToElement(LanguageTab).perform();
	}
	
	public void ClickonMarathiLanguage()
	{
		Marathi.click();
	}
	
	public void MoveonPrime()
	{
		wait.until(ExpectedConditions.visibilityOf(Prime));
		act.moveToElement(Prime).perform();
	}
	
	public void ClickonAllMenu()
	{
		AllMenu.click();
	}
	
	public void ClickonAmezonPrimeVideo()
	{
		AmezonPrimeVideo.click();
	}
	
	public void ClickonMovies()
	{
		Movies.click();
	}
}
