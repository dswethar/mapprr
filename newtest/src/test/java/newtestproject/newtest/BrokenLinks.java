package newtestproject.newtest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		//get all the links of the webpage using selenium
		//using java methods we will call the urls and get the status code
		//if status code>400 ,then url is not working ->link tied to url is broken
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a =new SoftAssert();
		for(WebElement link:links)
		{
		    String url= link.getAttribute("href");
		    HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400,"The link which you are trying to access "+link.getText()+" is broken "+respcode);
			
		}
		a.assertAll();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"placename\").value";
		String text=(String) js.executeScript(script);
		driver.quit();
	}
}
