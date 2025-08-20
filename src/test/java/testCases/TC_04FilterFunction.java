package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FilterPanelPage;
import pageObjects.RecipiesPage;
import testBase.BaseClass;

public class TC_04FilterFunction extends BaseClass { 
	Logger logger = LogManager.getLogger(this.getClass());

	
@Test(groups="regression")

public void testFilter() {
    logger.info("===== Starting test testFilter =====");

	try {
		
		RecipiesPage rp=new RecipiesPage(driver);
		rp.clickrecepies();
		
		FilterPanelPage fp=new FilterPanelPage(driver);
		fp.recipeType();
        logger.info("Selecting recipe type");

		fp.inputRecipe("Vegetarian");
        logger.info("Entering Recipe: Vegetarian");

		fp.categoryType();
        logger.info("Selecting category type");

		fp.inputCategory("Appetizer");
        logger.info("Entering Category: Appetizer");

		fp.mostRated();
        logger.info("Applying most rated filter and clicking 'Filter' button");

		fp.filterBtn();
        logger.info("Filter applied successfully");

	
	}catch (Exception e) {
	
	}}
		
@Test
		 public void verifyAppetizerKeywordPresent() {
    logger.info("===== Starting test: verifyAppetizerKeywordPresent =====");

		        String pageContent = driver.getPageSource();

		        Assert.assertTrue( pageContent.contains("Appetizer"),"Expected keyword 'Appetizer' not found on the page");
		        logger.info("Checking if 'Appetizer' keyword is present on the page: " + pageContent);

}}  

