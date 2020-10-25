package Practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class amstrong {

	public static void main(String[] args) 
	{
		
      //   153=1*3+5*3+3*3=153 ,e.g.,370
		int n=153,r,sum=0;
		int temp=n;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
		}
		if(temp==sum)
		    System.out.println("The number "+temp+" is an Amstrong number");
		else
			System.out.println("The number "+n+" is not an Amstrong number");
//		int[] inputArray= {23,44,56,77,88,23,45,44,78,65,44,56};
//		Duplicatenum(inputArray);
//	}
//
//	static void Duplicatenum(int[] inputArray)
//	{
//		HashMap<Integer,Integer> hm= new HashMap<>();
//		for(int i:inputArray)
//		{
//			if(hm.containsKey(i))
//			{
//				hm.put(i, hm.get(i)+1);
//			}
//			else {
//				hm.put(i,1);
//			}
//		}
//		Set<Entry<Integer, Integer>> entrySet= hm.entrySet();
//		for(Entry<Integer, Integer> entry:entrySet)
//		{
//			if(entry.getValue()>1)
//			{
//				System.out.println("Duplicate Element:"+entry.getKey()+" is found " +entry.getValue()+ " times");
//			}
//		}
	}

}
