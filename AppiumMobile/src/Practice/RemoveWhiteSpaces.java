package Practice;

import java.util.Scanner;

public class RemoveWhiteSpaces 
	{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter input string to be cleaned from white spaces...!");
	         
	        String inputString = sc.nextLine();
//	        char[] chararray=inputString.toCharArray();
//	        String stringWithoutSpaces= " ";
//	        for(int i=0;i<=chararray.length;i++)
//	        {
//	        	if((chararray[i]==' ') || (chararray[i]!='\t'))
//	        	stringWithoutSpaces=stringWithoutSpaces+chararray[i];
//	        }
	         
	        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
	         
	        sc.close();
	    }
	}

