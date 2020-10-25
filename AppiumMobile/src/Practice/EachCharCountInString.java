package Practice;

import java.util.HashMap;
import java.util.Set;

public class EachCharCountInString {

	public static void main(String[] args) 
	{
		CharacterCount("Java is better than C AND JAVA");
		CharacterCount("Bread with Jam is a good combo");
		CharacterCount("It is-better@344445with678music");

	}

	private static void CharacterCount(String inputString) 
	{
           HashMap<Character,Integer> charCountMap= new HashMap<>();
           char[] strarray=inputString.toCharArray();
           for (char c:strarray)
           {
        	   if(charCountMap.containsKey(c))
        	   {
        		   charCountMap.put(c, charCountMap.get(c)+1);
        	   }
        	   else
        	   {
        		   charCountMap.put(c, 1);
        	   }
           }
          // System.out.println(inputString+":"+charCountMap);
           Set<Character> charinString=charCountMap.keySet();
           System.out.println("Duplicate Characters In "+inputString);
           for (Character ch:charinString)
           {
        	     if(charCountMap.get(ch)>1)
        	     {
        		   System.out.println(ch+":"+charCountMap.get(ch));
        	     }
           }
	}

}
