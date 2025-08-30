package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 public HomePage(WebDriver driver) {
		    PageFactory.initElements(driver, this);
	 }
	
  @FindBy(xpath="//a[normalize-space()='Login']")
	 WebElement lnk_login;

  
 @FindBy(xpath ="//a[@class='signup-link']")
  WebElement lnk_signup;
 


 public void clickLogin() {
	 lnk_login.click();
 }
 
 public void clickSignUp() {
     lnk_signup.click();
 }
 
 

 }

