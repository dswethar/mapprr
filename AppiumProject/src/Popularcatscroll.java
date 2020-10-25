
public class Popularcatscroll {

	public void popularcatscroll() throws InterruptedException 
	{
		
		//Logger logger=Logger.getLogger("Appium1");
	    //PropertyConfigurator.configure("log4j.properties");
		
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
		Thread.sleep(4000);
		
	    AndroidElement list = (AndroidElement) driver.findElement(By.id("com.bts.consumer:id/tvStoresViewAll"));
        MobileElement listGroup = list
              .findElement(MobileBy
                     .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                              + "new UiSelector().resourceid(\"View All\"))"));
        
        assertNotNull(listGroup.getLocation());
        Thread.sleep(2000);
        listGroup.click();
	}
      //  public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        //    RemoteWebDriver driver;
		//	Dimension size = driver.manage().window().getSize();
          //  int anchor = (int) (size.width * anchorPercentage);
         //   int startPoint = (int) (size.height * startPercentage);
         //   int endPoint = (int) (size.height * endPercentage);
    
      //      new TouchAction(driver)
        //            .press(point(anchor, startPoint))
          //          .waitAction(waitOptions(ofMillis(1000)))
            //        .moveTo(point(anchor, endPoint))
              //      .release().perform();
       // }
     	//MobileElement 
		//element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/tvStoresViewAll\")).getChildByText("
		//	+ "new UiSelector().className(\"android.widget.TextView\"), \"View All\")"));
		
        //Perform the action on the element
        //element.click();
       public void scrollDown() 
       {
        	
        	Dimension dimension = MobileDriver.getDriver().manage().window().getSize();
        	Double scrollHeightStart = dimension.getHeight()*0.5;
         	int scrollStart = scrollHeightStart.intValue(); 
        	
        	Double scrollHeightEnd = dimension.getHeight()*0.2; 
        	int scrollEnd = scrollHeightEnd.intValue(); 
        	  
        	new TouchAction((PerformsTouchActions)MobileDriver.getDriver())
            .press(PointOption.point(0,scrollStart))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
            .moveTo(PointOption.point(0,scrollEnd))
            .release().perform();
        }
        	
       
        
        List<MobileElement> prod=driver.findElements(By.id("com.bts.consumer:id/tvStore"));
	    Thread.sleep(7000);
	    System.out.println("Total no of products is " +prod.size());
	    
	     for(WebElement pro : prod) 
	      {
	        System.out.println(pro.getText());
	       } 
	    //logger.info("Got the product details");
	    
	     Thread.sleep(3000);
         driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']")).click();
         
        
        
        
        
        
       MobileElement 
		element1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/inStoreSearch\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.LinearLayout\"), \"View All\")"));
        
        MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
			//	"new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/items\")).setAsVerticalList().scrollIntoView("
			//	+ "new UiSelector().descriptionContains(\"Family\"))"));
		
		//Perform the action on the element
		//System.out.println(element.getAttribute("id"));
	  }
        public static void main(String[] args) throws InterruptedException {
        	Popularcatscroll obj = new Popularcatscroll();
        	obj.popularcatscroll();
        	
        }
       
}


}
