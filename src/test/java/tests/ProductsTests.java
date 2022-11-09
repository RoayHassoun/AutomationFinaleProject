package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Products;

public class ProductsTests {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();                   
		driver.manage().window().maximize();
		driver.get("https://il.ebay.com/b/Samsung/bn_21834655");
		Thread.sleep(2500);
	} 
	
	@Test (description="Selecting products according to their title")
	public void tc01_SelectByTitle() {
		Products p1 = new Products(driver);
		p1.SelectByTitle("Samsung Galaxy S10");
	}
	
	@Test (description="Select spacific product")
	public void tc02_productSelect() {
		Products p2 = new Products(driver);
		p2.productSelect("Smart Watches");
	}
	
	@Test (description="Set prices from min to max")
	public void tc03_setMinToMaxPrice() {
		Products p3 = new Products(driver);
		p3.setMinToMaxPrice("Price + Shipping: lowest first");
	}
	
	@Test (description="Runing on two lists of products and choosing spacific product from each list")
	public void tc04_twoLists() {
		Products p4 = new Products(driver);
		p4.twoLists("T-Mobile", "Samsung Galaxy S10 White Sprint ATT T-Mobile Verizon Factory Unlocked - OPEN BOX");
	}
	
	@Test (description="Search feild test")
	public void tc05_SendKeys() {
		Products p5 = new Products(driver);
		p5.SendKeys("Apple", "Apple Watch");
	}
	
	@Test (description="Calculate the sum of two products using parseDouble from String")
	public void tc06_calculationProducts() {
		Products p6 = new Products(driver);
		p6.calculationProducts();
	}
	
	@Test (description="Free runing test on the website")
	public void tc07_freeRun() {
		Products p7 = new Products(driver);
		p7.freeRun();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}