package Practice;

import java.util.Scanner;

public class PalindromeAdd {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int number= sc.nextInt();
		reverseandadd(number);
	}

	static void reverseandadd(int number)
	{
		if(checkPalindrome(number))
				{
			       System.out.println("The number is already a palindrome");
				}
		else
		{
			while(!checkPalindrome(number))
			{  
				int reverse= reverseNum(number);
			    int sum=reverse+number;
			    System.out.println(number+  "+"  +reverse+  "="  +sum);
			    number = sum; 
			    		
			}
		}	
	}
	static int reverseNum(int number)
	{
		int reverse=0;
		int rem=0;
		while(number!=0)
		{
			rem=number % 10;
			reverse=reverse*10 +rem;
			number=number/10;
			
		}
		return reverse;
		
	}
	static boolean checkPalindrome(int number)
	{    
		int reverse = reverseNum(number);
		if(reverse == number)
		{
			return true;
		}
		else
		return false;
		
		
	}

}
