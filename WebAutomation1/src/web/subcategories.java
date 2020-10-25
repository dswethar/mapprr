package web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subcategories {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver 2");

		WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.get("http://qa.mapprr.com/");

	    Thread.sleep(3000); 

	    driver.findElement(By.xpath("//a[@id='login_btn']")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");

	    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Login ']")).click();

	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");

	    driver.findElement(By.xpath("//*[contains(@class,\"common_btn login_submit_modal\")][text()='Submit ']")).click();

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//span[@class='hidden-xs'][1]")).click();

	    Thread.sleep(5000);

	    ((JavascriptExecutor)driver).executeScript("scroll(0,200)");

	    Thread.sleep(3000);

	    ((JavascriptExecutor)driver).executeScript("scroll(0,750)");

	    driver.findElement(By.xpath("//div[@class='trending_pro']")).click();

		Thread.sleep(3000);

		java.util.List<WebElement> prod1=driver.findElements(By.xpath("//div[@class='p_sub1']"));

	    Thread.sleep(7000);

		System.out.println("Total no of productscategory1 is "+prod1.size());

		for(WebElement pro : prod1) {

		    	System.out.println(pro.getText());

		    }

		

		

	   

	   

	 

	}

}
