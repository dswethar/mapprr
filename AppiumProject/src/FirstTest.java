import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class FirstTest {
	
        static AppiumDriver<MobileElement> driver = null;
	
 
	    public void setup() {
	            
		      //  AppiumDriver<MobileElement> driver = null;
				//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "MyPhone");
				caps.setCapability("udid", "4b626e29"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "6.0.1");
				caps.setCapability("automationName", "UiAutomator2");
				caps.setCapability("appPackage", "com.bts.consumer");
				caps.setCapability("appActivity", "com.bts.consumer.SplashScreen");
				caps.setCapability("newCommandTimeout", "90");
				caps.setCapability("noReset", "true");
			

				//Instantiate Appium Driver
				try {
					  driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
					
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
	    }
	    public void login() throws InterruptedException 
	    {       
	    	    driver.findElement(By.id("com.bts.consumer:id/skipBtn")).click();
			    Thread.sleep(3000); 	
				driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).click();
				//driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys("1234567890");
				Thread.sleep(4000);
				driver.findElement(By.id("com.bts.consumer:id/sendBtn")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("com.bts.consumer:id/otp1")).sendKeys("123456");
				driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
				Thread.sleep(5000);
	    }	
	    public void popcategories() throws InterruptedException 
	    {	
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Food & Groceries']")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.bts.consumer:id/tvPrice")).click();
				Thread.sleep(4000);
	    }
	   public void checkout() throws InterruptedException{		
				driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
				Thread.sleep(4000);
	     		driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("com.bts.consumer:id/ivPlus")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.bts.consumer:id/ivSelect")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.bts.consumer:id/llProceedToPay")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
				Thread.sleep(5000);
				System.out.println("Test run successfully");
	         }
		
		  
       public  void scrollDown(WebElement scroll, String tillLastLink) throws InterruptedException {

			  JavascriptExecutor js = (JavascriptExecutor) driver;

			  HashMap<String, String> scrollObject = new HashMap<String, String>();

			  scrollObject.put("direction", "down");

			  scrollObject.put("View All", tillLastLink);

			  scrollObject.put("element", (RemoteWebElement) scroll).getId());

			  js.executeScript("mobile: scrollTo", scrollObject);
			  
			  WebElement scrollableView = driver.findElement(By.id("com.bts.consumer:id/rvOffers"));
			  }
      
      
		      
		  
		  
	  
				//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
				//WebDriverWait wait = new WebDriverWait(driver, 300); 
				//RemoteWebElement element1 =(RemoteWebElement) wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText"))); 
		        //element1.sendKeys("1234567890");

				
				
				//driver.startActivity(new Activity("appActivity", "com.bts.consumer.OTPActivity"));
                //caps.setCapability("com.bts.consumer", "com.bts.consumer.OTPActivity");
			   //RemoteWebDriver driver = null;
			   //((StartsActivity) driver).startActivity(new Activity("com.bts.consumer", "com.bts.consumer.OTPActivity"));
			   //driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		      //MobileElement elementOne = (MobileElement) driver.findElementByClassName("android.widget.EditText");
			   //elementOne.sendKeys("1234567890");
	public static void main(String[] args) throws InterruptedException 
	{	
		       FirstTest obj = new FirstTest();
		       obj.setup();
		       obj.login();
		       WebElement scrollableView = driver.findElement(By.id("com.bts.consumer:id/rvOffers"));
			   obj.scrollDown(scrollableView, "View All");
		       
		       //obj.popcategories();
		       //obj.checkout();
		
	}

}


