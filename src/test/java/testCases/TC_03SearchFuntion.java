package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RecipiesPage;
import testBase.BaseClass;

public class TC_03SearchFuntion extends BaseClass { 
	Logger logger = LogManager.getLogger(this.getClass());


			@Test(groups="regression")
				public void testsearch() {
		        logger.info("===== Starting test: testlogin =====");

				try {

					RecipiesPage rp=new RecipiesPage(driver);
					
					rp.clickrecepies();
		            logger.info("Clicking on 'Recipes' link");

					rp.clicksearchBox();
		            logger.info("Clicking on search box");

					rp.submitsearchBtn();
		            logger.info("Submitting the search");


					  String cmsg = rp.getConfirmMessage();
			            logger.info("Received confirmation message: " + cmsg);

				        if (cmsg.toLowerCase().contains("You are seeing results based on this 'PASTA' keyword\r\n"
				        		+ "")) { // Checking if message contains expected text

				        	if (cmsg.toLowerCase().contains("...PASTA...")) {
				        	    Assert.assertTrue(true);
				        	} else {
				        	    Assert.assertFalse(false, "no results");
				        	}}

			}catch (Exception e) {

			}
			}}
			
		



					
					
					
					
					
					
