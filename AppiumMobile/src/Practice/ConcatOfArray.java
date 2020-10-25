package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatOfArray 
{
   public static void main(String[] args) 
	{
	     //concat of array
//		 int arr1[]= {1,2,4,3,5};
//		   int arr2[]= {3,6,9,5};
//		   int length=arr1.length+arr2.length;
//		   int result[]=new int[length]; 
//		   int pos=0;
//		   for (int element:arr1)
//		   {
//			   result[pos]=element;
//			   pos++;
//		   }
//		   for (int element:arr2)
//		   {
//			   result[pos]=element;
//			   pos++;
//		   }
//		   System.out.println(Arrays.toString(result));
	   
	   //calc avg using arrays
//	   double[] numarray= {4.6,5.8,3.9,5.7,3.6,2.5};
//	   double sum=0.0;
//	   for (double num:numarray)
//	   {
//		   sum+=num;
//	   }
//	   double average=sum/numarray.length;
//	   System.out.format("The average is: %.2f ", average);
	   
	   //largest num in an array
//	   double[] numarr= {3.5,6.9,7.4,2.99,4.677,8.99};
//	   double largest=0.0;
//	   for(double num:numarr)
//	    {
//		   if (largest<num)
//			 largest=num;
//	    }
//	   System.out.format("The largest is :%.2f", largest);
	   
	   //standard deviation
//	   double[] numarray= {1,2,3,4,5,6,7,8,9,10};
//	   double SD=calculateSd(numarray);
//	   System.out.format("The standard deviation is : %.6f",SD);
	   
	   //concat two arrays
//	   int[] array1= {2,3,4,5,9};
//	   int[] array2= {6,7,9,10,11};
//	    
//	   int length=array1.length+array2.length;
//	   int[] result=new int[length];
//	   int pos=0;
//	    
//	   for (int  num:array1)
//	   {
//		   result[pos]=num;
//		   pos++;
//	   }
//	   for (int  num:array2)
//	   {
//		   result[pos]=num;
//		   pos++;
//	   }
//	   System.out.println(Arrays.toString(result));
//	   
//	   }
	   //multdim array
//       int [][] array1= {{1,2},{4,5},{6,7,9,8},{5,9}};
//       System.out.format(Arrays.deepToString(array1));
	   
	   //chararray
//	   char[] st= {'d','e','r','s','t'};
//	   String st1=String.valueOf(st);
//	   String st2=new String(st);
//
//       System.out.println(st1);
//       System.out.println(st2);
	   
	   //add two matrices
	   int[][] firstMatrix= {{2,3,4},{6,7,8}};
	   int[][] secondMatrix= {{3,5,6},{7,8,3}};
	   int rows=2,columns=3;
	   int[][] sum=new int[rows][columns];
	   for(int i=0;i<rows;i++)
	   {
		   for(int j=0;j<columns;j++)
		   {
			   sum[i][j]= firstMatrix[i][j]+secondMatrix[i][j];
		   }
	   }
	   System.out.println("The sum of matrices is:");
	   for  (int[] row:sum)
	   {
		   for (int column:row)
		   {
		   System.out.print(column + " ");
		   }
		   System.out.println();
	   }
	   
       }
       
//       public static double calculateSd(double[] numarray)
//       {
//	     double sum=0.0,standardDeviation=0.0;
//	     int length=numarray.length;
//	     for (double num:numarray)
//	     {
//	    	 sum += num;
//	     }
//	     double mean=sum/length;
//	     for (double num:numarray)
//	      {
//	       standardDeviation+=Math.pow(num-mean, 2);
//	      }
//	      return Math.sqrt(standardDeviation/length);
//	   }

}
