package testBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	//Declare driver variables
	public WebDriver driver;
	public org.apache.logging.log4j.Logger logger;

	
	@BeforeClass
	@Parameters("br")
    public void setup(@Optional("chrome")String br) {

		//configuring logging
				logger=LogManager.getLogger(this.getClass());
				//configuring browser
				switch(br.toLowerCase()) {
				case "chrome":driver=new ChromeDriver();break;
				case "edge":driver=new EdgeDriver();break;
				default:System.out.println("invalid browser");return;
				}


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://deliciousrecipies.pythonanywhere.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}	
	//Method for random string generation
	public String randomString() {
	String generatedString=RandomStringUtils.randomAlphabetic(5).toLowerCase();
		System.out.println("the generated string is :"+generatedString);
	return generatedString+"gmail.com";

	}
	
	public String generateRandomEmail() {
        String randomString = RandomStringUtils.randomAlphanumeric(10).toLowerCase();
		System.out.println("the generated string is :"+randomString);
		return randomString + "@gmail.com";
    }
    
	

		
				
				
			
			}


			
			