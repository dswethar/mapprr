package Practice;

public class ReverseEachWord {

	public static void main(String[] args) 
	{
		reverseEachWordOfString("Java Concept Of The Day");  
        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");  
        reverseEachWordOfString("I am string not reversed");
        reverseEachWordOfString("Reverse Me");

	}

	 static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split("\\s");
		String reverse= " ";
		for (int i=0;i<words.length;i++)
		{
			String word = words[i];
			String rev=" ";
			for (int j=word.length()-1;j>=0;j--)
			{
				rev = rev+ word.charAt(j);
			}
			reverse = reverse + rev + " ";
		}
		 
        System.out.println(inputString);
         
        System.out.println(reverse);
         
        System.out.println("-------------------------");
		
	}

}
