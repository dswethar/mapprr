package web;

//	import java.util.*; 
//	import java.io.*;
//
//	class Main {
//
////	  public static int StringReduction(String str) {
////	    // code goes here  
////		  Stack<Character> s = new Stack<Character>();
////	    for (int i=0;i<str.length();i++)
////	    {
////	     
////	      if (s.empty())
////	      {
////	        s.push(str.charAt(i));
////	      }
////	      else
////	      {
////	        char c = s.peek();
////	        if(c!= str.charAt(i) &&  
////	        Character.toUpperCase(c) == Character.toUpperCase((str.charAt(i))))
////	        {
////	          s.pop();
////	        }
////	        else 
////	        {
////	          s.push(str.charAt(i));
////	        }
////	      }
////	    }
////	    return s.size();
////	  }
////
//	  public static void main (String[] args) {  
////	    // keep this function call here     
////	    Scanner sc = new Scanner(System.in);
////	    System.out.println("Entr your string here:");
////	    String str1=sc.nextLine();
////	    System.out.print(StringReduction(str1)); 
//		  Scanner scanner = new Scanner(System.in);
//	      int[] array = new int[10];
//	      int sum = 0;
//	      System.out.println("Enter the elements:");
//	      for (int i=0; i<10; i++)
//	      {
//	    	  array[i] = scanner.nextInt();
//	      }
//	      for( int num : array) {
//	          sum = sum+num;
//	      }
//	      System.out.println("Sum of array elements is:"+sum);
//   }

import java.util.*; 
import java.io.*;

class Main {

  private static int StringReduction(String str) 
  {
    // code goes here 
    int changes=0,max=-1;
    String str2;
    String maxstring=str ;
    do
    {
      changes=0;
      max =-1;
      for(int i=0;i<str.length()-1;i++)
      {
        str2=str;
        if(str2.charAt(i)!=str2.charAt(i+1))
        {
     //   	str2= str2.substring(0, i-1)+third(str.charAt(i),str2.charAt(i+1))+ str2.substring(i+2);
        	str2= substring(str2,0, i)+third(str2.charAt(i),str2.charAt(i+1))+ str2.substring(i+2);
          changes= calcChanges(str2);
          if(changes> max)
          {
            max= changes;
            maxstring = str2;
          }
        }
      }
      str = maxstring;
      System.out.println(str);

    }while (max>0);
    return str.length();
  }
  private static String substring(String a,int begin, int end)
  {
    String toRet= "";
    if(end<0)
    return toRet;

    if(end>a.length())
      end= a.length();
    return a.substring(begin,end);
  }
  private static int calcChanges(String str2)
  {
    int changes1 = 0;
    for (int i=0;i+1<str2.length();i=i+2)
    {
      if(str2.charAt(i)!=str2.charAt(i+1))
      {
        changes1++;
      }
    }
    int changes2 =0;
    for (int i= 1; i+1<str2.length(); i=i+2)
    {
      if(str2.charAt(i)!=str2.charAt(i+1))
      {
        changes2++;
      }
    }
    return Math.max(changes1,changes2);
  }
  private static char third(char a,char b)
  {
    if(a=='a'&& b=='b' || b=='a'&& a=='b')
    {
      return 'c';
    }
    if(a=='b'&&b=='c' || b=='b' && a=='c')
    {
      return 'a';
    }
    if(a=='a' && b=='c' ||b=='a' && a=='c')
    {
      return 'b';
    }
    return 'a';
  }
  public static void main (String[] args) 
  {  
    // keep this function call here     
    Scanner sc = new Scanner(System.in);
    int num = 0;
    if(sc.hasNextInt())
    {
      num=sc.nextInt();
    }
   
   // int num=sc.nextInt();
  //  System.out.println("Enter you string:");
    String str;
    for(int i=0;i<num;i++)
    {
      str= sc.next();
      System.out.println(StringReduction(str));
    }
    sc.close();
   // System.out.print(StringReduction(s.nextLine())); 
  }

}


