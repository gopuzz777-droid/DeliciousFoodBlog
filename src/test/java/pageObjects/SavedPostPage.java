package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavedPostPage {
	
	public SavedPostPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	
	
		@FindBy(xpath="//a[normalize-space()='Login']")WebElement lnk_login;	
	 
		@FindBy(xpath="//input[@id='email']")WebElement textemail;
	
		@FindBy(xpath="//input[@id='password']")WebElement textpassword;
	
		@FindBy(xpath="//button[normalize-space()='Login']")WebElement btnLogin;
		
		@FindBy(xpath="//a[normalize-space()='Receipies']") WebElement lnk_recipies;
	 
		 @FindBy(xpath="//img[@alt='Crispy Paneer Bites']")WebElement lnk_select;
		 
		 @FindBy(xpath="//a[@type='submit']") WebElement lnk_save;
		 
		 @FindBy(xpath="//a[@type='submit']")WebElement unsaveBtn;




	 public void clickLogin() {
		 lnk_login.click();
		 
	 }
	 
	 public void enterEmail(String email) {
			textemail.sendKeys(email);
	}

	//Method to enter password
	public void enterPassword(String password) {
		textpassword.sendKeys(password);
	
	}
	//Method to click Login Button
	public void clickLoginbtn() {
		btnLogin.click(); 
		
	 }
	public void clickrecepies() {
	 lnk_recipies.click();
		 
	}
	public void clickItem() {
		lnk_select.click();
		
	}
	public void clicksaveRecipe() {
		lnk_save.click();
		
	}
	public void displayUnsavebtn() {
		unsaveBtn.isDisplayed();

	 }
	public boolean isUnsaveButtonVisible() {
	    return unsaveBtn.isDisplayed();
	}}
