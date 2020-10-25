package Practice;

public class Perfectnum {
       // 6=1+2+3 perfect number
	   // 28=1+2+4+7+14  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=496;
		Boolean b=perfect(n);
		if(b)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
		
	}
     public static boolean perfect(int n)
     {
		 int sum=0;
		 for(int i=1;i<n;i++)
		 { 
			     if(n%i==0)
		    	    sum+=i;
		 }
		 if(n==sum)
			 return true;
		     
		   	 
   	 return false;
    	 
     }
}
