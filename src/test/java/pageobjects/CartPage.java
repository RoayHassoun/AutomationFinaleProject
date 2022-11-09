package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public void openCart() {
		hoverAndClick(driver.findElement(By.cssSelector("#gh-cart-n")));
	}
	
	public void addToCart() {
		driver.findElement(By.linkText("Add to cart")).click(); 
	}
}

