
package Practice;

import java.util.HashMap;
import java.util.Set;

public class String1 {

	public static void main(String[] args) 
	{
	  WordCount("Bread butter jam bread");
	  WordCount("Java is c better than C language and C");
	  WordCount("Mom in law and father in law");

	  
	}
	static void WordCount(String inputString)
	{  
	    String[] words=inputString.split(" ");
	    HashMap<String,Integer> wordCount= new HashMap<>();
	    for(String word:words)
	    {
	    	if(wordCount.containsKey(word.toLowerCase()))
	    	{
	    		wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
	    	}
	    	else
	    	{
	    		wordCount.put(word.toLowerCase(),1);
	    	}
	    }
	    Set<String> wordsInString= wordCount.keySet();
	    for(String word:wordsInString)
	    {
	    	if(wordCount.get(word)>1)
	    	{
	    		System.out.println(word+":"+wordCount.get(word));
	    	}
	    }
	}

}
