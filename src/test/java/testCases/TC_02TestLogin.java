package testCases;


	import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
	import pageObjects.HomePage;
	import pageObjects.LoginPage;
import testBase.BaseClass;

	public class TC_02TestLogin extends BaseClass {
		Logger logger = LogManager.getLogger(this.getClass());

		

			@Test(groups="regression")
				public void testlogin()throws InterruptedException{
		        logger.info("===== Starting Login Test =====");

				try {
					 HomePage hp = new HomePage(driver);
			            logger.info("Navigating to Login page via HomePage");

				        hp.clickLogin();

				     LoginPage loginPage = new LoginPage(driver);
				        loginPage.enterEmail(generateRandomEmail()+"@gmail.com");
			            logger.info("Entering email");

				        loginPage.enterPassword("gopika@2002");
			            logger.info("Entering password");

				        loginPage.clickLoginbtn();
			            logger.info("Clicking Login button");

						loginPage.clickHomelbl();
			            logger.info("Verifying home label is visible");

					
				
						Assert.assertTrue(
						        loginPage.isHomeLabelVisible(),"Login failed: Home label is not visible");
			            logger.info("Login successful, Home label visible. Test PASSED");


				   
			 }catch (Exception e) {
		            logger.error("Exception during login test execution", e);

				
			 }
			}
			}
	

			
			
		


