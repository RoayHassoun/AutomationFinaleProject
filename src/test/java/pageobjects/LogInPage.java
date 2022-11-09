package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {    
	
	@FindBy(css="#userid")
	private WebElement user;
	@FindBy(css="#signin-continue-btn")
	private WebElement click01;
	@FindBy(css="#pass")
	private WebElement password01;
	@FindBy(css="#sgnBt")
	private WebElement click02;
	@FindBy(css="[id='errormsg']")
	private WebElement errormsg;
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	public void logInFail(String user) {
		sleep(1000);
		fillText(driver.findElement(By.cssSelector("#userid")), user);
		click(driver.findElement(By.cssSelector("#signin-continue-btn")));
	}
	
	public String getErrorMsg() {
		sleep(1500);
		String errorMsg = errormsg.getText();
		return errorMsg;
	}
	
	public void logInSuccess(String user,String password) {
		fillText(driver.findElement(By.cssSelector("#userid")), user);
		click(driver.findElement(By.cssSelector("#signin-continue-btn")));
		sleep(1500);
		fillText(driver.findElement(By.cssSelector("#pass")), password);
		click(driver.findElement(By.cssSelector("#sgnBt")));
	}
}

