package pageObjects;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

	
	//constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	//Locating WebElments using xpath

	@FindBy(xpath="//input[@id='email']")
	WebElement textemail;

	@FindBy(xpath="//input[@id='password']")
	WebElement textpassword;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	

	 @FindBy(xpath="//a[normalize-space()='Home']")
	 WebElement lnk_homelbl;

	
	//Method to Enter email
		 
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
	
	public void clickHomelbl() {
		 lnk_homelbl.click();
	
	}
	 public boolean isHomeLabelVisible() {
	        return lnk_homelbl.isDisplayed();
	    }
	}
	
	
	
	