package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class CreateAccount {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[2]/ul/li/a")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"oxipopup_login\"]/div/div/div[4]/a")
	WebElement createaccountbtn;
	
	@FindBy(xpath="//*[@id=\"oxi_registerform_popup\"]/div[1]/div[1]/span/input")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"oxi_registerform_popup\"]/div[1]/div[2]/span/input")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"oxi_registerform_popup\"]/div[1]/div[3]/span/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"oxi_registerform_popup\"]/div[1]/div[4]/span/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"oxi_registerform_popup\"]/div[2]/button")
	WebElement createbtn;
	
	public CreateAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@BeforeTest
	public  void CreateAcc()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginbtn.click();
		createaccountbtn.click();
		firstname.click();
		firstname.sendKeys("Rasily");
		lastname.click();
		lastname.sendKeys("P Raj");
		email.click();
		email.sendKeys("rasilypraj@gmail.com");
		password.click();
		password.sendKeys("rasily123456");
		createbtn.click();
		
	}

}
