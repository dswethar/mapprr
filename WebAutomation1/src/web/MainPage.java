package web;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.StaleElementReferenceException;

import javax.swing.text.View;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends homelinks 
{
	WebDriver driver=new ChromeDriver();
	String featcat[]= {"Groceries?query=Q/BOjN3iMxVLtN36mk9iQg==","Health-and-Beauty?query=ML8RNj9MWxtWWgYODzPadA==","Electronics?query=y3GFz+xoXRSG3zLIVGML8g==","Health-and-Pharmacy?query=68jmucEwXArJaB6xd6BHZw==","Books-and-Stationery?query=FEqZbgzNtPEHq82oD2lnUA=="};
	String stores[]= {"Spar","Reliance Digital","Pai Electronics","FirstCry","Big C","Lot Mobiles","MedPlus","Apollo Pharmacy","Nykaa","New U","The Body Shop","Himalaya"};
	String location[]= {"Hyderabad","Bengaluru","Pune","Chennai","New Delhi","Visakhapatnam"};
	//String location[]= {"Mumbai","Pune","Kolkata","Kanpur","Ahmedabad","New Delhi","Bengaluru","Chennai","Hyderabad","Visakhapatnam","Kochi","Vijayawada"};
	String brands[]= {"Gsk","Apple","Alembic","Oppo","Spar Fresh","Lupin","Pampers","Durex","Pfizer","Eveready","Cipla","Bose"};
    String groceries[]= {"AdMU0G6kD9GB460xCcGbWw==","CoBGF4WDzo4jZ503R9PUUQ==","gKZFtx7/umeOe8zHK8O0Lg==","LFreC3xt9Z1eNrJQKagLDA==","2UQBdHrWu1jrDh1EeFBUnQ=="};
	
	public void openmapprr() throws InterruptedException
	{
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.66.209.150//login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"authenticate_text\"]")).sendKeys("ravi@mapprr.com");
		driver.findElement(By.xpath("//*[@id=\"authenticate_password\"]")).sendKeys("mapp123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3963");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
	    Thread.sleep(3000);
		WebElement customer = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3961");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
		Thread.sleep(3000);
		WebElement customer1 = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer1.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3964");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
		Thread.sleep(3000);
		WebElement customer2 = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer2.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		System.out.println("Orders done");
		driver.close();
		
		//driver.findElement(By.id("detect_loc")).click();
	}
	//***************************************************************************************************************************************************************************************
	public void company() throws InterruptedException {
		
	    Thread.sleep(5000);
		String linktext[]= {"Home","About Us","Team","Careers","Contact Us","Terms & Conditions","Privacy Policy","Refund Policy","Blogs"};
		for (int i=0;i<linktext.length;++i) {
		driver.findElement(By.xpath("//a[contains(text(),'"+linktext[i]+"')]")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = driver.findElement(By.xpath("//*[contains(text(),'"+linktext[i]+"')]")).getText();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);	
		 }
		else {
			System.out.println(expectedTitle+" page title is = "+actualTitle);
		//	WebElement main=driver.findElement(By.xpath("//div[@class=\"container-fluid team_container\"]"));
		//	System.out.println(main.getText());
		   }
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		}
		
	}
	//***************************************************************************************************************************************************************************************
	public void socialmedia() throws InterruptedException {
		String media[]= {"Mapprr facebook","Mapprr instagram","Mapprr linkedin","Mapprr twitter"};
		for(int i=0;i<media.length;i++) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1500);
			WebElement so=driver.findElement(By.xpath("//*[contains(@title,'"+media[i]+"')]"));
			System.out.println(so.getAttribute("href"));
			so.click();
			driver.navigate().to("http://qa.mapprr.com");
		}
	}
	//***************************************************************************************************************************************************************************************
	public void login() throws InterruptedException {
		driver.navigate().to("http://qa.mapprr.com");
		Thread.sleep(2000);
		//driver.findElement(By.className("d_gps")).click();
		//Thread.sleep(9000);
	    WebElement t1 = driver.findElement(By.id("m_loc"));
	  	t1.sendKeys("Kavuri Hills, Hyderabad, Telangana, India");
	   // t1.submit();
	    Thread.sleep(3000);
	    WebElement element = driver.findElement(By.xpath("/html/body/div[24]/div[1]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).click().build().perform();
	    Thread.sleep(3000);
	    // driver.findElement(By.xpath("//div[contains(@class,\'nav_mloc\')]/div[1]/span")).click();
	    driver.findElement(By.xpath("//div[contains(@class,\'my_cart\')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(@class,'common_btn cart_empty_btn cart_no_login')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("login_btn")).click();
		//Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[contains(@class,'common_btn login_submit_modal')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"otp\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"otp_form\"]/div[3]/div/button")).click();
		System.out.println("login completed successfully");
		Thread.sleep(4000);
	}
	//**************************************************************************************************************************************************************
	public void popularstores() throws InterruptedException  {
	    	driver.findElement(By.xpath("//a[contains(@href,\'/stores/featured_stores\')and text()='View All']")).click();
	     	for(int x=1;x<=91;x++) 
	     	{
		       WebElement store= driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div["+x+"]/a/div/div"));
		       System.out.println(store.getText());
		       
			//   int storesize=((List<WebElement>) store).size();
		       System.out.println(store.getSize());
		       Thread.sleep(3000);
	     	}
	     
			 String parentWindowHandle = driver.getWindowHandle();
			 System.out.println("Parent window's handle -> " + parentWindowHandle);
	}
	//***************************************************************************************************************************************************************************************
	public void appdownloadbuttons() throws InterruptedException {
		for(int i=1;i<=2;i++) 
		{   
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,3000)");
			//WebElement apps=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/a["+i+"]"));
			WebElement apps=driver.findElement(By.xpath("/html/body/div[18]/div[1]/div/div[4]/div/a["+i+"]/img"));
			///html/body/div[18]/div[1]/div/div[4]/div/a[2]/img
			System.out.println(apps.getAttribute("href"));
			Thread.sleep(2000);
			apps.click();
			driver.navigate().to("https://qa.mapprr.com");
		}
	}
	//***************************************************************************************************************************************************************************************
	public void myaccountclicking() throws InterruptedException {
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"h_profile\"]/img")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		System.out.println("My account is opened");
	}
	//***************************************************************************************************************************************************************************************
	public void myaccountdetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,\'/profile\')and text()='My Details']")).click();
		System.out.println("My Account Details are given below");
		Thread.sleep(2000);
		for(int i=1;i<=5;i++) 
		{
			WebElement account=driver.findElement(By.xpath("//*[@id=\"full_profile\"]/div[1]/div["+i+"]/div[1]/div"));
		for(int j=i;j<=i;j++) 
			{
				WebElement data=driver.findElement(By.xpath("//*[@id=\"full_profile\"]/div[1]/div["+j+"]/div[2]/div"));
				System.out.println(account.getText() + ":" +data.getText());
			}
		}
	}
	//************************************************************************************************************************************************************
	public void FAQ() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href,\'/profile\')]")).click();
		Thread.sleep(4000);
		WebElement title=driver.findElement(By.xpath("//div[contains(@class,\"row faq_profile_main_field profile_side2\")]"));
		System.out.println(title.getText());
		for(int i=2;i<=4;i++) {
			WebElement quest=driver.findElement(By.xpath("//*[@id=\"full_profile\"]/div[3]/div/div["+i+"]/div[1]"));
			System.out.println(i+".Question = "+ quest.getText());
			for(int j=i;j<=i;j++) {
				WebElement answ=driver.findElement(By.xpath("//*[@id=\"full_profile\"]/div[3]/div/div["+j+"]/div[2]"));
				System.out.println(i+".Answer = "+ answ.getText());
			}
		}
	}
	//***************************************************************************************************************************************************************************************
	public void myaccount_subcategories() throws InterruptedException {
		Thread.sleep(3000);
		for(int i=1;i<=7;i++) {
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"myGroup\"]/div[2]/div/div/a["+i+"]"));
		Thread.sleep(3000);
		ele.click();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	   //  WebElement products=driver.findElement(By.className("profile_main_grid_in"));
	     WebElement products=driver.findElement(By.className("tab-pane"));
		  if (products.isEnabled())
	     	{
			System.out.println(products.getAttribute("href"));	
			System.out.println(products.getText());
		    }
		}
	}
	//***************************************************************************************************************************************************************************************
	public void locationenable(){
		driver.findElement(By.id("detect_loc")).click();
		System.out.println("successfully accessed the location");
	}
	//***************************************************************************************************************************************************************************************
	public void popularlocationindia() throws InterruptedException {
		Thread.sleep(4000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,2800)");
		String location[][] = {{"Hyderabad","Pune","New Delhi"},{"Bengaluru","Chennai","Visakhapatnam"}};
	/*	for(int i=1;i<=3;i++) 
		  {
			//WebElement loca=driver.findElement(By.xpath("//*[contains(text(),'"+location[i]+"')]"));
	//		/html/body/div[17]/div[2]/div/div[3]/div[2]/div[1]/div[1]
			WebElement loca=driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[3]/div[2]/div[1]/div["+i+"]"));
			Thread.sleep(3000);
			loca.click();
			Thread.sleep(1000);
			//WebElement place=driver.findElement(By.xpath("//*[@class=\"mlocation nav_mloc select_location\"]/div/div[2]/span[2]"));
			WebElement place=driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div[1]/div[1]/button/span[2]"));
			System.out.println(location[i]+ " = " +place.getText());
	      }
		for(int j=1;j<=3;j++) 
		  {             '''
			//WebElement loca=driver.findElement(By.xpath("//*[contains(text(),'"+location[i]+"')]"));
			WebElement loca=driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[3]/div[2]/div[2]/div["+j+"]"));
			Thread.sleep(3000);
			loca.click();
			Thread.sleep(1000);*/
	
		 for(int i=1;i<=location.length-1;i++) 
		 {
		
			for(int j1=1;j1<=location[i].length;j1++) 
			{
				WebElement loca1=driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[3]/div[2]/div["+i+"]/div["+j1+"]"));
				Thread.sleep(3000);
				loca1.click();
				Thread.sleep(3000);
				//WebElement place=driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div[1]/div[1]/button/span[2]"));
				WebElement place=driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div[1]/div[1]/button/span[2]"));
			    //WebElement place=driver.findElement(By.xpath("//*[@class=\"mlocation nav_mloc select_location\"]/div/div[2]/span[2]"));
				System.out.println(location[i][j1]+ " = " +place.getText()); 
			
				//driver.navigate().to("http://qa.mapprr.com");
		     }
			 //   WebElement place=driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div[1]/div[1]/button/span[2]"));
				//	WebElement place=driver.findElement(By.xpath("//*[@class=\"mlocation nav_mloc select_location\"]/div/div[2]/span[2]"));
			//	System.out.println(location[i][j1]+ " = " +place.getText());
				//System.out.println(location[i]+ " = " +place.getText()); 
			
		  }
			//WebElement place=driver.findElement(By.xpath("//*[@class=\"mlocation nav_mloc select_location\"]/div/div[2]/span[2]"));
	      
	
	}
	//***************************************************************************************************************************************************************************************
    public void categories() throws InterruptedException {
    	System.out.println("the loop has started");
    	String categories[]= {"Groceries ","Beauty Care ","Electronics ","Medicines ","Pet Supplies "};
    	String location[]= {"Staples","Snacks & Beverages","Packaged Food","Personal & Baby Care","Household Care","Dairy & Eggs","Others"};
    	// for (String catname : categories) {
   
       //   	 int i=0;
    	//    while(i<=categories.length-1); {
    	  //  	System.out.println("while loop running");
    	    //    System.out.println(categories[i++]);
    	      
  //  	    }
       for(int i=0; i<=categories.length;++i)
     	{  
    		//Thread.sleep(7000);
			WebElement cat= driver.findElement(By.xpath("//a[contains(text(),'"+categories[i]+"')]"));
    		System.out.println(cat.getText());
    		Thread.sleep(2000);
    		cat.click();
    		
    		for (int j=0;j<location.length;++j) {
    	
    			  WebElement subcat =driver.findElement(By.xpath("//*[contains(text(),'"+location[j]+"')]"));
    			  System.out.println(subcat.getText());
			      subcat.click();
    			  WebElement products=driver.findElement(By.className("tab-pane"));
    			// WebElement products=driver.findElement(By.className("p_details"));
    			  if (products.isEnabled())
    		     	{
    		      	  System.out.println(products.getAttribute("href"));	
    			      System.out.println(products.getText());
    			      JavascriptExecutor js=(JavascriptExecutor)driver;
      				  js.executeScript("window.scrollTo(0,1500)");
      				  Thread.sleep(2000);
    			      driver.findElement(By.xpath("//*[contains(text(),'Show More')]")).click();
    				  Thread.sleep(4000);
    				  System.out.println(products.getAttribute("href"));	
    			      System.out.println(products.getText());
    				  Thread.sleep(2000);
    				  driver.navigate().to("https://qa.mapprr.com");
    	              Thread.sleep(3000);
    	              ++i;
    	              ++j;
    				  
    		     	}
    			 
    			  System.out.println("the loop has started1");
    			/*	List<WebElement> details = driver.findElements(By.className("p_details"));
					for(WebElement det : details) 
					{
						if(det.isEnabled()) 
						{
							System.out.println(" In "+ location[j] +"  "+ categories[i] + "  products are ");
							System.out.println(((WebElement) details).getAttribute("href"));	
			    		    System.out.println(((Alert) details).getText());
			    		    
			  
					}
						else {
				       	System.out.println(" No" +categories[i] + "products found");
						}  */
    		
    	      	}
    		
    	 }
        //continue;
     //  }
    	
    	
    	
    }
	
	//*******************************************************************************************************************************************************
	public void popularstoresinindia() throws InterruptedException {
		Thread.sleep(2000);
		String stores[]= {"Kathiawar","Nykaa","Big C","Ratnadeep Super Market","Vijetha Super Market","Ghanshyam Super Market","Healthkart","The Body Shop","Apollo Pharmacy","New U"};
		for(int i=0;i<stores.length;i++) {
			WebElement sto=driver.findElement(By.xpath("//*[contains(text(),'"+stores[i]+"')]"));
			Thread.sleep(3000);
		    JavascriptExecutor js=(JavascriptExecutor)driver;
			 sto.click();
			//  JavascriptExecutor js=(JavascriptExecutor)driver;
			  for(int j=0;j<location.length;j++) {
				Thread.sleep(3000);
				WebElement loco=driver.findElement(By.xpath("//*[contains(text(),'"+location[j]+"')]"));
				Thread.sleep(3000);
				js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
				loco.click();
				Thread.sleep(3000);
				js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
				List<WebElement> details = driver.findElements(By.className("profile_s_card"));
					for(WebElement det : details) 
					{
						if(det.isEnabled()) 
						{
							System.out.println(" In "+ location[j] +"  "+ stores[i] + "  stores are ");
							System.out.println(det.getText());
					}
						else {
							System.out.println(" No" +stores[i] + "stores");
						}
				}
			}
			
		}
	}
	//*********************************************************************************************************************************************************************************************
    public void popular_brands_in_india() throws InterruptedException {
		Thread.sleep(2000);
		String brands[]= {"dabur","apple","dove","bose","hul","lakme"}; // "Durex","Pfizer","Eveready","Cipla","Bose","Spar Fresh"
		for(int i=0;i<brands.length;i++) {
			driver.get("http://qa.mapprr.com/products-by-brand/"+brands[i]);
			WebElement top=driver.findElement(By.className("brand_heading"));
			Thread.sleep(2000);
			List<WebElement> top1=driver.findElements(By.className("p_details"));
			for(WebElement top2:top1) {
				System.out.println(top.getText());
				System.out.println(top2.getText());
			}
		}
		
	}
