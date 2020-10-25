package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class login {

	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("something", true);
        ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.merge(capabilities);
        System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.get("http://qa.mapprr.com/");
	    //driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement t1 = driver.findElement(By.id("m_loc"));
	  	t1.sendKeys("Madhapur, Hyderabad, Telangana, India");
	  	Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("/html/body/div[24]/div[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,\'my_cart\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'common_btn cart_empty_btn cart_no_login')]")).click();
	    Thread.sleep(3000);
	  //  driver.findElement(By.xpath("//a[@id='login_btn']")).click();
	  //  Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//*[contains(@class,'common_btn login_submit_modal')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"otp\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"otp_form\"]/div[3]/div/button")).click();
		System.out.println("login completed successfully");
		Thread.sleep(4000);
	    
	    
	}
}
