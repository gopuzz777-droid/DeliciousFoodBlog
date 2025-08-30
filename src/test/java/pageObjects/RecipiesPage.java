package pageObjects;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipiesPage {

		  
		  @FindBy(xpath="//a[normalize-space()='Receipies']")
			 WebElement lnk_recipies;

		  
		 @FindBy(xpath ="//input[@placeholder='Search Recipes']")
		  WebElement lnk_searchBox;
		 
		 @FindBy(xpath ="//button[normalize-space()='Search']")
		  WebElement lnk_searchBtn;
		 
		 @FindBy(xpath ="//h4[@class='search-result-heading']")
		  WebElement lnk_confirmmessage;
		 
		
		 
		 public RecipiesPage(WebDriver driver) {
		     PageFactory.initElements(driver, this);
}

public void clickrecepies() {
	 lnk_recipies.click();
}

public void clicksearchBox() {
    lnk_searchBox.sendKeys("pasta");
}


public void submitsearchBtn() {
    lnk_searchBtn.submit();
}

public String getConfirmMessage() {
	try {
		
		return(lnk_confirmmessage.getText());// Returns the text of the confirmation message
	}
		catch(Exception e) {
			return(e.getMessage());// Returns the exception message in case of an error
	}
}

public List getDisplayedRecipeTitles() {
	return null;
}

}