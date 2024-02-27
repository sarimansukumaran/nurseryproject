package page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[2]/details/summary")
	WebElement plants;
	
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[2]/details/div/div/ul/li[4]/a")
	WebElement plantsBySeason;
	
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[3]/details/summary")
	WebElement seeds;
	
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[3]/details/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement flowerSeedsOPDesi;
	
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[7]/details/summary")
	WebElement gifts;
	
	@FindBy(xpath="//*[@id=\"site-header-nav\"]/nav/ul[1]/li[7]/details/summary")
	WebElement giftsForFetivals;
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--15944463089804__09461100-fb96-4c14-9644-dbe0680b7d1b\"]/section/a")
	WebElement viewmorebtn;
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--15944463089804__1635435244f767b4a1\"]/div/div/div[4]/a")
	WebElement offers;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Catagories()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.moveToElement(plants);
		act.perform();
		plantsBySeason.click();
		act.moveToElement(seeds).perform();
		flowerSeedsOPDesi.click();
		act.moveToElement(gifts).perform();;
		giftsForFetivals.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	
	}
	public void Scrolldown1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1650)","");
		viewmorebtn.click();
		driver.navigate().back();

		
	}
	public void Scrolldownoffers()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-950)","");
		offers.click();
		//driver.navigate().back();
	}

}
