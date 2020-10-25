package appium;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Trendingprodviewall extends FirstTest {
	
	 public void trendingviewall() throws InterruptedException{
  	   MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
  				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/scrollView\")).setMaxSearchSwipes(5).scrollIntoView("
  				+ "new UiSelector().textContains(\"Popular brands\"))"));
  	    Thread.sleep(2000);
  	    driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
  	    Thread.sleep(2000);
  	    driver.findElement(By.id("com.bts.consumer:id/tvBrandsViewAll")).click();
  	    Thread.sleep(3000);
  	    driver.findElement(By.id("com.bts.consumer:id/llProductSearch")).click();
  	    Thread.sleep(3000);
  	    driver.findElement(By.id("com.bts.consumer:id/tvWriteReview")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@index='4']")).click();
        driver.findElement(By.id("com.bts.consumer:id/etRating")).sendKeys("A good product");
        driver.findElement(By.id("com.bts.consumer:id/btSubmit")).click();
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
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/ivMinus")).click();
     	Thread.sleep(3000);
     	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
     	Thread.sleep(2000);
    	driver.findElement(By.id("com.bts.consumer:id/home_tab")).click();
    	Thread.sleep(4000);
    	
    	
    	 MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator(
   				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/scrollView\")).setAsVerticalList().scrollIntoView("
   				+ "new UiSelector().textContains(\"Trending products\"))"));
    	 driver.findElement(By.id("com.bts.consumer:id/tvTrendingViewAll")).click();
   	    Thread.sleep(3000);
   	    driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index=1]")).click();
   	    Thread.sleep(2000);
   	    driver.findElement(By.id("com.bts.consumer:id/llProductSearch")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.RelativeLayout[@index=1]")).click();
	    //driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
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
	    MobileElement s6 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/productName"));
		System.out.println("Product name is:" +s6.getText());
		MobileElement s7 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/brandName"));
       System.out.println("Brand name is:" +s7.getText());
       MobileElement s8 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvPrice"));
 	   System.out.println("Price is:" +s8.getText());
    	MobileElement s9 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddressTag"));
 	   System.out.println("The address is:" +s9.getText());
    	MobileElement s10 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddress"));
 	   System.out.println(s10.getText());
 	driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.id("com.bts.consumer:id/ivMinus")).click();
 	Thread.sleep(3000);
 	driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
 	Thread.sleep(2000);
    driver.findElement(By.id("com.bts.consumer:id/home_tab")).click();
 	Thread.sleep(4000);
 	
 	
 	    MobileElement element3 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/scrollView\")).setAsVerticalList().scrollIntoView("
				+ "new UiSelector().textContains(\"Trending products\"))"));
 	    driver.findElement(By.id("com.bts.consumer:id/tvTrendingViewAll")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index=2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/llProductSearch")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.RelativeLayout[@index=1]")).click();
	    //driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
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
	    MobileElement s11 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/productName"));
		System.out.println("Product name is:" +s11.getText());
		MobileElement s12 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/brandName"));
        System.out.println("Brand name is:" +s12.getText());
        MobileElement s13 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvPrice"));
	    System.out.println("Price is:" +s13.getText());
 	    MobileElement s14 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddressTag"));
	    System.out.println("The address is:" +s14.getText());
 	    MobileElement s15 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddress"));
	    System.out.println(s15.getText());
	    driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
     	Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivMinus")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
        driver.findElement(By.id("com.bts.consumer:id/home_tab")).click();
 	    Thread.sleep(4000);
 	
 	   MobileElement element4 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/scrollView\")).setAsVerticalList().scrollIntoView("
				+ "new UiSelector().textContains(\"Trending products\"))"));
	    driver.findElement(By.id("com.bts.consumer:id/tvTrendingViewAll")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//android.support.v7.app.ActionBar$Tab[@index=3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/llProductSearch")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvAddToCart")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/tvViewCart")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//android.widget.RelativeLayout[@index=1]")).click();
	    //driver.findElement(By.id("com.bts.consumer:id/tvProceedCheckout")).click();
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
	    MobileElement s16 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/productName"));
		System.out.println("Product name is:" +s16.getText());
		MobileElement s17 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/brandName"));
       System.out.println("Brand name is:" +s17.getText());
       MobileElement s18 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvPrice"));
	    System.out.println("Price is:" +s18.getText());
	    MobileElement s19 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddressTag"));
	    System.out.println("The address is:" +s19.getText());
	    MobileElement s20 = (MobileElement) driver.findElement(By.id("com.bts.consumer:id/tvAddress"));
	    System.out.println(s20.getText());
	    driver.findElement(By.id("com.bts.consumer:id/tvCheckout")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivCancel")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
    	Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("com.bts.consumer:id/ivMinus")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("com.bts.consumer:id/ivBack")).click();
	    Thread.sleep(2000);
        driver.findElement(By.id("com.bts.consumer:id/home_tab")).click();
	    Thread.sleep(4000);
   	    
   	    
   // MobileElement element2 = driver.findElement(MobileBy.AndroidUIAutomator(
   	//			"new UiScrollable(new UiSelector().resourceId(\"com.bts.consumer:id/catRV\")).setAsHorizontalList().scrollIntoView("
   	//			+ "new UiSelector().textContains(\"Books & Stationery\"))"));
   	//	   element.click();
    	
     }

		public static void main(String[] args) throws InterruptedException 
		{	
			       Trendingprodviewall obj =  new Trendingprodviewall();
			       obj.setup();
			       obj.login();
			       obj.trendingviewall();
			      
	   }	

}
