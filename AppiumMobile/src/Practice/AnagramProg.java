package Practice;

import java.util.Arrays;

public class AnagramProg {

	public static void main(String[] args)
	{
		    isAnagram("Mother In Law", "Hitler Woman");
		 
	        isAnagram("keEp", "peeK");
	 
	        isAnagram("SiLeNt CAT", "LisTen AcT");
	 
	        isAnagram("Debit Card", "Bad Credit");
	 
	        isAnagram("School MASTER", "The ClassROOM");
	 
	        isAnagram("DORMITORY", "Dirty Room");
	 
	        isAnagram("ASTRONOMERS", "NO MORE STARS");
	 
	        isAnagram("Toss", "Shot");
	 
	        isAnagram("joy", "enjoy");
   
	}

	 static void isAnagram(String s1, String s2)
	 {
	    String copyOfs1=s1.replaceAll("\\s", "");
	    String copyOfs2=s2.replaceAll("\\s", "");
	    boolean status = true;
	    if(copyOfs1.length() != copyOfs2.length())
	    {
	    	System.out.println(s1+ ":" +s2+ "are not anagrams");
	    	status= false;
	    }
	    else
	    {
	    	char[] c1= copyOfs1.toLowerCase().toCharArray();
		    char[] c2=  copyOfs2.toLowerCase().toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    status= Arrays.equals(c1, c2);
	    }
	    if(status)
	    {
	    	System.out.println(s1+" and "+s2+ " are anagrams");
	    }
	    else
	    {
	    	System.out.println(s1+" and "+s2+ " are not anagrams");
	    }
	}

}
