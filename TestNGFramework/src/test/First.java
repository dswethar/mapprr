package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First 
{
   @BeforeGroups("smoke")
   public void First()
   {
	   System.out.println("First Test");
   }
   @BeforeTest
   public void BeforeFirst()
   {
	   System.out.println("Before First Test");
   }
   @AfterTest
   public void AfterFirst()
   {
	   System.out.println("After First Test");
   }
   @Test(groups= {"smoke"})
   public void ThirdTest() 
   {
	   System.out.println("Third Test");
   }
   @BeforeClass
   public void FourthTest() 
   {
	   System.out.println("Fourth Test");
   }
   @BeforeMethod
   public void FifthTest() 
   {
	   System.out.println("Fifth Test");
   }
   @AfterMethod
   public void SixthTest() 
   {
	   System.out.println("Sixth Test");
   }
}
