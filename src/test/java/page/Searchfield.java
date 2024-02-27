package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Searchfield {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/span/select")
	WebElement categoriesDropdown;
	
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/button[2]")
	WebElement searchicon;
	
	public Searchfield(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@BeforeTest
	public void CategoriesDropdown()
	{
		Select categories=new Select(categoriesDropdown);
		categories.selectByVisibleText("Gardening Accessories");
		
	}
	public void Search(String inputs)
	{
		search.click();
		search.sendKeys(inputs);
	}
	public void Searchicon()
	{
		searchicon.click();
		search.clear();
	}

}
