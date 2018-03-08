package Helper;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Browserselection {
	
static 	WebDriver driver;
	
	public static WebDriver startbrowser(String browser, String Url) throws Exception {


		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver2.20\\chromedriver.exe");
			
		
			driver= new ChromeDriver();
			
			
		}else if(browser.equalsIgnoreCase("Firefox")){
			
			driver= new FirefoxDriver();
			
				
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Url);
		return driver;
		
	}
	
	 public static void css(WebDriver ldriver){
		 
		  // Take screenshot and store as a file format
		  File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		try {
		  // now copy the  screenshot to desired location using copyFile method
		 
		 FileUtils.copyFile(src, new File("C:/Screenshots/"+System.currentTimeMillis()+".png"));
		       }
		 
		catch (IOException e)
		 
		{
		 
		System.out.println(e.getMessage());
		 
		    }
		 
		}


}
