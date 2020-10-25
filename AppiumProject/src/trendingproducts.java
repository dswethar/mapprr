
public class trendingproducts {
	public Trendingproducts() {
		
	}

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
		driver.findElement(By.id("com.bts.consumer:id/mobileNumber")).sendKeys("1234567890");
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/sendBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.bts.consumer:id/otp1")).sendKeys("123456");
		driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
		Thread.sleep(4000);
		
		MobileElement 
		element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/tvOffersViewAll\")).getChildByText("
		    + "new UiSelector().className(\"android.widget.TextView\"), \"View All\")"));
		
        //Perform the action on the element
        element.click();
		//driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
        //Perform the action on the element
        //element.click();
        List<MobileElement> prod=driver.findElements(By.xpath("//android.support.v7.app.ActionBar$Tab[@index='0']"));
	    Thread.sleep(7000);
	    System.out.println("Total no of products is " +prod.size());
	    
	    for(WebElement pro : prod) 
	    {
	    	System.out.println(pro.getText());
	    } 
	            
	}


}

}
