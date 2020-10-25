package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Offers {
	//static AndroidDriver driver;
public Offers() {
		
	}

	public static void main(String[] args) throws InterruptedException {
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
		
		//driver.findElement(By.id("com.bts.consumer:id/skipBtn")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).click();
		//driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys("1234567890");
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/sendBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/otp1")).sendKeys("123456");
		driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
		Thread.sleep(5000);
	    driver.findElement(By.id("com.bts.consumer:id/ivOffer")).click();
		//driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index='1']")).click();
		driver.findElement(By.id("com.bts.consumer:id/ivOffer")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/tvPrice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/tvWriteReview")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
		driver.findElement(By.id("com.bts.consumer:id/etRating")).sendKeys("Useful product");
		driver.findElement(By.id("com.bts.consumer:id/btSubmit")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("com.bts.consumer:id/ivClose")).click();
		driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
		driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/ivSelect")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/llProceedToPay")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
		Thread.sleep(3000);
		System.out.println("Test run successfully");
		
		
		
	}


}
