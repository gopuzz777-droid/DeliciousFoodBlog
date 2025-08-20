package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RecipiesPage;
import pageObjects.SavedPostPage;
import testBase.BaseClass;

public class TC_05SaveRecipe extends BaseClass {
	Logger logger = LogManager.getLogger(this.getClass());


	
	
	@Test(groups="sanity")
	
	public void testsave(){
        logger.info("===== Starting test: testsave =====");

		try {
			
			
			HomePage hp = new HomePage(driver);
            logger.info("Navigating to Login page");

	        hp.clickLogin();
	        
			 LoginPage loginPage = new LoginPage(driver);
	            logger.info("Entering login credentials");

		        loginPage.enterEmail("gopikatm@gmail.com");
		        loginPage.enterPassword("gopika@2002");
		        loginPage.clickLoginbtn();
		        
		        
			RecipiesPage rp=new RecipiesPage(driver);
            logger.info("Navigating to Recipes page");

			rp.clickrecepies();
			
			SavedPostPage save=new SavedPostPage(driver);
            logger.info("Selecting a recipe to save");

			save.clickItem();
			save.clicksaveRecipe();
			
            
			logger.info("Verifying if 'Unsave' button is visible");
			Assert.assertTrue(
				    save.isUnsaveButtonVisible(), "\"Unsave\" button should appear after saving");

			
		}catch (Exception e) {
		 }}}
