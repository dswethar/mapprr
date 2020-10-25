package Practice;

public class PermuationString {

	public static void main(String[] args)
	{
		StringPermutation("JSP");
	}
	static void StringPermutation(String input)
	{
		StringPermutation(" ",input);
	}
	private static void StringPermutation(String Permutation,String input)
	{
		if(input.length()==0)
		{
            System.out.println(Permutation);
		}
		else
		{
			for(int i=0;i<input.length();i++)
			{
				StringPermutation(Permutation+input.charAt(i),input.substring(0, i)+input.substring(i+1, input.length()));
			}
		}
		
		
	}

}
