package tests;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utils;

public class BaseTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();                   
		driver.manage().window().maximize();
		driver.get(Utils.readProperty("url"));
		Thread.sleep(1000);
	} 
	
	@AfterMethod
	public void failedTest(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE ){
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File("./ScreenShots/"+result.getName()+".jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

