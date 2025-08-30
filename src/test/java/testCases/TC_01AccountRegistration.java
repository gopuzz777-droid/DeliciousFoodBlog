package testCases;



import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClass;
	

	public class TC_01AccountRegistration extends BaseClass {
		Logger logger = LogManager.getLogger(this.getClass());

		

	@Test(groups="sanity")
	public void testAccountReg() throws InterruptedException{
        logger.info("===== Starting Account Registration Test =====");

		try {
			HomePage hp = new HomePage(driver);
            logger.info("Clicking on Login link");
            hp.clickLogin();
            
            logger.info("Clicking on Sign Up link");
            hp.clickSignUp();
		
			   
            new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("signupFrame"));
			
			SignupPage sp=new SignupPage(driver);
			sp.setFirstName("Gopika");// Setting first name
            logger.info("Entering first name: Gopika");

			sp.setLastName("Manikandan");// Setting last name
            logger.info("Entering last name: Manikandan");

			sp.setEmail(randomString()+"@gmail.com");// Setting email
            logger.info("Entering email");

            logger.info("Entering phone number");
            sp.setPhoneNumber("9123456789");// Setting phone number
			
			sp.setPassword("gopika@2002");// Setting password
            logger.info("Setting password ");

			sp.setConfirmPassword("gopika@2002"); // Confirming password
            logger.info("confirming password ");

			sp.clickGender("female");// Selecting gender
            logger.info("Selecting gender: female");

			sp.choosefile("D:\\Automation MiniProject.jpg");//uploading photo
            logger.info("Uploading profile picture");

			sp.clickRegister();// Clicking the register button
            logger.info("Clicking Register button");

			
        String cmsg = sp.getConfirmMessage();
        logger.info("Confirmation message received: {}", cmsg);
        if (cmsg.toLowerCase().contains("Registration Successfull")) {
            logger.info("Account creation confirmed. Test PASSED.");
            Assert.assertTrue(true);
        } else {
            logger.error("Unexpected confirmation message: {}", cmsg);
            Assert.fail("Account creation failed - confirmation message mismatch");
        }

	        
		} catch (Exception e) {// Handling exceptions
            logger.error("Exception during test execution", e);


	        

		}}
			}
	
