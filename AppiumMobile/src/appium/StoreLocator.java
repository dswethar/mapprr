package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class StoreLocator {
	
	//static AndroidDriver driver;
	//private static final boolean MobileElement = false;

	public void storelocator1() throws InterruptedException 
	{
		AppiumDriver<MobileElement> driver = null;
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "MyPhone");
		caps.setCapability("udid", "11ec813a"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
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
		
	//	driver.findElement(By.id("com.bts.consumer:id/skipBtn")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).click();
		driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys("1234567890");
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/sendBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/otp1")).sendKeys("123456");
		driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/profile_tab")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/relativeLayout")).click();
		Thread.sleep(2000);
		MobileElement s1 = (MobileElement) driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']"));
		System.out.println(s1.getText());
		//MobileElement s2 = s1.findElement(By.xpath("//android.widget.LinearLayout[@index='4']"));
		//s2.click();
		Thread.sleep(2000);
		s1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		
		//if(driver.findElement(By.xpath("//android.widget.TextView[@text='Notify me']"));)
	//	{
		//	MobileElement s3 = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Notify me']"));
		//	s3.click();
		//	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		//	Thread.sleep(2000);
		//	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		//	Thread.sleep(2000);
		//	driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).click();
		//	Thread.sleep(2000);
		//	break;
			
		 }			
		//else
		//		{
		//		break;
		//	}	
			
	
		
		
		



	public static void main(String[] args) throws InterruptedException {
		StoreLocator obj = new StoreLocator();
		obj.storelocator1();

	}
}
