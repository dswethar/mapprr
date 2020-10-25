package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

public class WebPratice 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver");	
		System.setProperty("webdriver.gecko.driver", "/Users/swethareddy/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");  //Hit url on the browser
		System.out.println(driver.getTitle());  //validate if your page title is correct
		System.out.println(driver.getCurrentUrl());  //validate if you landed on correct URL
		//System.out.println(driver.getPageSource());  //print page source
		//driver.navigate().to("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.id("email")).sendKeys("swetha@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234456");
		Thread.sleep(5000);
		//TouchActions action = new TouchActions(driver);
	//	driver.findElement(By.cssSelector("[id=u_0_b]")).click();
		//action.longPress(press);
		driver.findElement(By.cssSelector("[id='u_0_2']")).click();
		System.out.println(driver.getTitle()); 
		Thread.sleep(15000);
		driver.quit();
		
	}
		
		
		
}
	


