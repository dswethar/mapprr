package web;


	import java.util.*; 
	import java.io.*;

	class SumMulltiplier {

	  static int maxProduct(int arr[] ,int n)
	  {
	    if(n<2)
	    {
	      System.out.println("No pairs exist");
	      return -1; 
	    }
	    int a = arr[0],b = arr[1];
	    for (int i=0;i<n;i++)
	    {
	      for(int j = i+1;j<n;j++)
	      {
	        if(arr[i] * arr[j] > a * b)
	        {
	          a= arr[i];
	          b= arr[j];
	        }
	      }
	    }
	    int c=a*b;
	    System.out.println("Max product pair is {"+a+","+b+"}");
		return c;
	  }

	

	    public  boolean SumMultiplier(int[] array) {
	      // code goes here  
	    	int c = maxProduct(array, array.length);
	        int sum=0;
	       
	        for( int num : array) {
	            sum = sum+num;
	        }
	        int sum1=sum*2;
	        System.out.println("Sum muliplier is:"+sum1);
	        if(c>sum1)
	        return true;
	        return false;
	    }

	      public static void main (String[] args) {  
	      // keep this function call here     
	    	  Scanner sc = new Scanner(System.in);
	       //   System.out.println("Enter the size of the array that is to be created::");
	          
	          int[] myArray = new int[] {2, 2, 2, 2, 4, 1};
	    //      System.out.println("Enter the elements of the array ::");

//	          for(int i=0; i<myArray.length; i++) 
//	          {
//	             myArray[i] = sc.nextInt();
//	          }
	          int[] myarr2=new int[] {1, 1, 2, 10, 3, 1, 12};
	      
	          SumMulltiplier m = new SumMulltiplier();
	          System.out.print(m.SumMultiplier(myArray));
	          System.out.println();
	          System.out.print(m.SumMultiplier(myarr2));
	          
//	          Input: new int[] {2, 2, 2, 2, 4, 1}
//	          Output: false
//	          Input: new int[] {1, 1, 2, 10, 3, 1, 12}
//	          Output: true
	     
	    }
}