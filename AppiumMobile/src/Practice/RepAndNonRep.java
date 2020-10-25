package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RepAndNonRep {

	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your string:");
		String input= sc.next();
		firstRepeatedNonRepeatedChar(input);
	}

	 static void firstRepeatedNonRepeatedChar(String input) 
	 {
		
		HashMap<Character,Integer> charCountMap =new HashMap<>();
		char[] chararray= input.toCharArray();
		
		for(Character c:chararray)
		if(charCountMap.containsKey(c))
		{
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else 
		{
			charCountMap.put(c, 1);
		}
		for(char c:chararray)
		{
		if(charCountMap.get(c)==1)
		{
			System.out.println("First non repeated char in : "+input+" is :"+c);
			break;
		}
		}
		for(char c:chararray)
		{
		if(charCountMap.get(c)>1)
		{
			System.out.println("repeated char in : "+input+" is :"+c);
			break;
		}
		Set<Character> wordCount=charCountMap.keySet();
		for(char ch:wordCount)
		{
			
			if(charCountMap.get(ch)>1)
			{
			System.out.println(ch+":"+charCountMap.get(ch));
			}
		}
		}
	 }

}
