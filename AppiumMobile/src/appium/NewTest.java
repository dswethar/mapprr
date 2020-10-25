package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NewTest {
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
	        Thread.sleep(3000); 	
			driver.findElement(By.id("com.bts.consumer:id/et1")).click();
			//driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys(Keys.ENTER);
			driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("1234567890");
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("123456");
			driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
			Thread.sleep(5000);
			System.out.println("Logged in successfully"); 
		
   }	
   
        //  driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
   public void instore() throws InterruptedException
   {        
	        driver.findElement(By.xpath("//android.widget.TextView[@text='Grocery']")).click();
	       // driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='0']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
	        Thread.sleep(8000);
	        driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
	        Thread.sleep(3000);
	       // driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
	       // Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/rlItemAdded")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/llPlus")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("com.bts.consumer:id/llPlus")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//android.widget.TextView[@index='3']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();
	        Thread.sleep(6000);
	       
   }
   public void logout() throws InterruptedException 
   { 
	        driver.findElement(By.id("com.bts.consumer:id/more_tab")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/tvLogout")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("//android:id/button1")).click();
   }
  
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 NewTest obj = new NewTest();
	       obj.setup();
	       obj.login();
	      // obj.logout();
	       obj.instore();
	}

}
