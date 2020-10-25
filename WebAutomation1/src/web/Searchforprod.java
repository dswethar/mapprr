package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchforprod {
	 public static void main(String[] args) throws InterruptedException {


	 System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver 2");

		WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.get("http://qa.mapprr.com/");

	    Thread.sleep(3000); 

	    driver.findElement(By.xpath("//a[@id='login_btn']")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");

	    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Login ']")).click();

	    Thread.sleep(6000);

	    driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");

	    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Submit ']")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//span[@class='hidden-xs'][1]")).click();

	    Thread.sleep(4000);

     //driver.findElement(By.xpath("//button[@class='btn searchbtn hidden-xs']")).click();

	    ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

	     Thread.sleep(6000);

	  //  driver.findElement(By.xpath("//a[@class='view_all'][@href='/stores/featured_stores']")).click();

	   // driver.findElement(By.xpath("//a[contains(@href,\"/stores/outlets?query=nykaa\")][1]")).click();  

	    //driver.findElement(By.xpath("//a[contains(@href,\"/products/products_by_offer\")]//button[@class='btn'][1]")).click();

	   // driver.findElement(By.xpath("//button[@class='owl-next'][1]")).click();

	  

	    Thread.sleep(2000);

	    //driver.findElement(By.xpath("//button[@class='owl-prev']/i[@class='fa fa-chevron-left fa-lg' and 1]")).click();

	    driver.findElement(By.xpath("//img[@class='img-responsive category-img'][@alt='Groceries']")).click();

	    Thread.sleep(3000);

	    List<WebElement> prod1= driver.findElements(By.xpath("//div[@class='b_pro_name']"));

	    Thread.sleep(2000);

	    System.out.println("Total no of products in Top brands for Groceries(category) is : "+ prod1.size());

	    for(WebElement pro : prod1) {

	    	System.out.println(pro.getText());

	    }

	    List<WebElement> prod2= driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(6000);

	    System.out.println("Total no of products in Top selling products and New arrivals for Groceries(category) is : "+ prod2.size());

	    for(WebElement pro : prod2) {

	   	System.out.println(pro.getText());

	    }

	    

	    driver.findElement(By.xpath("//li[@class='breadcrumb-item']/a")).click();

	    

	    ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

	    Thread.sleep(2000);

	    

	    driver.findElement(By.xpath("//img[@class='img-responsive category-img'][@alt='Beauty']")).click();

	    Thread.sleep(3000);

	    List<WebElement> prod3= driver.findElements(By.xpath("//div[@class='b_pro_name']"));

	    Thread.sleep(2000);

	    System.out.println("Total no of products in Top brands for Beauty(category) is : "+ prod3.size());

	    for(WebElement pro : prod3) {

	    	System.out.println(pro.getText());

	    }

	    List<WebElement> prod4= driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(6000);

	    System.out.println("Total no of products in Top selling products and New arrivals for Beauty(category) is : "+ prod4.size());

	    for(WebElement pro : prod4) {

	   	System.out.println(pro.getText());

	    }

	    

	    driver.findElement(By.xpath("//li[@class='breadcrumb-item']/a")).click();

	      

	    ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

	    Thread.sleep(2000);

	    

	    driver.findElement(By.xpath("//img[@class='img-responsive category-img'][@alt='Electronics']")).click();

	    Thread.sleep(3000);

	    List<WebElement> prod5= driver.findElements(By.xpath("//div[@class='b_pro_name']"));

	    Thread.sleep(2000);

	    System.out.println("Total no of products in Top brands for Electronics(category) is : "+ prod5.size());

	    for(WebElement pro : prod5) {

	    	System.out.println(pro.getText());

	    }

	    List<WebElement> prod6= driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(6000);

	    System.out.println("Total no of products in Top selling products and New arrivals for Electronics(category) is : "+ prod6.size());

	    for(WebElement pro : prod6) {

	   	System.out.println(pro.getText());

	    }

	    

	    driver.findElement(By.xpath("//li[@class='breadcrumb-item']/a")).click();

	    

	    ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

	    Thread.sleep(8000);

	    

	    driver.findElement(By.xpath("//img[@class='img-responsive category-img'][@alt='Pharmacy']")).click();

	    Thread.sleep(3000);

	    List<WebElement> prod7= driver.findElements(By.xpath("//div[@class='b_pro_name']"));

	    Thread.sleep(2000);

	    System.out.println("Total no of products in Top brands for Pharmacy(category) is : "+ prod7.size());

	    for(WebElement pro : prod7) {

	    	System.out.println(pro.getText());

	    }

	    List<WebElement> prod8= driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(6000);

	    System.out.println("Total no of products in Top selling products and New arrivals for Pharmacy(category) is :"+ prod8.size());

	    for(WebElement pro : prod8) {

	   	System.out.println(pro.getText());

	    }

	    

	    driver.findElement(By.xpath("//li[@class='breadcrumb-item']/a")).click();



	    

	    ((JavascriptExecutor)driver).executeScript("scroll(0,300)");

	    Thread.sleep(10000);

	    

	    driver.findElement(By.xpath("//img[@class='img-responsive category-img'][@alt='Books']")).click();

	    Thread.sleep(3000);

	    List<WebElement> prod9= driver.findElements(By.xpath("//div[@class='b_pro_name']"));

	    Thread.sleep(2000);

	    System.out.println("Total no of products in Top brands for Books(category) is : "+ prod9.size());

	    for(WebElement pro : prod9) {

	    	System.out.println(pro.getText());

	    }

	    List<WebElement> prod10= driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(6000);

	    System.out.println("Total no of products in Top selling products and New arrivals for Books(category) is :"+ prod10.size());

	    for(WebElement pro : prod10) {

	   	System.out.println(pro.getText());

	    }

	    

	    driver.findElement(By.xpath("//li[@class='breadcrumb-item']/a")).click();

	    driver.quit();



	    
	
	    }

	    

	   



}	    


