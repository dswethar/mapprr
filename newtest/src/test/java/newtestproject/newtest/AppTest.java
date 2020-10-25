package newtestproject.newtest;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.testng.annotations.Test;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{       
	@Test
	public void First()
	{
		// TODO Auto-generated method stub
        // 153=1*3+5*3+3*3=153 ,e.g.,370
		int n=153,r,sum=0;
		int temp=n;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
		}
		if(temp==sum)
		    System.out.println("The number "+temp+" is an Amstrong number");
		else
			System.out.println("The number "+n+" is not an Amstrong number");
	}
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}
