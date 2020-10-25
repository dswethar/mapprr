package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class newui {
	//static AndroidDriver driver;
		//public void FirstTest1() throws InterruptedException {
	    static AppiumDriver<MobileElement> driver = null;
	    
			public void setup() {
		            
			        //AppiumDriver<MobileElement> driver = null;
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
		    	    Thread.sleep(5000);
		    	    driver.findElement(By.id("com.bts.consumer:id/tv_explore")).click();
				    Thread.sleep(5000); 	
				    driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("1234567890");
					Thread.sleep(6000);
					driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
					Thread.sleep(4000);
					driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("123456");
					Thread.sleep(2000);
					driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
					Thread.sleep(4000);
					
				//	driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
				//	Thread.sleep(5000);
		    }	
		    public void exclusivestores() throws InterruptedException 
		    {    
		    	
		    	    AndroidElement peekaboo = (AndroidElement) driver.findElement(By.id("com.bts.consumer:id/tvHeading"));
				    MobileElement listGroup = peekaboo
	            		   .findElement(MobileBy
	                          .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	                                   + "new UiSelector().resourceid(\"com.bts.consumer:id/tvHeading\"))"));
		            driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
		            Thread.sleep(3000);
		    	    // driver.findElement(By.id("com.bts.consumer:id/ivCrossAds")).click();
		    	    // Thread.sleep(1000);
		            //  driver.findElement(By.id("com.bts.consumer:id/ivLarge")).click();
		            //  Thread.sleep(3000);
		            driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		            Thread.sleep(8000);
		            driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
		            Thread.sleep(12000);
		            MobileElement s1= (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvUnavailable"));
		            System.out.println(s1.getText());
		            Thread.sleep(3000);
		            driver.findElement(By.className("android.widget.ImageButton")).click();
		            Thread.sleep(5000);
		            driver.findElement(By.className("android.widget.ImageButton")).click();
		            Thread.sleep(1000);
		            driver.findElement(By.id("com.bts.consumer:id/ivSmall1")).click();
		            Thread.sleep(4000);
		            driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
		            Thread.sleep(5000);
		            driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/ivPlus")).click();
		            driver.findElement(By.id("com.bts.consumer:id/llProductSearch")).click();
		            driver.findElement(By.xpath("//com.bts.consumer:id/llCart[@index='0']")).click();
		            Thread.sleep(1000);
		            driver.findElement(By.id("com.bts.consumer:id/ivPlus")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/tvApplyPromoCode")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/etPromoCode")).sendKeys("MAPPRR25");
		            driver.findElement(By.id("com.bts.consumer:id/tvApply")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.xpath("//com.bts.consumer:id/llAddress[@index='1']")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("android.widget.ImageButton")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("android.widget.ImageButton")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("android.widget.ImageButton")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.id("com.bts.consumer:id/moreImage")).click();
		            Thread.sleep(2000);
		/*
		 * // AndroidElement list = (AndroidElement)
		 * driver.findElement(By.id("com.bts.consumer:id/layoutMore")); // MobileElement
		 * listGroup = list // .findElement(MobileBy //
		 * .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" // +
		 * "new UiSelector().resourceid(\"Logout\"))"));
		 */
		           
		            
		    }
		   public AndroidElement ScrollToElement(String by, String using) {
			    AndroidElement element = null;
			    int numberOfTimes = 10;
			    Dimension size = driver.manage().window().getSize();
			    int anchor = (int) (size.width / 2);
			    // Swipe up to scroll down
			    int startPoint = (int) (size.height - 10);
			    int endPoint = 10;	
			    for (int i = 0; i < numberOfTimes; i++) {
			        try {
			            new TouchAction(driver)
			                .longPress(point(anchor, startPoint))
			                .moveTo(point(anchor, endPoint))
			                .release()
			                .perform();
			            element = (AndroidElement) driver.findElement(by, using);
			            i = numberOfTimes;
			        } catch (NoSuchElementException ex) {
			            System.out.println(String.format("Element not available. Scrolling (%s) times...", i + 1));
			        }
			    }
			    return element;
		   }
		    private PointOption point(int anchor, int startPoint) {
			// TODO Auto-generated method stub
			return null;
		    }
			//public void scrolldown() throws InterruptedException{
		    //	  Object actions = TouchAction(driver)
		    //		        element = WebDriverWait(self.driver, 10).until(
		    //		            EC.presence_of_element_located((By.XPATH, "//android.widget.TextView[@text.contains='Medplus kphb Remedy Hospital']")))
		   // 		        actions.scroll_from_element(element, 10, 100)
		    //		        actions.scroll(10, 100)
		    //		        actions.perform()
		    //		        self.assertTrue(element.is_displayed())
		    //		        element.click()
		 //   }
		    public void moreprofile() throws InterruptedException
		    {
		    	AndroidElement list = (AndroidElement) driver.findElement(By.id("com.bts.consumer:id/more_tab"));
	            list.click();
	            Thread.sleep(4000);
	            driver.findElement(By.id("com.bts.consumer:id/rlOrders")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.id("com.bts.consumer:id/tvreOder")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.id("android:id/button1")).click();
	            Thread.sleep(5000);
	            driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
		    }
		    public void searchincategories() throws InterruptedException
		    {
		    	driver.findElement(By.id("com.bts.consumer:id/searchImage")).click();
		    	Thread.sleep(5000);
		    	driver.findElement(By.id("com.bts.consumer:id/searchBox")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("com.bts.consumer:id/searchBox")).sendKeys("oil");
		    	Thread.sleep(2000);
		    	driver.findElement(By.id("com.bts.consumer:id/searchBox")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("com.bts.consumer:id/llSearch")).click();
		        // driver.findElement(By.className("//android.widget.LinearLayout")).click();
		    	//driver.findElement(By.xpath("//android.widget.TextView[text()='Groceries']")).click();
		    	Thread.sleep(6000);
		    	driver.findElement(By.id("com.bts.consumer:id/tvQuickBuy")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("com.bts.consumer:id/tvQtyPopup")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//android.view.ViewGroup[@index='6']")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
		    	Thread.sleep(1000);
		        System.out.println("Test run successfully");
		    }
		    public static void main(String[] args) throws InterruptedException 
			{	
				       newui obj = new newui();
				       obj.setup();
				       obj.login();
				    //   obj.exclusivestores();
				       obj.searchincategories();
				    // obj.moreprofile();
			}
}
