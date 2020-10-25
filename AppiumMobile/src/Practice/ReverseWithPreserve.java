package Practice;

public class ReverseWithPreserve {

	public static void main(String[] args)
	{
		 reverseString("I Am Not String");
         reverseString("JAVA JSP ANDROID");
	     reverseString("1 22 333 4444 55555");
	}
    static void reverseString(String inputString) 
    {
		 char[] inputStringArray= inputString.toCharArray();
		 char[] resultString =new char[inputStringArray.length];
	     for (int i=0;i<inputStringArray.length;i++)
	     {
	    	 if(inputStringArray[i]==' ')
	    	 {
	    		 resultString[i]=' ';
	    	 }
	     }
	     int j=resultString.length-1;
	     for (int i=0;i<inputStringArray.length;i++)
	     {
	    	 if(inputStringArray[i]!=' ')
	    	 {
	    		if(resultString[j]==' ')
	    		{
	    		 j--;
	    		}
	    	   resultString[j]= inputStringArray[i];
	    	   j--;
	    	 }
	     }
	     System.out.println(inputString+ "-------------->" +String.valueOf(resultString));
	}

}
