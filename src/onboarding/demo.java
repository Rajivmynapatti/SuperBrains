package onboarding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.Browserselection;

public class demo extends Browserselection{
	
	
	WebDriver driver;
	@Test
	public void testprinting() throws Exception {
		
		driver=demo.startbrowser("Firefox", "http://php54.indianic.com/superbrains_wp/?lang=en");


JavascriptExecutor js = ((JavascriptExecutor) driver);

js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

System.out.println("yes i am done here");


	
	    List ele1=driver.findElements(By.id("et-footer-social-nav"));
	    System.out.println(ele1);
	    
	
		
		
		
		
	
	}

}
				