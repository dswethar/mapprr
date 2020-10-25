
public class homebutton {




	public void home() throws InterruptedException {
		
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
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/offers_tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/tvEdit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/etUserName")).sendKeys("newuser1");
		Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/etUserMail")).sendKeys("test123@mapprr.com");
		Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/llStartSearch")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/tvProfile")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/tvCredits")).click();
		Thread.sleep(3000);
		//WebElement pro = driver.findElement(By.id("com.bts.consumer:id/tvCreditAmount"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			WebElement pro = driver.findElement(By.id("com.bts.consumer:id/tvCreditAmount"));
			System.out.println("Element Found");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(pro.isDisplayed())
		{
			System.out.println("Available mapprr credits are: " +pro.getText());
			
		}
		  else
	    Thread.sleep(3000);
		{
			WebElement pro1 = driver.findElement(By.id("com.bts.consumer:id/tvNoCredits"));
			System.out.println(pro1.getText());
		}
	     }
		catch (NoSuchElementException e) {
	    System.out.println("Element Not Found");
	     }
		Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.bts.consumer:id/tvPrescriptions")).click();
		driver.findElement(By.id("com.bts.consumer:id/addressTv")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.bts.consumer:id/tvDelete")).click();
		//Thread.sleep(1000);
		//WebElement pro2 = driver.findElement(By.id("android.widget.RelativeLayout"));
		//System.out.println(pro2.getText());
	    //driver.findElement(By.id("android:id/button1")).click();
		List <MobileElement> listElements = driver.findElements(By.id("com.bts.consumer:id/rvAddresses"));

		//for(MobileElement el : listElements){
		  // String expected = null;
	    //	if(el.getText().equalsIgnoreCase(expected)){
		       // do some validation //
	    //	   }
	    //	}
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/feedbackTv")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/etFeedback")).sendKeys("ddd");
		Thread.sleep(2000);
		driver.findElement(By.id("com.bts.consumer:id/btCheckout")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.bts.consumer:id/tvClearSearches")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.bts.consumer:id/logoutTv")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Yes']")).click();
		
	    }
		public static void main(String[] args) throws InterruptedException
		{
			homebutton obj = new homebutton();
			obj.home();
			
			
		}
	
}

	