//***************************************************************************************************************************************************************************************
public void FeaturedCategories() throws InterruptedException {
	Thread.sleep(4000);
	String featcat[]= {"Groceries?query=Q/BOjN3iMxVLtN36mk9iQg==","Health-and-Beauty?query=ML8RNj9MWxtWWgYODzPadA==","Electronics?query=y3GFz+xoXRSG3zLIVGML8g==","Health-and-Pharmacy?query=68jmucEwXArJaB6xd6BHZw==","Books-and-Stationery?query=FEqZbgzNtPEHq82oD2lnUA=="};
	for(int i=0;i<=featcat.length;i++) {
		driver.get("https://qa.mapprr.com/products-by-category/"+featcat[i]);
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		List<WebElement> elements=driver.findElements(By.className("p_details"));
		for(WebElement elementtext:elements) {
			System.out.println(elementtext.getText());
		}
		Thread.sleep(2000);
	
	}
	driver.navigate().back();
	
}
//********************************************************************************************************************************************************************************************************************************************************************************************************
public void FoodandGroceries() throws InterruptedException {
	// for(int i=0;i<=featcat.length-1;i++) {
	//driver.get("http://13.233.222.102/products-by-category/"+featcat[0]);
	driver.get("http://qa.mapprr.com/products-by-description/Staples");
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollTo(0,300)");
	driver.findElement(By.xpath("//*[@id=\"370009\"]/div/div/a[1]/div")).click();//i can change product by changing last div number//
	Thread.sleep(3000);
	for (String handle : driver.getWindowHandles()) {
         driver.switchTo().window(handle);}
	List<WebElement> cart1=driver.findElements(By.className("add_c"));
	if (driver.findElements(By.className("empty_state_txt")).size() != 0)// add to cart
	{
		WebElement noprod = driver.findElement(By.className("empty_state_txt"));
		System.out.println(noprod.getText());
	}
	else if(driver.findElements(By.className("coming_soon")).size() != 0){
		System.out.println("Out Of Stock");
	}
	else
	{
		for(WebElement elementtext:cart1)
		{
			Thread.sleep(3000);
			elementtext.click();
			System.out.println(" click on Add to cart");
		}
			Thread.sleep(3000);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
		    js1.executeScript("window.scrollTo(0,700)");
			driver.findElement(By.xpath("/html/body/div[4]/a")).click();
			System.out.println("click on View cart");
		 //	JavascriptExecutor js2=(JavascriptExecutor)driver;
		 //   js1.executeScript("window.scrollTo(0,1000)");
		//	Thread.sleep(3000);
			WebElement buttonToClick = driver.findElement(By.xpath("//a[@class='common_btn proceed_checkout']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",buttonToClick );
			System.out.println("click on Proceed to Pay");
			 Thread.sleep(3000);
			List<WebElement> addr=driver.findElements(By.className("adr_pickup"));
			if(addr.size() != 0) {
			for(WebElement add:addr)
				if (add.isEnabled()) {
					add.click();
					System.out.println("Addres1 is selected");
					break;
					
				}
			}
			else
			{
				WebElement new_address = driver.findElement(By.xpath("//*[contains(text(),'Add Address')]"));
				new_address.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"delivery_adrs\"]")).sendKeys("2-107/2");
				driver.findElement(By.xpath("//*[@id=\"delivery_nearby\"]")).sendKeys("police station");
				driver.findElement(By.xpath("//*[@id=\"add_adrs_form\"]/div[4]/div/label[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"add_adrs_form\"]/button[1]")).click();
				Thread.sleep(3000);
				List<WebElement> addr1=driver.findElements(By.className("adr_pickup"));
				for(WebElement add2:addr1) {
		    	add2.click();
				System.out.println("Address is selected");
				}
			     }
		    Thread.sleep(6000);
			JavascriptExecutor sj=(JavascriptExecutor)driver;
			sj.executeScript("window.scrollBy(0,800)");
			System.out.println("page is scrolled");
			Thread.sleep(6000);
			//driver.findElement(By.xpath("//*[@id=\"rzp-button1\"]/button")).click();
			//List<WebElement>cash=driver.findElements(By.id("side_nav_payment"));
			// for(WebElement cash1:cash)
			//{   
		     //  cash1.click();
		     //  Thread.sleep(5000);
			 //}
			Thread.sleep(4000);
			WebElement pay=driver.findElement(By.xpath("//*[@id=\"rzp-button1\"]"));
			Actions action=new Actions(driver);
			action.moveToElement(pay).click();
			action.perform();
			//JavascriptExecutor sj1=(JavascriptExecutor)driver;
			//sj.executeScript("window.scrollBy(0,1000)");
			//System.out.println("page1 is scrolled");
			Thread.sleep(4000);
			List<WebElement>cash=driver.findElements(By.id("side_nav_payment"));
			for(WebElement cash8:cash)
			{   
			      JavascriptExecutor sj1=(JavascriptExecutor)driver;
				  sj.executeScript("window.scrollBy(0,400)");
				  System.out.println("page1 is scrolled");
				 // System.out.println(cash8.getText());
				  Thread.sleep(3000);
				  WebElement cash1 = driver.findElement(By.xpath("//*[@id=\"side_nav_payment\"]/a[6]/div"));
				  cash1.click();
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//button[@class=\"payment_cod_button card_chk_btn\"]")).click();
			      // cash8.click();
		          Thread.sleep(5000);
		          WebElement s1 =driver.findElement(By.xpath("//div[@class=\"deli_boy_info\"]"));
		          System.out.println(s1.getText());
			 }
			Thread.sleep(4000);
			driver.quit();
		   // driver.findElement(By.xpath("//*[@id=\"side_nav_payment\"]/a[6]/div")).click();
}
	
}
//}
//***********************************************************************************************************************************************************************************************
public void Homepage_Subcategories() throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	for(int i=1;i<=4;i++) {
		WebElement grid=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/a["+i+"]/div/div/div[2]"));
		Thread.sleep(4000);
		System.out.println("click on  "+grid.getText());
		grid.click();
		Thread.sleep(3000);
		driver.navigate().back();
	}
}
//******************************************************************************************************************************************************************************************
public void RemovingMycartProducts() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.className("my_cart")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'View Cart Details')]")).click();
	//driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[3]/div/span/span[1]/a[1]/img")).click();
	System.out.println("My cart is opened");
	List<WebElement> products=driver.findElements(By.className("row"));
	System.out.println("have to click on remove ");
	if(products.size()!=0) {
		for(WebElement pro:products) {
			Thread.sleep(3000);
			try {
			pro.isEnabled();
			WebElement p1 =driver.findElement(By.xpath("//span[contains(text(),'Remove')]"));
			p1.click();
			System.out.println("removed");	
			driver.navigate().back();
			}
			catch
			(Exception e)
			{
			System.out.println("No items to be removed");
			driver.navigate().back();
			}

		}
	}
	//driver.navigate().back();
	//else {
		//driver.findElement(By.xpath("//*[@id=\"97072_1\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[3]/span")).click();
	//}
	
}
//**********************************************************************************************************************************************************************************
public void Careers() throws InterruptedException, IOException {
	System.out.println("Hello Tester now i am Testing Careers Page");
	driver.get("https://qa.mapprr.com/careers");
	System.out.println("careers page is opened");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[1]/a")).click();
	System.out.println("click on see our openings");
	List<WebElement> positions= driver.findElements(By.className("careers_btn"));
	System.out.println(positions.size());
	if(positions.size()!=0) {
		for(int i=1;i<=2;i++) {
			//driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[1]/a")).click();
			//Thread.sleep(5000);
			JavascriptExecutor js3=(JavascriptExecutor)driver;
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"accordion\"]/div["+i+"]/div[1]/h4/a/div/div[3]/button")).click();
			// System.out.println(positions.get(i-1).getText());
			Thread.sleep(3000);
			js3.executeScript("window.scrollBy(0,1100)");
			System.out.println("page is scrolled");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[contains(@name,'first_name')]")).sendKeys("new");
		//	WebElement e1=driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div/div[5]/div/form/div[1]/input"));
		//	e1.click();
		//	e1.sendKeys("emp");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(@name,'last_name')]")).sendKeys("emp");
			Thread.sleep(6000);
		//	driver.findElement(By.xpath("//*[contains(@name,'mobile')]")).sendKeys("7207541544");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("newemp@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(@name,'quality')]")).sendKeys("vfbvbh");
			driver.findElement(By.className("attach_cv")).click();
		//	Runtime.getRuntime().exec("‎⁨C:⁩\\Users⁩\\⁨swethareddy⁩\\⁨Downloads\\Test cases.docx⁩");

			Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\file1.exe");
			System.out.println("Resume uploded successfully");
			Thread.sleep(3000);
			JavascriptExecutor js31=(JavascriptExecutor)driver;
			js31.executeScript("window.scrollBy(0,30)");
			Thread.sleep(4000);
			String submit[]= {"ios","full_stack"};
			driver.findElement(By.xpath("//*[@id=\""+submit[i-1]+"\"]")).click();
			Thread.sleep(4000);
			System.out.println("submitted");
			
			
		}
	}
	
}
//******************************************************************************************************************************************************************************************************
public void contactus() throws InterruptedException {
	driver.get("https://qa.mapprr.com/contact");
	JavascriptExecutor js31=(JavascriptExecutor)driver;
	js31.executeScript("window.scrollBy(0,100)");
	driver.findElement(By.xpath("//*[contains(@name,'first_name')]")).sendKeys("new");
	//driver.findElement(By.xpath("//*[contains(@name,'last_name')]")).sendKeys("emp ");
    Thread.sleep(4000);
	driver.findElement(By.xpath("//*[contains(@id,'phone')]")).sendKeys("8939611808");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("xyz@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(@name,'message')]")).sendKeys("Thank you");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'ENQUIRE')]")).click();
	//driver.findElement(By.xpath("//*[@id=\"contact_submit\"]/div[6]/button/img")).click();
	System.out.println("Thanks for contacting");
}
//********************************************************************************************************************************************************************************************************************
 public void logout() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div/div[3]/div/span[2]/ul/li[4]")).click();
	
}
 //*********************************************************************************************************************************************************
 public void fernsandpetals() throws InterruptedException {
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 // System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
	 WebDriver driver =new ChromeDriver(options);
	 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
	 // driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
	 Thread.sleep(3000);
	 JavascriptExecutor js31=(JavascriptExecutor)driver;
	 js31.executeScript("window.scrollBy(0,300)");
	 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[4]/div/div/div/label")).click();
	 Thread.sleep(5000);	 
	 JavascriptExecutor js32=(JavascriptExecutor)driver;
	 js31.executeScript("window.scrollBy(0,300)");
	//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
	 System.out.println("The price range selected is between 1500 and 2000");
	 for (int i=1;i<=60;i++)
	 {
		   WebElement p0=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a"));
		   System.out.println("href:"+i+"");
		   System.out.println(p0.getAttribute("href"));
		   WebElement p1=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[1]"));
	     //  System.out.println("Product no is:"+i+"");
	   	   System.out.println(p1.getText());
		   WebElement p2=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
		   System.out.println(p2.getAttribute("content"));
		   WebElement p3=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]"));
		 //  System.out.println("Image url no:"+i+"");
		   System.out.println(p3.getAttribute("data-img-url"));
		   System.out.println();
	 }
	 Thread.sleep(5000);
	 JavascriptExecutor js33=(JavascriptExecutor)driver;
	 js31.executeScript("window.scrollBy(0,8000)");
	 Thread.sleep(10000);
	for (int i=1;i<=60;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
			//System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
			// System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(5000);
	js32.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=61;i<=120;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(5000);
	js32.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=121;i<=180;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(6000);
	js32.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=181;i<=240;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(5000);
	js32.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=241;i<=242;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	System.out.println("All 302 products details added successfully");
	driver.quit();
 }
  //***********************************************************************************************************************************************************
  public void fernsandpetals1() throws InterruptedException {
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 WebDriver driver =new ChromeDriver(options);
	 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
	 // driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
	 Thread.sleep(3000);
	 JavascriptExecutor js31=(JavascriptExecutor)driver;
	 js31.executeScript("window.scrollBy(0,300)");
	 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
	 Thread.sleep(2000);
	// JavascriptExecutor js32=(JavascriptExecutor)driver;
	 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[1]/div/div/div/label")).click();
	 Thread.sleep(5000);	 
	 JavascriptExecutor js32=(JavascriptExecutor)driver;
	 js31.executeScript("window.scrollBy(0,300)");
	//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
	/* System.out.println("The price range selected is between 0 and 500");
	 for (int i=1;i<=30;i++)
	 {
		   WebElement p0=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a"));
		   System.out.println("href:"+i+"");
		   System.out.println(p0.getAttribute("href"));
		   WebElement p1=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[1]"));
	     //  System.out.println("Product no is:"+i+"");
	   	   System.out.println(p1.getText());
		   WebElement p2=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
		   System.out.println(p2.getAttribute("content"));
		   WebElement p3=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]"));
		 //  System.out.println("Image url no:"+i+"");
		   System.out.println(p3.getAttribute("data-img-url"));
		   System.out.println();
	 }
	 System.out.println("All 30 products details added successfully");
	 System.out.println();
	 System.out.println("******************************************");*/
	 Thread.sleep(5000);	 
	 js31.executeScript("window.scrollBy(0,-300)");
	 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a/label")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/div/label")).click();
	 Thread.sleep(5000);	 
	 js31.executeScript("window.scrollBy(0,300)");
	//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
	 System.out.println("The price range selected is between 500 and 1000");
	 for (int i=1;i<=60;i++)
	 {
		   WebElement p0=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a"));
		   System.out.println("href:"+i+"");
		   System.out.println(p0.getAttribute("href"));
		   WebElement p1=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[1]"));
	     //  System.out.println("Product no is:"+i+"");
	   	   System.out.println(p1.getText());
		   WebElement p2=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
		   System.out.println(p2.getAttribute("content"));
		   WebElement p3=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]"));
		 //  System.out.println("Image url no:"+i+"");
		   System.out.println(p3.getAttribute("data-img-url"));
		   System.out.println();
	 }
	//*[@id="all"]/div[2]/ul/li[1]/a/figure/figcaption/span[1]
	 Thread.sleep(8000);
	 js31.executeScript("window.scrollBy(0,8000)");
	 Thread.sleep(10000);
	for (int i=1;i<=60;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
			//System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
			// System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	//*[@id="all"]/div[2]/ul/li[1]/a/figure/figcaption/span[1]
	Thread.sleep(10000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=61;i<=120;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=121;i<=180;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(6000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=181;i<=240;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=241;i<=300;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=301;i<=360;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=361;i<=400;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=401;i<=414;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	 System.out.println("All 474 products details added successfully");
  }
  
  
  public void fernsandpetals2() throws InterruptedException {
		 
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  WebDriver driver =new ChromeDriver(options);
	  driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
		 // driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor js31=(JavascriptExecutor)driver;
	  js31.executeScript("window.scrollBy(0,300)");
	  driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
	 Thread.sleep(2000);
	 Thread.sleep(5000);	 
	 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[3]/div/div/div/label")).click();
	 Thread.sleep(5000);	 
	 js31.executeScript("window.scrollBy(0,300)");
	//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
	 System.out.println("The price range selected is between 1000 and 1500");
	 for (int i=1;i<=60;i++)
	 {
		   WebElement p0=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a"));
		   System.out.println("href:"+i+"");
		   System.out.println(p0.getAttribute("href"));
		   WebElement p1=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[1]"));
	     //  System.out.println("Product no is:"+i+"");
	   	   System.out.println(p1.getText());
		   WebElement p2=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
		   System.out.println(p2.getAttribute("content"));
		   WebElement p3=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]"));
		 //  System.out.println("Image url no:"+i+"");
		   System.out.println(p3.getAttribute("data-img-url"));
		   System.out.println();
	 }
	//*[@id="all"]/div[2]/ul/li[1]/a/figure/figcaption/span[1]
	 Thread.sleep(12000);
	 js31.executeScript("window.scrollBy(0,8000)");
	 Thread.sleep(12000);
	for (int i=1;i<=60;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
			//System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
			// System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(5000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=61;i<=120;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(10000);
	for (int i=121;i<=180;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=181;i<=240;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=241;i<=300;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=301;i<=360;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=361;i<=400;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(12000);
	for (int i=401;i<=435;i++)
	{
			WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
			System.out.println("href:"+i+"");
			System.out.println(p0.getAttribute("href"));
			WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
		//	System.out.println("Product no is:"+i+"");
			System.out.println(p1.getText());
			WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
			System.out.println(p2.getAttribute("content"));
			WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
		//	System.out.println("Image url no:"+i+"");
			System.out.println(p3.getAttribute("data-img-url"));
			System.out.println();
		//	Thread.sleep(2000);
			
	 }
	Thread.sleep(8000);
	js31.executeScript("window.scrollBy(0,1000)");
	System.out.println("All 495 products details added successfully");
	
   }
  //*************************************************************************************************************************************************************
  public void fernsandpetalsdesc1() throws InterruptedException, FileNotFoundException {
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
		 // driver.manage().window().maximize();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor js31=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[1]/div/div/div/label")).click();
		 Thread.sleep(5000);	 
		 JavascriptExecutor js32=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
		 System.out.println("The price range selected is between 0 and 500");
		 for (int i=1;i<=2;i++) {
	     System.out.println("count:"+i+"");
		 driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a")).click();
		 String p = driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles())
		 {
               driver.switchTo().window(handle);
		  }
		 for (int u=2;u<=5;u++)
		 {
		 try {
			 
	     driver.findElement(By.xpath("//*[@id=\"productfrm\"]/div[4]/ul/li["+u+"]/figure/img")).click();
	     Thread.sleep(2000);
	     WebElement s1=driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/div/div/div[2]/div/div[1]"));
	     System.out.println(s1.getText());
	     WebElement s2=driver.findElement(By.xpath("//*[@id=\"productfrm\"]/div[1]/span/span[1]/span[2]"));
	     System.out.println(s2.getText());
		 driver.findElement(By.className("view-more")).click();
		 Thread.sleep(3000);
		 WebElement p1=driver.findElement(By.id("pdp-description"));
		 System.out.println(p1.getText());
		 System.out.println();
		 Thread.sleep(3000); 
		 js31.executeScript("window.scrollBy(0,-1000)");
		 for (int j=1;j<=4;j++)
		 { 
			  WebElement img =driver.findElement(By.xpath("//*[@id=\"thumbnail"+j+"\"]"));
			  System.out.println("Image names are:");
				 System.out.println(img.getAttribute("src"));	     
		 }	
		 }
		  catch(Exception e) {
				 
		 }
		 
		 }
		 System.out.println();
		 Thread.sleep(2000);
		 driver.close();
		 Thread.sleep(2000); 
		 driver.switchTo().window(p);
		 Thread.sleep(3000); 
		 System.setOut(new PrintStream(new FileOutputStream("‎⁨/Users/swethareddy/⁨Downloads/new.txt⁩")));
		 System.out.println("This is test output");

		 }
  }
      
  //************************************************************************************************************************************************************
  public void fernsandpetalsdesc2() throws InterruptedException {
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
		 // driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor js31=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[3]/div/div/div/label")).click();
		 Thread.sleep(5000);	 
		 JavascriptExecutor js32=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
		 System.out.println("The price range selected is between 1000 and 2000");
		// js31.executeScript("window.scrollBy(0,7000)");
	    //  Thread.sleep(3000);
		 for (int i=1;i<=60;i++) {
	     System.out.println("count:"+i+"");
		 driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a")).click();
		 String p = driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles())
		 {
            driver.switchTo().window(handle);
		  }
		 driver.findElement(By.className("view-more")).click();
		 Thread.sleep(3000);
		 WebElement p1=driver.findElement(By.id("pdp-description"));
		 System.out.println(p1.getText());
		 System.out.println();
		 Thread.sleep(3000);
		
		 for (int j=1;j<=4;j++)
		 {  try {
			  WebElement img =driver.findElement(By.xpath("//*[@id=\"thumbnail"+j+"\"]"));
			  System.out.println("Image names are:");
				 System.out.println(img.getAttribute("src"));
		       } 
		    catch (Exception e) {
		      
		    }
			 
		 }	
		 System.out.println();
		 
		 Thread.sleep(2000);
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(p);
		 Thread.sleep(3000);
		 }
  }
	//***********************************************************************************************************************************************************
  public void fernsandpetalsdesc3() throws InterruptedException {
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
		 // driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor js31=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[3]/div/div/div/label")).click();
		 Thread.sleep(5000);	 
		 JavascriptExecutor js32=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
		 System.out.println("The price range selected is between 1000 and 1500");
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,5000)");
		 Thread.sleep(3000);
		 for (int i=405;i<=435;i++)
		 {
	     System.out.println("count:"+i+"");
	     driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a")).click();
		 String p = driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles())
		 {
            driver.switchTo().window(handle);
		  }
		 driver.findElement(By.className("view-more")).click();
		 Thread.sleep(3000);
		 WebElement p1=driver.findElement(By.id("pdp-description"));
		 System.out.println(p1.getText());
		 System.out.println();
		 Thread.sleep(3000);
		
		 for (int j=1;j<=4;j++)
		 {  try {
			  WebElement img =driver.findElement(By.xpath("//*[@id=\"thumbnail"+j+"\"]"));
			  System.out.println("Image names are:");
				 System.out.println(img.getAttribute("src"));
		       } 
		    catch (Exception e) {
		      
		    }
			 
		 }	
		 System.out.println();
		 
		 Thread.sleep(2000);
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(p);
		 Thread.sleep(3000);
		 }
}	
  
	//***********************************************************************************************************************************************************
  public void fernsandpetalsdesc4() throws InterruptedException {
		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.fnp.com/all-flowers?promo=flowersmenu_dt_hm");
		 // driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor js31=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/div/label")).click();
		 Thread.sleep(5000);	 
		 JavascriptExecutor js32=(JavascriptExecutor)driver;
		 js31.executeScript("window.scrollBy(0,300)");
		//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
		 System.out.println("The price range selected is between 500 and 1000");
		 js31.executeScript("window.scrollBy(0,10000)");
		 for (int i=415;i<=420;i++) {
		 Thread.sleep(3000);
		 js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000);
	     js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000);
	     js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000);
	     js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000);
	     js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000); 
	     js31.executeScript("window.scrollBy(0,10000)");
	     Thread.sleep(3000);
	     js31.executeScript("window.scrollBy(0,9000)");
	     Thread.sleep(3000);
	     System.out.println("count:"+i+"");
	     driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a")).click();
		 String p = driver.getWindowHandle();
		 for (String handle : driver.getWindowHandles())
		 {
            driver.switchTo().window(handle);
		  }
		 driver.findElement(By.className("view-more")).click();
		 Thread.sleep(3000);
		 WebElement p1=driver.findElement(By.id("pdp-description"));
		 System.out.println(p1.getText());
		 System.out.println();
		 Thread.sleep(3000);
		
		 for (int j=1;j<=4;j++)
		 {  try {
			  WebElement img =driver.findElement(By.xpath("//*[@id=\"thumbnail"+j+"\"]"));
			  System.out.println("Image names are:");
				 System.out.println(img.getAttribute("src"));
		       } 
		    catch (Exception e) {
		      
		    }
			 
		 }	
		 System.out.println();
		 
		 Thread.sleep(2000);
		 driver.close();
		 Thread.sleep(2000);
		 driver.switchTo().window(p);
		 Thread.sleep(3000);
		 }
  }
	//***********************************************************************************************************************************************************
		 public void fernsandpetalsplants() throws InterruptedException {
			 
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 // System.setProperty("webdriver.chrome.driver", "/home/users/garima.pathak/Desktop/softwares/chromedriver");
			 WebDriver driver =new ChromeDriver(options);
			 driver.get("https://www.fnp.com/all-plants?promo=plmicro_desk_allplants");
			 // driver.manage().window().maximize();
			 Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
			// Thread.sleep(3000);
			 JavascriptExecutor js31=(JavascriptExecutor)driver;
			 js31.executeScript("window.scrollBy(0,300)");
			 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/div/label")).click();
			 Thread.sleep(5000);	 
			 JavascriptExecutor js32=(JavascriptExecutor)driver;
			 js31.executeScript("window.scrollBy(0,300)");
			//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
			 System.out.println("The price range selected is between 500 and 1000");
			 for (int i=1;i<=60;i++)
			 {
				   WebElement p0=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a"));
				   System.out.println("href:"+i+"");
				   System.out.println(p0.getAttribute("href"));
				   WebElement p1=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[1]"));
			     //  System.out.println("Product no is:"+i+"");
			   	   System.out.println(p1.getText());
				   WebElement p2=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
				   System.out.println(p2.getAttribute("content"));
				   WebElement p3=driver.findElement(By.xpath("//*[@id=\"searchProductListing\"]/li["+i+"]"));
				 //  System.out.println("Image url no:"+i+"");
				   System.out.println(p3.getAttribute("data-img-url"));
				   System.out.println();
			 }
			 Thread.sleep(8000);
			 JavascriptExecutor js33=(JavascriptExecutor)driver;
			 js31.executeScript("window.scrollBy(0,8000)");
			 Thread.sleep(10000);
			for (int i=1;i<=60;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
					//System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
					// System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=61;i<=120;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=121;i<=180;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=181;i<=240;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=241;i<=300;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
		 
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=301;i<=360;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=361;i<=420;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=421;i<=480;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=481;i<=540;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=541;i<=600;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=601;i<=660;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=661;i<=720;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
			
			Thread.sleep(8000);
			js32.executeScript("window.scrollBy(0,8000)");
			Thread.sleep(10000);
			for (int i=721;i<=730;i++)
			{
					WebElement p0=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a"));
					System.out.println("href:"+i+"");
					System.out.println(p0.getAttribute("href"));
					WebElement p1=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[1]"));
				//	System.out.println("Product no is:"+i+"");
					System.out.println(p1.getText());
					WebElement p2=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a/figure/figcaption/span[2]/meta[2]"));
					System.out.println(p2.getAttribute("content"));
					WebElement p3=driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]"));
				//	System.out.println("Image url no:"+i+"");
					System.out.println(p3.getAttribute("data-img-url"));
					System.out.println();
				//	Thread.sleep(2000);
					
			 }
		 }
   //************************************************************************************************************************************************************
		  public void fernsandpetalsp1() throws InterruptedException {
				 
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
				 WebDriver driver =new ChromeDriver(options);
				 driver.get("https://www.fnp.com/all-plants?promo=plmicro_desk_allplants");
				 // driver.manage().window().maximize();
				 Thread.sleep(3000);
			//	 driver.findElement(By.xpath("//*[@id=\"location-lock-popup-close\"]/i")).click();
			//	 Thread.sleep(3000);
				 JavascriptExecutor js31=(JavascriptExecutor)driver;
				 js31.executeScript("window.scrollBy(0,300)");
				 driver.findElement(By.xpath("//*[@id=\"topbarcontainer\"]/div/div/section/ul/li/a")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/div/label")).click();
				 Thread.sleep(5000);	 
				 JavascriptExecutor js32=(JavascriptExecutor)driver;
				 js31.executeScript("window.scrollBy(0,300)");
				//List<WebElement> prod= driver.findElements(By.id("searchProductListing"));\
				 System.out.println("The price range selected is between 500 and 1000");
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
				 js31.executeScript("window.scrollBy(0,10000)");
				 Thread.sleep(3000);
			     for (int i=421;i<=480;i++) {
			     System.out.println("count:"+i+"");
				 driver.findElement(By.xpath("//*[@id=\"all\"]/div[2]/ul/li["+i+"]/a")).click();
				 String p = driver.getWindowHandle();
				 for (String handle : driver.getWindowHandles())
				 {
		            driver.switchTo().window(handle);
				  }
				 driver.findElement(By.className("view-more")).click();
				 Thread.sleep(3000);
				 WebElement p1=driver.findElement(By.id("pdp-description"));
				 System.out.println(p1.getText());
				 System.out.println();
				 Thread.sleep(3000);
				 for (int j=1;j<=4;j++)
				 {  try {
					  WebElement img =driver.findElement(By.xpath("//*[@id=\"thumbnail"+j+"\"]"));
					  System.out.println("Image names are:");
						 System.out.println(img.getAttribute("src"));
				       } 
				    catch (Exception e) {
				      
				    }
					 
				 }	
				 System.out.println();
				 
				 Thread.sleep(2000);
				 driver.close();
				 Thread.sleep(2000);
				 driver.switchTo().window(p);
				 Thread.sleep(3000);
				 }
		  }
}





