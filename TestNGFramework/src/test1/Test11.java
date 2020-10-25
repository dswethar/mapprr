package test1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test11 {
	

	   @Test
	   public void First()
	   {
		   System.out.println("test 1");
	   }
	   @BeforeTest
	   public void BeforeFirst()
	   {
		   System.out.println("Before Test");
	   }
	   @AfterTest
	   public void AfterFirst()
	   {
		   System.out.println("After Test");
	   }
}
