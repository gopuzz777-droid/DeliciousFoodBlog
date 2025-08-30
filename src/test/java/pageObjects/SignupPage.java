package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {// Defines the SignupPage class
	
	public SignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
	}
     // Locates the First Name input field using XPath
     @FindBy(xpath="//input[@placeholder='First Name']")WebElement firstname;
    
     // Locates the Last Name input field using XPath
     @FindBy(xpath="//input[@placeholder='Last Name']")WebElement lastname; 
    
     // Locates the Email input field using XPath
     @FindBy(xpath="//input[@placeholder='Email']")WebElement email;

     // Locates the Phone Number input field using XPath
	@FindBy(xpath="//input[@placeholder='Phone Number']")WebElement phonenumber;
	
	// Locates the Password input field using XPath
	 @FindBy(xpath="//input[@placeholder='Password']")WebElement pwd;
	
	 // Locates the Confirm Password input field using XPath
	 @FindBy(xpath="//input[@placeholder='Confirm Password']")WebElement confirmpassword;
	
	 // Locates the Gender label for Female using XPath
	 @FindBy(xpath="//span[normalize-space()='Female']")WebElement genderfemale;
	 
	 @FindBy(xpath="//button[@id='uploadBtn']")WebElement fileinput;
	
	 // Locates the Register button using XPath
	 @FindBy(xpath="//button[normalize-space()='Register']")WebElement registerbutton;
	    
	 // Locates the confirmation message element using XPath
	 @FindBy(xpath="//p[@class='alert alert-success']")WebElement confirmmessage;

   
 // Constructor to initialize the WebDriver and PageFactory

    

// Method to set the First Name
 public void setFirstName(String fn) {
        firstname.sendKeys(fn);
        
    	}
 // Method to set the Last Name
public void setLastName(String ln) {
        lastname.sendKeys(ln);
        
    }
// Method to set the Email
public void setEmail(String mail) {
    email.sendKeys(mail);
    
    }
// Method to set the Phone Number
 public void setPhoneNumber(String phone) {
    	phonenumber.sendKeys("9123456789");
    	
    }
 // Method to set the Password
public void setPassword(String pass) {
    pwd.sendKeys("gopika@2002");
    
    }
// Method to set the Confirm Password
 public void setConfirmPassword(String cpass) {
    confirmpassword.sendKeys("gopika@2002");
    
    }
 // Method to select the Gender
 public void clickGender(String female) {
	 genderfemale.click();
	 genderfemale.isSelected();

 }
 //Method to upload file
 public void choosefile(String filepath) {
fileinput.sendKeys(filepath);

    }
 // Method to click the Register button
 public void clickRegister() {
    	registerbutton.click();
    }

    // Method to retrieve the confirmation message
 public String getConfirmMessage() {
    	try {
    		return(confirmmessage.getText());// Returns the text of the confirmation message
    	}
    		catch(Exception e) {
    			return(e.getMessage());// Returns the exception message in case of an error
    	}
    }
    





    }

