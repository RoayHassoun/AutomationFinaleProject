package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LogInPage;
import pageobjects.MainPage;
import utils.Utils;

public class LogInTests  {
	
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();                   
		driver.manage().window().maximize();
		driver.get(Utils.readProperty("url"));
		Thread.sleep(3000);
	} 
	
	@Test (dataProvider="getData", description="Use incorrect login information")
	public void tc01_logInFail(String user) throws InterruptedException {
		MainPage mp = new MainPage(driver);
		mp.enterLoginPage();
		LogInPage lp1 = new LogInPage(driver);
		lp1.logInFail(user);
		String expected = "Oops, that's not a match.";
		String actual = lp1.getErrorMsg();
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@DataProvider                  
	public Object[][] getData(){   
		Object[][] myData = {   
				{"roay978@gmail.com"},
				{"roay111@gmail.com"}
		};
		return myData;
	}
	
	@Test (description="Use the correct login information")
	public void tc02_logInSuccess() {
		MainPage mp = new MainPage(driver);
		mp.enterLoginPage();
		LogInPage lp2 = new LogInPage(driver);
		lp2.logInSuccess("roayfofo@gmail.com","Rr20072018");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
