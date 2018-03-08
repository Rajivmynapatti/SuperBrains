package onboarding;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Helper.Browserselection;

public class Windowshandles extends Browserselection {

	WebDriver driver;
	@Test
	public  void win() throws Exception {
	driver=Windowshandles.startbrowser("Chrome", "http://the-internet.herokuapp.com/login");
	driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");

	driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
	
	WebElement login=driver.findElement(By.xpath(".//button[@class='radius']"));
	login.click();
	
	String parent_window=driver.getWindowHandle();
	
	WebDriverWait wait= new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Elemental Selenium']"))).click();

	
	System.out.println("Footer button has been clicked.");
	

	
	
	Set<String> allWindows = driver.getWindowHandles();
	for(String curWindow : allWindows){
	    driver.switchTo().window(curWindow);
	}
		
		
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebDriverWait wait1= new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		System.out.println(ele.getText());
				ele.click();
		Windowshandles.css(driver);
				
		Thread.sleep(1000);
		driver.close();
	
		driver.switchTo().window(parent_window);
		

		Thread.sleep(1000);

		//driver.close();

	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			try{
				
				Windowshandles.css(driver);
				System.out.println("Failure Screenshot has been taken");
			}
			
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
			}
		driver.close();
	}
	}
		
		
	

