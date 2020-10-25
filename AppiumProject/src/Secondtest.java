
public class Secondtest {
	

	   public static void main(String[] args) throws InterruptedException {
		   AppiumDriver<MobileElement> driver = null;
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
			
			driver.findElement(By.id("com.bts.consumer:id/skipBtn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).click();
			//driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys(Keys.ENTER);
			driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys("1234567890");
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/sendBtn")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/otp1")).sendKeys("123456");
			driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("com.bts.consumer:id/searchBox")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.bts.consumer:id/searchBox")).sendKeys("Crocin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Crocin pain relief tab']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.bts.consumer:id/llAddToCart")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/ivPlus")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("com.bts.consumer:id/ivMinus")).click();
			Thread.sleep(2000);
		    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		    Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/cart_tab")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/tvAddPromoCode")).click();
	        driver.findElement(By.id("com.bts.consumer:id/etPromoCode")).sendKeys("MAPPRR15");
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/tvApplyPromoCode")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/tvPlus")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("com.bts.consumer:id/etAddress")).sendKeys("plot no 12");
	        
	        
	        
	        
	        

	}

}


}
