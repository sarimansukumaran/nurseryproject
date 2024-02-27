package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class Login {
 WebDriver driver;
 
 @FindBy(xpath="//*[@id=\"shopify-section-static-header\"]/div[1]/div[2]/ul/li/a")
WebElement loginbtn;
 
 @FindBy(xpath="//*[@id=\"oxi_loginform_popup\"]/div[1]/div[1]/span/input")
 WebElement emailfield;
 
 @FindBy(xpath="//*[@id=\"oxi_loginform_popup\"]/div[1]/div[2]/span/input")
 WebElement password;
 
 @FindBy(xpath="//*[@id=\"oxi_loginform_popup\"]/div[2]/button/span/span")
 WebElement login;
 
 public Login(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 @BeforeTest
 public void login()
 {
	 loginbtn.click();
	 
 }
 public void SetValues(String email,String pswd)
 {
	 emailfield.click();
	 emailfield.sendKeys(email);
	 password.click();
	 password.sendKeys(pswd);
	 
 }
 public void loginclick()
 {
	 login.click();
 }
}
