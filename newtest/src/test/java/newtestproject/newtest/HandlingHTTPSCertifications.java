package newtestproject.newtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPSCertifications {

	public static void main(String[] args) throws IOException
	{
		//Create general profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//Set local browser settings
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver(c);
		//To take Screenshot
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //to create a copy in local
			FileUtils.copyFile(src,new File("C://Screenshot.png"));
	}

}
