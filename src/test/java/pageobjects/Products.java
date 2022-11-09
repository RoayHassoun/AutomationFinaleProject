package pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Products extends CartPage {
	
	//productSelect
	@FindBy(css="#s0-27-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(2) > a > p")
	private WebElement sizeBtn;
	
	//setMinToMaxPrice
	@FindBy(css="[aria-label='Sort: Best Match']")
	private WebElement bestMatch;
	@FindBy(css="#s0-27_1-9-0-1\\[0\\]-0-0-6-5-4\\[4\\]-flyout > button > span")
	private WebElement simCard;
	@FindBy(css="#s0-27_1-9-0-1\\[0\\]-0-0-6-5-4\\[4\\]-flyout > div > ul > li:nth-child(3) > a > span.brm__item-label")
	private WebElement dualSim;
	@FindBy(xpath="//*[@id='mainContent']/div[1]/div/div[2]/div[2]/div/button/span/span")
	private WebElement countrySelect;
	@FindBy(css="div[aria-label='Information'] > div > form > fieldset > div > span > span > select")
	private WebElement countrySelect2;
	@FindBy(css="[value='Go']")
	private WebElement goBtn;
	@FindBy(css="[aria-label='Sort selector. Best Match selected.']")
	private WebElement bestMatch2;
	@FindBy(css="[_sp='p2351460.m4116.l5869.c4']")
	private WebElement lowestFirst;
	@FindBy(css="[aria-label='Minimum Value in ILS']")
	private WebElement minArea;
	@FindBy(css="[aria-label='Maximum Value in ILS']")
	private WebElement maxArea;
	@FindBy(css="[aria-label='Submit price range']")
	private WebElement set;
	
	//twoLists
	@FindBy(css="[src='https://i.ebayimg.com/thumbs/images/g/8Z8AAOSwi1ZeQR1B/s-l225.webp']")
	private WebElement img;
	@FindBy(css="[aria-controls='s0-27-9-0-1[0]-0-0-6-5-4[2]-flyout']")
	private WebElement netWork;
	
	//SendKeys
	@FindBy(css="[class='gh-tb ui-autocomplete-input']")
	private WebElement searchField1;
	@FindBy(css="[type='submit']")
	private WebElement searchBtn1;
	@FindBy(css="[class='gh-tb ui-autocomplete-input']")
	private WebElement searchField2;
	@FindBy(css="#gh-btn")
	private WebElement searchBtn2;
	
	//calculationProducts
	@FindBy(xpath="//*[@id='mainContent']/section[1]/div[2]/a[5]/div[1]/img")
	private WebElement samsungImg;
	@FindBy(css="#s0-27-9-0-1\\[0\\]-0-0 > ul > li:nth-child(2) > div > div.s-item__info.clearfix > div > div:nth-child(1) > span")
	private WebElement firstNum;
	@FindBy(css="#s0-27-9-0-1\\[0\\]-0-0 > ul > li:nth-child(3) > div > div.s-item__info.clearfix > div > div:nth-child(1) > span")
	private WebElement secondNum;
	
	//freeRun
	@FindBy(css="[href='https://il.ebay.com/b/Samsung/bn_21834655?rt=nc&_pgn=8']")
	private WebElement pageNum;
	@FindBy(xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-0-6-4\"]/div[1]/div[1]/div/ul/li[2]/a/h2")
	private WebElement auction;
	@FindBy(css="[type='next']")
	private WebElement next;
	@FindBy(css="[type='previous']")
	private WebElement previous;
	@FindBy(xpath="//a[text()='eBay Refurbished']")
	private WebElement eBayRefurbished;
	@FindBy(css="[href='https://www.ebay.com/b/Certified-Refurbished/bn_7040708936']")
	private WebElement seeMore;
	@FindBy(css="[_sp='p2489527.m4888.l9598']")
	private WebElement securityCenter;
	@FindBy(css="[_exsp='m571.l1540']")
	private WebElement community;
	
	public Products(WebDriver driver) {
		super(driver);	
	}
	
	public void SelectByTitle(String title) {
		List<WebElement> list = driver.findElements(By.cssSelector("[class='b-visualnav__title']"));
		System.out.println("length list: " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("products list: " + list.get(i).getText()); 
			if (getText(list.get(i)).equalsIgnoreCase(title)) {           
				System.out.println(title);                               
				hoverAndClick(list.get(i));                               
				sleep(1000);
				break;
			}
		}
	}
	
	public void productSelect(String title) { 
		List<WebElement> list = driver.findElements(By.cssSelector("[class='b-visualnav__title']"));
		for (WebElement product : list) {
			if (product.getText().equalsIgnoreCase(title)) {
				System.out.println(product);	
				click(product);
				break;
			}
		}
		sleep(1000);
		click(sizeBtn);
	}
	
	public void setMinToMaxPrice(String name1) {
		hoverAndClick(bestMatch); 
		sleep(500);
		List<WebElement> listBestMatch = driver.findElements(By.cssSelector("[class='fake-menu-button__item']"));
		for (WebElement list1 : listBestMatch) {
			if (list1.getText().equalsIgnoreCase(name1)) {
				click(list1);
				break;
				}
		}
		sleep(1000);
		hoverAndClick(simCard);
		sleep(2000);
		click(dualSim);
		click(countrySelect);
		sleep(700);
		Select selectCountry = new Select(countrySelect2);
		selectCountry.selectByIndex(8);
		click(goBtn);
		click(bestMatch2);
		click(lowestFirst);
		sleep(2000);
		minArea.sendKeys("20");
		maxArea.sendKeys("100");
		hoverAndClick(set);
	}
	
	public void twoLists(String text,String text2) {
		hoverAndClick(img);
		hoverAndClick(netWork);
		List<WebElement> list = driver.findElements(By.cssSelector("[class='brm__item-label']"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(text)) {
				click(el);
				break;
			}
		}
		List<WebElement> list2 = driver.findElements(By.cssSelector("[class='s-item__title s-item__title--has-tags']"));
		for (WebElement el2 : list2) {
			if (el2.getText().equalsIgnoreCase(text2)) {
				click(el2);
				break;
			}
		}
	}
	
	public void SendKeys(String text,String text2) { 
		fillText(searchField1, text);
		click(searchBtn1);
		fillText(searchField2, text2);
		click(searchBtn2);
		navigateBack();
		System.out.println(driver.getCurrentUrl());
		navigateForward();
		System.out.println(driver.getTitle());
	}
	
	public double calculationProducts() {
		click(samsungImg);
		sleep(2000);
		String s1 = firstNum.getText();
		String result = s1.substring(4, 10);
		String s2 = secondNum.getText();
		String result2 = s2.substring(4, 10);
		System.out.println(result);
		System.out.println(result2);
		double num1 = Double.parseDouble(result);
		double num2 = Double.parseDouble(result2);
		System.out.println("price of two devices :" + (num1+num2));
		return num1+num2 ;	
	}
	
	public void freeRun() { 
		click(pageNum);
		click(auction);
		title();
		navigateBack();
		navigateForward();
		navigateBack();
		navigateBack();
		click(next);
		driver.getPageSource();
		driver.getCurrentUrl();
		click(previous);
		eBayRefurbished.getAttribute("href");
		click(seeMore);
		click(securityCenter);
		navigateBack();
		click(community);
		navigateBack();
	}
}

