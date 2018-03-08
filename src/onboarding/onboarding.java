package onboarding;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Helper.Browserselection;
public class onboarding  extends Browserselection{
	
	WebDriver driver;
	int y=1; 
	int r = 0;
	int z=1;
	@Test(dataProvider="array")
	
	public void testBefore(String URL, String Name ,String Pass, String Des, String DOB) throws Exception	
	{
		driver=onboarding.startbrowser("firefox", URL);
		WebElement lang=driver.findElement(By.id("radio1"));
		Helper.HighlightElement.highLightElement(driver, lang);
		lang.click();
		
		Thread.sleep(2000);
		
	//registration page start from here.
		
		WebElement register=driver.findElement(By.xpath("//a[@href='register.html']"));
		Helper.HighlightElement.highLightElement(driver, register);
		register.click();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	
		
		WebElement name=driver.findElement(By.id("vName"));
		Helper.HighlightElement.highLightElement(driver, name);
		name.sendKeys(Name);
			r++;
		
		System.out.println(r);
		
		 String User = "pk"+r+"@grr.la";
		 String SN = "Pradeep"+r;
		 
		WebElement email=driver.findElement(By.id("vEmail"));
		Helper.HighlightElement.highLightElement(driver, email);
		email.sendKeys(User);
		
		WebElement password=driver.findElement(By.id("vPassword"));
		Helper.HighlightElement.highLightElement(driver, password);
		password.sendKeys(Pass);
		
		driver.findElement(By.id("IsVerify")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnregister")).click();
	
	Thread.sleep(2000);
	
	if(driver.getCurrentUrl().equals("http://52.57.40.194/register.html"))
	{
		onboarding.css(driver);
		driver.quit();
	}
	
	// On-boarding process starts from here.
	
	driver.findElement(By.cssSelector(".btn.btn-default.btn-trans")).click();

			Thread.sleep(3000);
	
			
		
			
   driver.findElement(By.xpath("//div[" +y+ "]/label")).click();
if(y<=2) {
	y++;
}else {
	y=1;
}
	
			Thread.sleep(2000);
			WebElement next=driver.findElement(By.xpath("//form/button"));
			next.click();
					
			WebDriverWait wait4 = new WebDriverWait(driver, 100);   
			wait4.until(ExpectedConditions.urlContains("http://52.57.40.194/onboarding-species.html"));
			driver.findElement(By.xpath("//div["+z+"]/label")).click();
			if(z<=1) {
				z++;
			}else {
				z=1;
			}
driver.findElement(By.xpath("//button[@id='gender-submit']")).click();
      		Thread.sleep(1000);
      		driver.findElement(By.xpath("//div/button")).click();
      
      		driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
      		Thread.sleep(2000);
      		System.out.println("date of birth ="+DOB);
      		
      		JavascriptExecutor js=(JavascriptExecutor)driver;
      		js.executeScript("document.getElementById('birthday_date').value="+DOB+"");
      		driver.findElement(By.xpath(".//*[@id='obCarousel']")).click();
      		Thread.sleep(1000);
 driver.findElement(By.xpath("//form/button")).click();
  		
 			Thread.sleep(3000);
     	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\Autouploading3.exe");
   
   
   		WebDriverWait wait = new WebDriverWait(driver, 30);   
   		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.inner-default-width.your-avtar.active.display-none")));
   	
   		driver.findElement(By.id("addAvatarImage")).click();
   
   		driver.findElement(By.xpath(".//*[@id='addContentToLocal']")).click();
   
   		driver.findElement(By.cssSelector(".btn.btn-info-big.btn-show-to-all")).click();
   
   		WebDriverWait wait1 = new WebDriverWait(driver, 100);   
   		wait1.until(ExpectedConditions.urlContains("http://52.57.40.194/onboarding-screen.html"));      
   		
   		WebElement Screenn=driver.findElement(By.id("vScreenName"));
		Helper.HighlightElement.highLightElement(driver, Screenn);
		Screenn.sendKeys(SN);
   		
   		WebElement Status=driver.findElement(By.id("vStatus"));
		Helper.HighlightElement.highLightElement(driver, Status);
		Status.sendKeys(Des);
   		
   		Thread.sleep(1000);
   		
   		driver.findElement(By.xpath("//form/button")).click();
 		
   		WebDriverWait wait2 = new WebDriverWait(driver, 100);   
 		wait2.until(ExpectedConditions.urlContains("http://52.57.40.194/onboarding-goals.html"));   
 
 		driver.navigate().refresh();
 	
 		List<WebElement> goals =driver.findElements(By.xpath(".//*[@id='yourGoals']/form/div"));
 		System.out.println(goals.size());
 		
 	
 		
 		int i = 1;
 		
 		System.out.println(driver.findElement(By.xpath(".//*[@id='yourGoals']/form/div[" + i + "]")).getText());


 			for (i=0; i<goals.size(); i++) {
 		 		 
 		 		goals.get(i).click();
 		 		
 		 		
 	 		
}
 			Thread.sleep(1000);
 			driver.findElement(By.xpath("//form/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/button")).click();
			WebDriverWait wait3 = new WebDriverWait(driver, 100);   
			wait3.until(ExpectedConditions.urlContains("http://52.57.40.194/onboarding-commitment.html"));   

			driver.findElement(By.xpath("//form/button")).click();
			Thread.sleep(5000);
		
			
			
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/button")).click();
			
WebDriverWait wait5= new WebDriverWait(driver,30);
wait5.until(ExpectedConditions.urlContains("http://52.57.40.194/user-video.html"));

driver.findElement(By.xpath(".//*[@id='video-start-button']")).click();

WebDriverWait wait6= new WebDriverWait(driver, 30);
wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='confirmModal']/div/div/div")));

driver.findElement(By.xpath(".//*[@id='confirmModal']/div/div/div/div/button")).click();
			driver.navigate().to("http://52.57.40.194/onboarding-what-are-you.html");
			
driver.close();


			}
	


	
	@DataProvider(name="array")	
	public Object[][] passdata(){		
	
		 Object[][] data = new Object[4][5];
		 int col=0;
		for(int row=0; row<=3; row++)
		{
	        	 data[row][col]= "http://52.57.40.194/";
	     		data[row][col+1]= "Sarath Maya";		
	     		data[row][col+2]= "123456";
	       		data[row][col+3]= "QA and Testing";
	     		data[row][col+4]= "'03-22-2017'";
		         
	         }
		
		return data;
	}
		


	
	}

/*driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get(URL);*/


//beside of @Test (dataProvider="enteries") 

/*	@DataProvider(name="enteries")
public Object[][] passdata(){


	Object[][] data= new Object[2][5];	
	data[0][0]= "http://52.57.40.194/";
	data[0][1]= "Manoj kumar";		
	data[0][2]= "123456";
	data[0][3]= "QA and Testing";
	data[0][4]= "'03-03-2017'";
	
	data[1][0]= "http://52.57.40.194/";
	data[1][1]= "Pravin Chaudari";
	data[1][2]= "123456";
	data[1][3]= "QA and Testing"; 
	data[1][4]= "'14-10-1982'";
	return data; 
*/
	

	


