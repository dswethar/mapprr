package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng 
{
	@Test
	public void FirstTest()
	{
		System.out.println("First Test");
	}
	@BeforeTest
	public void SecondTest()
	{
		System.out.println("Second Test");
	}
//	@BeforeTest
//	public void Second1Test()
//	{
//		System.out.println("Second1 Test");
//	}
	@AfterTest
	public void LastTest()
	{
		System.out.println("Last Test");
	}

}
