package Practice;

public class Isprime {

	public static void main(String[] args) {
	    int num=25;
	    boolean isprime=true;
	    for (int i=2;i<num;i++)
	    {
	    	if (num%i==0)
	    	{
	    		isprime= false;
	            break;
	    	}
	    }
	    if(isprime)
	    	System.out.println(num + "is prime");
	    else
	    	System.out.println(num + "is not");
	}

}
