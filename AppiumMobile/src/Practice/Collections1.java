package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collections1 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{   
		//using iterator 
		List<Integer> coll=new ArrayList< >();
		coll.add(101);
		coll.add(238);
		coll.add(345);
		coll.add(456);
		coll.add(2, 567);
//		Iterator it=coll.iterator();
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next());
//		}
		
	    Collections.sort(coll, (i, j) ->  i%10<j%10?1 :-1);
//		Collections.reverse(coll);
//		Collections.shuffle(coll);
		//using for loop
	    
		for (int o:coll)
		{
			System.out.println(o);
		}
		
		

	}

}
