package Practice;

import java.util.Arrays;

public class mergeArrays 
{
   public static int[] merge(int[] arr1,int[] arr2)
   {
	   int i=0,j=0,k=0;
	   int[] mergedarray= new int[arr1.length+arr2.length];
	   while (i<arr1.length)
	   {
		   mergedarray[k]=arr1[i];
		   i++;
		   k++;
	   }
	   while (j<arr2.length)
	   {
		   mergedarray[k]=arr2[j];
		   j++;
		   k++;
	   }
	   Arrays.sort(mergedarray);
	return mergedarray;
	   
   }
	public static void main(String[] args) 
	{
		   int[] arr1= {3,6,8,9,23};
		   int[] arr2= {-3,16,28,-9,33};
		   int[] mergedarray=merge(arr1,arr2);
		   System.out.println("Array a is"+Arrays.toString(arr1));
		   System.out.println("Array b is"+Arrays.toString(arr2));
		   System.out.println("Merged Array is"+Arrays.toString(mergedarray));


	}

}
