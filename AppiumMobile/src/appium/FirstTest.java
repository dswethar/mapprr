package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FirstTest {
	//static AndroidDriver driver;
	//public void FirstTest1() throws InterruptedException {
    static AppiumDriver<MobileElement> driver = null;
	

	    public void setup() {
	            
		      //  AppiumDriver<MobileElement> driver = null;
				//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "MyPhone");
				caps.setCapability("udid", "48d49708"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "9.0");
				caps.setCapability("automationName", "UiAutomator2");
				caps.setCapability("appPackage", "com.bts.consumer");
				caps.setCapability("appActivity", "com.bts.consumer.SplashScreen");
				caps.setCapability("newCommandTimeout", "90");
				caps.setCapability("noReset", "true");
			

				//Instantiate Appium Driver
				try {
					  driver = new  AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
					
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
	    	    driver.findElement(By.id("com.bts.consumer:id/tv_explore")).click(); 
	    	    //  driver.findElement(By.id("com.bts.consumer:id/skipBtn")).click();
		        Thread.sleep(6000); 	
		        WebElement element=driver.findElement(By.id("com.bts.consumer:id/mobileNumber"));
				element.click();
				Thread.sleep(3000);
				// SeleniumWait.withDriver(driver).withTimeOut(15).forElementToClick(element);
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
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Groceries']")).click();
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

			  scrollObject.put("element",( (RemoteWebElement) scroll).getId());

			  js.executeScript("mobile: scrollTo", scrollObject);
			  
			  WebElement scrollableView = driver.findElement(By.id("com.bts.consumer:id/rvOffers"));
			  }
       
       public void horizontalscroll() throws InterruptedException{
             
    	   
    	   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
   				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/catRV\")).setAsHorizontalList().scrollIntoView("
   				+ "new UiSelector().textContains(\"Books & Stationery\"))"));
   		   element.click();
   		   Thread.sleep(4000);
   		   MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
    				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/rvProducts\")).setAsVerticalList().scrollIntoView("
    				+ "new UiSelector().textContains(\"Water colour tubes 5 ml\"))"));
    		   element1.click();
    		  
    	  
    	}
       public void bookandstat() throws InterruptedException{
    	   
         MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
      				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/catRV\")).setAsHorizontalList().scrollIntoView("
      				+ "new UiSelector().textContains(\"Books & Stationery\"))"));
      		   element.click();
    	   
         MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/rvProducts\")).setMaxSearchSwipes(5).scrollIntoView("
				+ "new UiSelector().textContains(\"Magic tape  19.0mm x 32.9m\"))"));
		
		//Perform the action on the element
		 System.out.println(element1.getText()); 
		 element1.click();
         driver.findElement(By.id("com.bts.consumer:id/tvWriteReview")).click();
         driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
         driver.findElement(By.id("com.bts.consumer:id/etRating")).sendKeys("A good product");
         driver.findElement(By.id("com.bts.consumer:id/btSubmit")).click();
         driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
         driver.findElement(By.id("com.bts.consumer:id/searchBox")).click();
        
         
         
       }
       public void pharmacy() throws InterruptedException{
    	   
           MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
         				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/catRV\")).setAsHorizontalList().scrollIntoView("
         				+ "new UiSelector().textContains(\"Pharmacy\"))"));
         		   element.click();
       	   
           MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
   				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/htab_tabs\")).setMaxSearchSwipes(5).scrollIntoView("
   				+ "new UiSelector().textContains(\"Powders on sale\"))"));
   		
   		//Perform the action on the element
   		System.out.println(element1.getText()); 
   		element1.click();
   		driver.findElement(By.xpath("//com.bts.consumer:id/llProductSearch[@index=0]")).click();
   		Thread.sleep(3000);
   		driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
   		Thread.sleep(2000);
         		
	  
    }		
       public void offersviewall() throws InterruptedException{
    	    MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
    				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/scrollView\")).setAsVerticalList().scrollIntoView("
    				+ "new UiSelector().textContains(\"Offers near you\"))"));
    	    driver.findElement(By.id("com.bts.consumer:id/tvOffersViewAll")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/offersBg")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/tvNotify")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/ivOffers")).click();
    	    Thread.sleep(2000);
    	    driver.findElement(By.xpath("//android.widget.LinearLayout[@index=0]")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
    	    Thread.sleep(2000);
    	    driver.findElement(By.xpath("//android.widget.RelativeLayout[@index=1]")).click();
    	    driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/tvAddPromoCode")).click();
    	    Thread.sleep(3000);
    	    driver.findElement(By.id("com.bts.consumer:id/etPromoCode")).sendKeys("MAPPRR25");
    	    Thread.sleep(2000);
    	    driver.findElement(By.id("com.bts.consumer:id/tvApplyPromoCode")).click();
    	    driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
    	    Thread.sleep(2000);
    	    driver.findElement(By.id("com.bts.consumer:id/ivSelect")).click();
    	    driver.findElement(By.id("com.bts.consumer:id/btProceedToPay")).click();
    	    Thread.sleep(3000);
    	    MobileElement s1 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/productName"));
    		System.out.println("Product name is:" +s1.getText());
    		MobileElement s2 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/brandName"));
      		System.out.println("Brand name is:" +s2.getText());
      		MobileElement s3 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvPrice"));
      		System.out.println("Price is:" +s3.getText());
      		MobileElement s4 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddressTag"));
      		System.out.println("The address is:" +s4.getText());
      		MobileElement s5 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddress"));
      		System.out.println(s5.getText());
      		driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
      		
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
		       //WebElement scrollableView = driver.findElement(By.id("com.bts.consumer:id/rvOffers"));
			   //obj.scrollDown(scrollableView, "View All");
		       // obj.popcategories();
		      // obj.checkout();
		       // obj.horizontalscroll();
		       // obj.verticalscroll();
		     // obj.popbrandsscroll();
		      // obj.offersviewall();
		       obj.pharmacy();
	}

           }



