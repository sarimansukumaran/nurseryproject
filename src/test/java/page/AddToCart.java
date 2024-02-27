package page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"snize-product-5143784358028\"]/a/div/div/span/img")
	WebElement asparagus;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143784358028\"]/a/div/span/button")
	WebElement addtocartasp;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143788224652\"]/a/div/div/span/img[2]")
	WebElement yellowtomato;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143788224652\"]/a/div/span/button")
	WebElement addtocartytomato;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143789011084\"]/a/div/div/span/img[2]")
	WebElement bottlegourd;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143789011084\"]/a/div/span/button")
	WebElement addtocartbtlegourd;
	
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/button[2]")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143766630540\"]/a/div/div/span/img[2]")
	WebElement mixeddahliya;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143766630540\"]/a/div/span/button")
	WebElement addtocartdahlia;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143384719500\"]/a/div/div/span/img[2]")
	WebElement tomato;
	
	@FindBy(xpath="//*[@id=\"snize-product-5143384719500\"]/a/div/span/button")
	WebElement addtocarttomato;
	
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void VegPlants()
	{
		driver.navigate().to("https://nurserylive.com/pages/search-results-page?q=vegetable%20seeds");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.moveToElement(asparagus);
		act.perform();
		addtocartasp.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)","");
		act.moveToElement(yellowtomato);
		act.perform();
		addtocartytomato.click();
		act.moveToElement(bottlegourd);
		act.perform();
		addtocartbtlegourd.click();
		
		
		
	}
	public void Seed() 
	{
		search.click();
		search.clear();
		search.sendKeys("tomato round");
		searchbtn.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		Actions act=new Actions(driver);
		act.moveToElement(tomato);
		act.perform();
		addtocarttomato.click();	}
	
	public void FloweringPlants()
	{
		search.click();
		search.clear();
		search.sendKeys("dahila");
		searchbtn.click();
		Actions act=new Actions(driver);
		act.moveToElement(mixeddahliya);
		act.perform();
		addtocartdahlia.click();
	}
	
}
