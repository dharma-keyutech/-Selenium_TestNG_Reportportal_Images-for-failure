package Smoke_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import Base.all_xpaths;

public class Click_aboutus_nav_home extends Basetest implements all_xpaths{
	
	private static final Logger logger = LogManager.getLogger(Click_aboutus_nav_home.class);
	public static String BrowserName=System.getProperty("Browsername");
	@Test(groups={"Smoke"})
	
	public static void aboutus() throws IOException, InterruptedException{
		
		// To read The Property File 
				Properties prop=new Properties();
				/*FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");*/
				FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
				prop.load(ip);
		
     try{
				// Launching Browser
				
		launchBrowser(BrowserName);	 
		
		// Passing URL
		
		sendURL(prop.getProperty("BaseUrl"));
	 
     // Performing click on Element
		
      click(Aboutus);
     logger.info("Click on ABoutUs Sucessfully"); 
           Thread.sleep(3000);
           
           driver.navigate().back();
           logger.info("Navigating Back");
           
           
 	      
 		} catch (Exception e) {
 			

 				   /* logger.error("Test Fail", e);*/
 				    onTestFailure();
 				    driver.quit();
 				   Assert.fail("");
 					
 				}

 		       Basetest.quitBrowser();
 		       
 	}
 		
 		      
 	
 	}
 	