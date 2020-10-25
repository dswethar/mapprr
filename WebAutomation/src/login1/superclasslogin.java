package login1;


	import java.awt.List;
	import java.util.ArrayList;
	import java.util.Iterator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class superclasslogin {

		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver 2");
				WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			    driver.get("http://qa.mapprr.com/");
			    //driver.manage().window().maximize();
			    Thread.sleep(3000); 
			    //Thread.sleep(6000);
			    driver.findElement(By.xpath("//a[@id='login_btn']")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");
			    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Login ']")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
			    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Submit ']")).click();
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("//span[@class='hidden-xs'][1]")).click();
			    Thread.sleep(5000);
			    //driver.findElement(By.xpath("//button[@class=\"owl-prev\"]")).click();
			   //driver.findElement(By.xpath("//h2[contains(text(),\"Featured Categories\")]//following::img[@alt=\"Pharmacy\"]")).click();
			    ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
			    //JavascriptExecutor je = (JavascriptExecutor) driver;
			    //WebElement element = driver.findElement(By.xpath("//div[3]/div[@class='item' and 1]/a[@class='category-name' and 1]/img[@class='img-responsive category-img' and 1]"));
			    //je.executeScript("arguments[0].scrollIntoView(true);",element);
	            //element.click();
			    //Actions builder=new Actions(driver);
			   // ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
			    //WebElement element = driver.findElement(By.xpath("//button[@class=\"owl-prev\"]"));
			    //builder.moveToElement(element).build().perform();
			    Thread.sleep(5000);
			   ((JavascriptExecutor)driver).executeScript("scroll(0,750)");
			    //builder.click(element).build().perform();
			    //String  categories = {"Groceries","Beauty","Pharmacy","Electronics","Books"};
			    //categories=driver.findElements(By.xpath("//a[@class='category-name']/img[@class='img-responsive category-img']"));
			    
			    driver.findElement(By.xpath("//div[@class='trending_pro']")).click();
			    Thread.sleep(3000);
			    java.util.List<WebElement> prod=driver.findElements(By.xpath("//div[@class='p_sub1']"));
			    Thread.sleep(7000);
			    System.out.println("Total no of products is "+prod.size());
			    for(WebElement pro : prod) {
			    	System.out.println(pro.getText());
			    }
			    
//			    Iterator<WebElement> i1=prod.iterator();
//			     while(i1.hasNext()){
	//
//			     WebElement ele1=i1.next();
//			     String name=ele1.getText();
//			     System.out.println("Elements name is " +name);
//			    	     
//			    	               }
//			    
//			    
	            
	            //driver.findElement(By.xpath("//div[3]/div[@class='item' and 1]/a[@class='category-name' and 1]/img[@class='img-responsive category-img' and 1]")).click();
			    
	          //driver.quit();
	
	}

}
