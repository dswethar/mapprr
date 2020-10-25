package Practice;

import java.util.Scanner;

public class stringrev 
{
	// Java program to print the 
			// sum of the consecutive elements. 

				
				// Function to print Alternate sum 
//				static void pairwiseSum(int arr[], int n) 
//				{ 
//					int sum = 0; 
//					for (int i = 0; i + 2 < n; i++) 
//					{ 
//						// adding the alternate numbers 
//						sum = arr[i] + arr[i + 1]+arr[i+2];
//						System.out.print(sum + " "); 
//					} 
//				} 
	public static void main(String[] args) 
 	{
//		int arr[] = {4, 10, 15, 5, 6, 12, 20, 54}; 
//		int n = arr.length; 
//		pairwiseSum(arr, n); 
		String original;
		String rev="";
		System.out.println("Enter your string:");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
//		StringBuffer sb=new StringBuffer(original);
//		rev=sb.reverse().toString();
		int len=original.length();
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println(rev);
////		Number pattern
//		int n=4,k=1;
//		for(int i=0;i<n+1;i++)
//		{
//			for(int j=1;j<=i+1;j++)
//			{
//				System.out.print(k);
//				System.out.print(" ");
//				k++;
//				
//		}
//			System.out.println();
//			}
//				
		
			
			/*driver function to test function*/
			
		

	}

}
