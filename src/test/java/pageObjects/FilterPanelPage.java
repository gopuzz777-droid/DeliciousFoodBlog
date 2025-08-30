package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPanelPage {

    public FilterPanelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);  

    }
    
    @FindBy(xpath="//a[normalize-space()='Receipies']")WebElement lnk_recipies;

   
    // Locate the "Add Filter" button
    @FindBy(xpath = "//h4[@class='ms-5']")WebElement lnk_addFilter;
    
    // Locate the "recipe type" button

    @FindBy(xpath = "//span[normalize-space()='Select Type']")WebElement lnk_recipeTypeSelect;

    @FindBy(xpath = "//li[normalize-space()='Vegetarian']")WebElement lnk_recipeInput;

    @FindBy(xpath = "//span[normalize-space()='Select Category']")WebElement lnk_categorySelect;
    
    @FindBy(xpath = "//li[normalize-space()='Appetizer']")WebElement lnk_categoryInput;
    
    @FindBy(xpath = "//input[@id='most_rated']")WebElement lnk_mostratedSelect;
    
    @FindBy(xpath = "//button[normalize-space()='Filter']") WebElement lnk_applyfilterBtn;
    

    //methods
   public void clickrecepies() {
   	 lnk_recipies.click();
    
   }
   	 
     public void addFilterlabel() {
    	lnk_addFilter.click();    
    	
     }

    public void recipeType() {
    	lnk_recipeTypeSelect.click();
    }

    public void inputRecipe(String value) {
    	lnk_recipeInput.click();
    	
    	
    }

    public void categoryType() {
    	lnk_categorySelect.click();
    
    }
    public void inputCategory(String value) {
        lnk_categoryInput.click();
    }
    
    public void mostRated() {
    	lnk_mostratedSelect.click();
    	lnk_mostratedSelect.isSelected();
    
    }

    public void filterBtn() {
    	lnk_applyfilterBtn.click();
    }
            
    }
