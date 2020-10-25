package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapint 
{

	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<>();
        map.put("actor", "John");
        map.put("actor234", "John123" );
        map.put("actordsff",  "Neha");
        map.put("herione",  "mohan");
        map.put("manager", "sriya");
        map.put("sales", "asd");
        map.put("qa", "swetha");
        map.put("scrum", "sdfvb");
        Set<String> keys=map.keySet();
        for (String s : keys)
        {
        	System.out.println(s +" "+ map.get(s));
        }
	}

}
