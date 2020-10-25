package interview;

import java.util.ArrayList;
import java.util.List;

public class Test1 
{

	public static void main(String[] args) 
	{
		 
//       String s="@sweth#a%";
//       //reverse="@ahtew#s%:
//       String reverse="";
//       int len=s.length();
//       for (int i=len-1;i<=0;i++)
//       {
//    	   if()
//    	   reverse=reverse+s.charAt(i);
//    	   
//       }
		List<Integer> list= new ArrayList<>(
				);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(8);
		list.add(8);
		//Duplicate
		//5-2.8-3,10-1
		int freq=0;
		Object[] arr1=list.toArray();
		int[][] arr2=new int[arr1.length][freq];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr1[0]==arr1[i])
				{
					freq++;
					
				}
				System.out.println(freq);
			}
		}
	}

}
