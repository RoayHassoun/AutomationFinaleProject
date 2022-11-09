package pageobjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends CartPage {
	
	//enterLoginPage
	@FindBy(css="#gh-ug > a")
	private WebElement logIn;
	
	//guitarAddToCart
	@FindBy(css="#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > a")
	private WebElement homeGarden;
	@FindBy(css="[_sp='p2481888.m1382.l3263']")
	private WebElement musicalInstruments;
	@FindBy(css="#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
	private WebElement guitars;
	@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-12-list\"]/li[3]/a/p")
	private WebElement acousticGuitar;
	@FindBy(xpath="//*[@id=\"s0-28-9-0-1[0]-0-1[0]-0-12-list\"]/li[3]/a/p")
	private WebElement taylor;
	@FindBy(xpath="//*[@id=\"s0-28_2-9-0-1[0]-0-0\"]/ul/li[42]/div/div[2]/a/h3")
	private WebElement product;
	@FindBy(css="#gh-ac")
	private WebElement search;
	@FindBy(css="[href='https://il.ebay.com/b/Taylor-Grand-Auditorium-Acoustic-Guitars/33021/bn_114936039']")
	private WebElement GrandAuditorium;
	@FindBy(css="[href='https://il.ebay.com/b/Taylor-Jumbo-Acoustic-Guitars/33021/bn_3119501']")
	private WebElement jumbo;
	@FindBy(css="[href='https://il.ebay.com/b/Acoustic-Guitars/33021?Body%2520Type=Parlor&Brand=Taylor&rt=nc']")
	private WebElement parlor;
	
	//select
	@FindBy(css="#gh-cat")
	private WebElement select;
	@FindBy(css="#gh-btn")
	private WebElement searchBtn;
	@FindBy(css="#s0-17-12_2-0-1\\[0\\]-0-0-27\\[4\\]-0-toggle-button")
	private WebElement cameraFlash;
	@FindBy(css="[_sp='p2489527.m4337.l9750.c15']")
	private WebElement cameraBrackets;
	@FindBy(css="[href='https://il.ebay.com/b/Flash-Bracket-for-Nikon-Camera/89161/bn_90007']")
	private WebElement nikon;
	
	//navigateBackAndForward
	@FindBy(linkText="Industrial equipment")
	private WebElement industrialBtn;
	@FindBy(css="[_sp='p2481888.m1385.l3255']")
	private WebElement heavyParts;
	@FindBy(css="[_sp='p2489527.m4337.l9750.c7']")
	private WebElement hooks;
	
	//refreshWindow
	@FindBy(css="[type='text']")
	private WebElement nikeSearch;
	@FindBy(css="[_sp='p2481888.m2615.l8342']")
	private WebElement seeAll;
	@FindBy(css="[type='text']")
	private WebElement sonySearch;
	
	//likeBtn
	@FindBy(css="#mainContent > div.hl-cat-nav > ul > li:nth-child(5) > a")
	private WebElement healthBtn;
	@FindBy(css="[_sp='p2481888.m1381.l3261']")
	private WebElement bathBtn;
	@FindBy(css="[href='https://il.ebay.com/b/Dove-Bath-Body/11838/bn_8279985']")
	private WebElement doveBtn;
	@FindBy(xpath="/html/body/div[4]/div[4]/div[3]/section[1]/ul/li[6]/div/div[2]/a/h3")
	private WebElement doveProductLink;
	
	//lowPrices
	@FindBy(css="#gh-ac")
	private WebElement Search01;
	@FindBy(css="[type='submit']")
	private WebElement submitBtn;
	@FindBy(css="[_sp='p2351460.m4117.l8280.c6']")
	private WebElement goPro4k;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-2[1]-4[1]-3']")
	private WebElement clickA;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-2[1]-4[1]-3']")
	private WebElement clickB;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[0]-3']")
	private WebElement clickC;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[0]-3']")
	private WebElement clickD;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[3]-3']")
	private WebElement clickE;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[4]-3']")
	private WebElement clickF;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[8]-3']")
	private WebElement clickG;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[5]-3']")
	private WebElement clickH;
	@FindBy(css="[alt='eBay Logo']")
	private WebElement ebayLogo;
	
	//categories
	@FindBy(css="[_sp='p2481888.m2615.l8342']")
	private WebElement seaAll2;
	@FindBy(css="[aria-label='Tech']")
	private WebElement tech;
	@FindBy(css="[aria-label='Fashion']")
	private WebElement fashion;
	@FindBy(css="[aria-label='Home']")
	private WebElement home;
	@FindBy(css="[aria-label='More']")
	private WebElement more;
	@FindBy(css="#gh-logo")
	private WebElement ebayLogo2;
	
	//minToMaxPrice
	@FindBy(css="#gh-ac")
	private WebElement search2;
	@FindBy(css="#gh-btn")
	private WebElement searchBtn2;
	@FindBy(css="[aria-label='see all - Price - opens dialog']")
	private WebElement seeAllPrices;                        
	@FindBy(css="#price-graph-knob-min")
	private WebElement min;
	@FindBy(css="#price-graph-knob-max")
	private WebElement max;
	
	//filtersCheck
	@FindBy(css="#gh-ac")
	private WebElement search3;
	@FindBy(css="#gh-btn")
	private WebElement searchBtn3;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[0]-3']")
	private WebElement aa;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[3]-3']")
	private WebElement bb;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[5]-3']")
	private WebElement cc;
	@FindBy(css="[id='s0-51-12-0-1-2-6-0-4[8]-3']")
	private WebElement dd;
	@FindBy(xpath="//*[@id=\"s0-51-12-0-1-2-6-2\"]/button")
	private WebElement moreBtn;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[2]/div[1]/div/fieldset/div[2]/div[6]/label/div/div/div/span[1]")
	private WebElement color;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[1]/div/div[6]/span")
	private WebElement location;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[2]/div[1]/div/fieldset/div[4]/div/div/label")
	private WebElement europe;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[1]/div/div[7]/span")
	private WebElement seller;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[2]/div[1]/div/fieldset/div/label/span[2]")
	private WebElement itemFrom;
	@FindBy(xpath="/html/body/div[18]/div[2]/div/form/div[1]/div[2]/div[1]/div/fieldset/div/div[2]/div/div/label")
	private WebElement ebayStores;
	@FindBy(css="[aria-label='Apply']")
	private WebElement apply;
	
	//linksTest
	@FindBy(css="[_sp='m571.l4539']")
	private WebElement linkA;
	@FindBy(css="[_sp='m571.l2905']")
	private WebElement linkB;
	@FindBy(css="[_sp='m571.l2909']")
	private WebElement linkC;
	@FindBy(css="[_sp='m571.l2940']")
	private WebElement linkD;
	@FindBy(css="[_exsp='m571.l2933']")
	private WebElement linkE;
	@FindBy(css="[_sp='m571.l1613']")
	private WebElement linkF;
	@FindBy(css="[_exsp='m571.l3271']")
	private WebElement linkG;
	@FindBy(css="[_sp='m571.l2586']")
	private WebElement linkH;
	@FindBy(css=".flus.gf-if.gspr")
	private WebElement linkI;
	@FindBy(css="[_sp='m571.l2586']")
	private WebElement linkJ;
	@FindBy(css=".flil.gf-if.gspr")
	private WebElement linkL;
	
	//sneakersColor
	@FindBy(css="#gh-ac")
	private WebElement serach3;
	@FindBy(css="#gh-btn")
	private WebElement serach3Btn;
	@FindBy(linkText="9.5")
	private WebElement size1;
	@FindBy(xpath="/html/body/div[8]/div[3]/ul/li[1]/ul/li[6]/div[2]/ul/li[4]/div/a/div/div/span[1]")
	private WebElement eUShoeSize;
	@FindBy(css="#x-refine__group_1__2 > div.x-color-picker.x-color-picker--rounded > ul > li:nth-child(5) > a")
	private WebElement gray;
	@FindBy(css="#x-refine__group_1__1 > div.x-color-picker.x-color-picker--rounded > ul > li:nth-child(9) > a")
	private WebElement red;
	@FindBy(css="#x-refine__group_1__1 > div.x-color-picker.x-color-picker--rounded > ul > li:nth-child(1) > a")
	private WebElement gray2;
	@FindBy(css="#x-refine__group_1__1 > div.x-color-picker.x-color-picker--rounded > ul > li:nth-child(8) > a")
	private WebElement multiColor;
	@FindBy(linkText="10")
	private WebElement size2;
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterLoginPage() {
		click(logIn);
		sleep(1500);
	}
	
	public void guitarAddToCart() {                             
		hovering(homeGarden);
		sleep(1000);
		hoverAndClick(musicalInstruments);
		sleep(1000);
		click(guitars);
		click(acousticGuitar);
		click(taylor);
		click(product);
		String main = driver.getWindowHandle();
		System.out.println("first window - " + main);
		Object[] a=driver.getWindowHandles().toArray();
		sleep(2000);
		driver.switchTo().window(a[1].toString());
		fillText(search, "Taylor"); 
		sleep(1000);
	    addToCart();
	    sleep(2000);
		driver.close();
		driver.switchTo().window(a[0].toString());
		sleep(2000);
		click(GrandAuditorium);
		navigateBack();
		click(jumbo);
		navigateBack();
		click(parlor);
	}
	
	public void select(String name) {
		sleep(1000);
		Select selectCategory = new Select(select);
		sleep(1000);
		selectCategory.selectByVisibleText("Cameras & Photo");
		click(searchBtn);
		click(cameraFlash); 
		click(cameraBrackets);
		click(nikon);
		sleep(500);
		List<WebElement> list = driver.findElements(By.cssSelector("[class='s-item__title s-item__title--has-tags']"));
		for (WebElement Bracket : list) {
			if (Bracket.getText().equalsIgnoreCase(name)) {
				click(Bracket);
				break;	
			}
		}
	}
	
	public void navigateBackAndForward() {
		hovering(industrialBtn); 
		click(heavyParts);
		sleep(500);
		navigateBack();
		sleep(500);
		navigateForward();
		click(hooks);
		sleep(700);
		navigateBack();
		sleep(500);
		navigateForward();
		sleep(500);
		navigateBack();
		sleep(500);
		navigateBack();
	}
	
	public void refreshWindow() {
		fillText(nikeSearch, "Nike");
		sleep(300);
		refresh();
		click(seeAll);
		fillText(sonySearch, "Sony");
		sleep(300);
		refresh();
		sleep(300);
		navigateBack();
	}
	
	public void likeBtn(String name) {  
		hovering(healthBtn);
		sleep(500);
		hoverAndClick(bathBtn);
		sleep(500);
		click(doveBtn); 
		sleep(2000);
		scrollToElement(doveProductLink);
		sleep(2500);
		List<WebElement> list = driver.findElements(By.cssSelector(".s-item.s-item--large"));   
		for (WebElement el : list) {
			WebElement titleEl = el.findElement(By.cssSelector(".s-item__link"));  
			System.out.println(titleEl.getText());
			if (titleEl.getText().equalsIgnoreCase(name)) {
				WebElement likeButton = el.findElement(By.cssSelector("[class='svg-icon']"));   
				hoverAndClick(likeButton);
				break;
			}
		}
	}
	
	public List<WebElement> lowPrices() {
		fillText(Search01, "go-pro camera"); 
		click(submitBtn);
		click(goPro4k);
		click(clickA);
		click(clickB);
		click(clickC);
		click(clickD);
		click(clickE);
		click(clickF);
		click(clickG);
		click(clickH);
		navigateBack();
		doubleClick(ebayLogo);
		sleep(2000);
		List<WebElement> list = driver.findElements(By.cssSelector("[class='hl-item__displayPrice']"));
		List<WebElement> list2 = new ArrayList<WebElement>() ; 
		for (WebElement el : list) {
			String listString = el.getText().replaceAll("ILS","").replaceAll(",", ""); 
			double num = Double.parseDouble(listString);
			System.out.println("the prices of all list is :" + num);
			if (num <= 850) {
				list2.add(el);	
			}
		}
		System.out.println(list2);
		return list2;
	}
	
	public boolean categories(String category) {
		click(seaAll2);
		hoverAndClick(tech);
		hoverAndClick(fashion);
		hoverAndClick(home);
		hoverAndClick(more);
		doubleClick(ebayLogo2);
		sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("//*[@class='hl-popular-destinations-name']"));
		for (int i = 0; i < List.size(); i++) {
			if (getText(List.get(i)).equalsIgnoreCase(category)) {
				System.out.println(category);
				click(List.get(i));
				return true;
			} else {
			}  
		}
		return false;
	}
	
	public void minToMaxPrice() {
		fillText(search2, "price");
		sleep(1000);
		click(searchBtn2);
		sleep(2000);
		click(seeAllPrices);
		sleep(2500);
		drugAndDrop(min,max);
	}
	
	public void filtersCheck() { 
		fillText(search3, "bornPretty"); 
		click(searchBtn3);
		doubleClick(aa);
		doubleClick(bb);
		doubleClick(cc);
		doubleClick(dd);
		click(moreBtn);
		sleep(1500);
		hoverAndClick(color);
		sleep(1000);
		click(location);
		hoverAndClick(europe);
		click(seller);
		click(itemFrom);
		sleep(1000);
		click(ebayStores);
		sleep(1000);
		click(apply);
	}
	
	public void linksTest() {
		click(linkA);   
		sleep(700);
		navigateBack();
		click(linkB);   
		sleep(700);
		navigateBack();
		click(linkC);   
		sleep(700);
		navigateBack();
		click(linkD);   
		sleep(700);
		navigateBack();
		click(linkE); 
		sleep(700);
		navigateBack();
		click(linkF);   
		sleep(700);
		navigateBack();
		click(linkG); 
		sleep(700);
		navigateBack();
		hovering(linkH);     
		sleep(700);
		hoverAndClick(linkI);  
		sleep(700);
		hovering(linkJ);     
		sleep(700);
		hoverAndClick(linkL);  
	}
	
	public void sneakersColor(String size) {
		fillText(serach3,"sneakers");
		click(serach3Btn);
		click(size1);
		sleep(1000);
		List<WebElement> list = driver.findElements(By.cssSelector(".size-component__square"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(size)) {
				click(el);
				break;
			}
		}
		click(eUShoeSize);
		sleep(500);
		hoverAndClick(gray);
		sleep(2000);
		doubleClick(red);
		sleep(2000);
		click(gray2);
		sleep(2000);
		doubleClick(multiColor);
		sleep(500);
		click(size2);
	}
}

