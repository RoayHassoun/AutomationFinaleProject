package tests;

import org.testng.annotations.Test;
import pageobjects.MainPage;

public class MainPageTests extends BaseTest { 

	@Test (description="Perform tests on different windows")
	public void tc01_guitarAddToCart() {
		MainPage mp1 = new MainPage(driver);
		mp1.guitarAddToCart();
	}
	
	@Test (description="Select from drop down")
	public void tc02_select() {
		MainPage mp2 = new MainPage(driver);
		mp2.select("Opteka Straight Flash Video Light Metal Bracket");
	}
	
	@Test (description="Navigate in website")
	public void tc03_navigateBackAndForward() {
		MainPage mp3 = new MainPage(driver);
		mp3.navigateBackAndForward();
	}
	
	@Test (description="Refresh pages and delete search field")
	public void tc04_refreshWindow() {
		MainPage mp4 = new MainPage(driver);
		mp4.refreshWindow();
	}
	
	@Test (description="Pressing a button with same element identification as other buttons, according to his father element")
	public void tc05_likeBtn() {
		MainPage mp5 = new MainPage(driver);
		mp5.likeBtn("Dove Deodorant Anti-antiperspirant Body Spray For MEN 150 Ml / 5 oz ( 6 Pack )");
	}
	
	@Test (description="Run on products and return the list of products whose there price is below a certain amount")
	public void tc06_lowPrices() {
		MainPage mp6 = new MainPage(driver);
		mp6.lowPrices();
	}
	
	@Test (description="Check differents categories")
	public void tc07_categories() {
		MainPage mp7 = new MainPage(driver);
		 mp7.categories("Wristwatches");
	}
	
	@Test (description="Set a price using drug and drop")
	public void tc08_minToMaxPrice() { 
		MainPage mp8 = new MainPage(driver);
		mp8.minToMaxPrice();
	}
	
	@Test (description="Filter options tests")
	public void tc09_filtersCheck() {
		MainPage mp9 = new MainPage(driver);
		mp9.filtersCheck();
	}
	
	@Test (description="Check the links that open a new url")
	public void tc10_linksTest() {
		MainPage mp10 = new MainPage(driver);
		mp10.linksTest();
	}
	
	@Test (description="Choose different colors and sizes for product")
	public void tc11_sneakersColor() {
		MainPage mp11 = new MainPage(driver);
		mp11.sneakersColor("8.5");
	}
}

