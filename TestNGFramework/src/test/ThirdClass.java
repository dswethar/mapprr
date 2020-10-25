package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThirdClass 
{
	 @Test
	    public void Apilogin()
	    {
	    	System.out.println("Api Login");
	    }
	    @Test
	    public void MobileAndroidApilogin()
	    {
	    	System.out.println("Mobile Api Login");
	    }
	    @BeforeSuite
	    public void Beforelogin()
	    {
	    	System.out.println("Execute first");
	    }
	    @AfterSuite
	    public void Afterlogin()
	    {
	    	System.out.println("Execute last");
	    }
	    @Test
	    public void MobileiOSApilogin()
	    {
	    	System.out.println("Mobile ios Api Login");
	    }
	    @Test
	    public void WebApilogin()
	    {
	    	System.out.println("Web Api Login");
	    }
}
