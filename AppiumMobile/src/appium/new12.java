package appium;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;

	public class new12 {
		//static AndroidDriver driver;
			//public void FirstTest1() throws InterruptedException {
		    static AppiumDriver<MobileElement> driver = null;
			

			    public void setup() {
			            
				        //AppiumDriver<MobileElement> driver = null;
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
					    Thread.sleep(3000); 	
					    driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("1234567890");
						Thread.sleep(4000);
						driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
						Thread.sleep(4000);
						driver.findElement(By.id("com.bts.consumer:id/et1")).sendKeys("123456");
						Thread.sleep(2000);
						driver.findElement(By.id("com.bts.consumer:id/ivLogin")).click();
						Thread.sleep(6000);
						
					//	driver.findElement(By.id("com.bts.consumer:id/verifyBtn")).click();
					//	Thread.sleep(5000);
			    }	
              public void exclusivestores() throws InterruptedException
              {
            	       driver.findElement(By.id("com.bts.consumer:id/llStoreCard")).click();
            	       Thread.sleep(2000);
            	       driver.findElement(By.xpath("//android.widget.LinearLayout[@index=2]")).click();
            	       Thread.sleep(2000);
            	       driver.findElement(By.xpath("//android.widget.LinearLayout[@index=0]")).click();
            	       Thread.sleep(11000);
            	       driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
                       Thread.sleep(3000);      	       
                       driver.findElement(By.id("com.bts.consumer:id/rlSlide")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/llCart")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/llPlus")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/llPlus")).click();
                       Thread.sleep(1000);
                       driver.findElement(By.id("com.bts.consumer:id/llMinus")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/tvAddMore")).click();
                       Thread.sleep(8000);
                      // driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index=1]")).click();
                      // Thread.sleep(3000);
                       driver.findElement(By.id("com.bts.consumer:id/tvAdd")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/rlSlide")).click();
                       Thread.sleep(1000);
                       driver.findElement(By.id("com.bts.consumer:id/tvChange")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.xpath("android.widget.LinearLayout[@index=1]")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/llCheckout")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.id("com.bts.consumer:id/tvNo")).click();
                       Thread.sleep(2000);
                       driver.findElement(By.xpath("com.bts.consumer:id/rlBank[@index=2]")).click();
                       Thread.sleep(3000);
                       
                       
              } 
              public static void main(String[] args) throws InterruptedException 
  			{	
  				       new12 obj = new new12();
  				       obj.setup();
  				       obj.login();
  				       obj.exclusivestores();
  			}
}
