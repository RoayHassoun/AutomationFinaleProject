package pageobjects;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	JavascriptExecutor js;

	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
		actions = new Actions(driver);
		js = (JavascriptExecutor) driver; 
		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
	}

	public void fillText(WebElement el,String name) {
		wait.until(ExpectedConditions.elementToBeClickable(el));   
		el.clear();
		highlightElement(el, "yellow");
		el.sendKeys(name);
	}

	public void clear(WebElement el) {
		el.clear();
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void navigateForward() {
		driver.navigate().forward();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public String title() {
		driver.getTitle();
		return title();
	}

	public void click(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el)); 
		highlightElement(el, "yellow");
		el.click();
	}

	public String getText(WebElement el) {
		wait.until(ExpectedConditions.visibilityOf(el));       
		highlightElement(el, "yellow");
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//alert
	public void alertOk() {
		driver.switchTo().alert().accept();
	}
	public void alertRename(String newName) { 
		driver.switchTo().alert().sendKeys(newName);
		driver.switchTo().alert().accept();
	}
	
	// mouseActions
	public void hovering(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el)); 
		highlightElement(el, "yellow");
		actions.moveToElement(el).build().perform(); 
	}
	
	public void doubleClick(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el)); 
		highlightElement(el, "yellow");
		actions.doubleClick(el).build().perform();
	}
	
	public void hoverAndClick(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el)); 
		actions.moveToElement(el);
		highlightElement(el, "yellow");
		actions.click().build().perform();
	}
	
	public void drugAndDrop(WebElement el1,WebElement el2) {
		wait.until(ExpectedConditions.elementToBeClickable(el1)); 
		wait.until(ExpectedConditions.elementToBeClickable(el2));
		highlightElement(el1, "yellow");
		actions.dragAndDropBy(el1, 90, 0).build().perform();
		highlightElement(el2, "yellow");
		actions.dragAndDropBy(el2, -100, 0).build().perform();
	}
	
	// HighLight
	protected void highlightElement(WebElement element, String color) {
		// keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:yellow; border: 1px solid " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);
		// Change the style back after few ms
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);
	}
	
	//scroll
	public void scrollToElement(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
		highlightElement(el, "yellow");
		js.executeScript("arguments[0].scrollIntoView(true);",el);
	}
}
