package Practice;

import java.text.DecimalFormat;

public class CharPercentage {

	public static void main(String[] args) 
	{
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
        characterPercentage("AUS : 123/3, 21.2 Overs");
    }

    static void characterPercentage(String inputString)
    {
		int total=inputString.length();
		int uppercaseletters=0;	
		int lowercaseletters=0;	
		int digits=0;	
		int others=0;	
		for (int i=0;i<total;i++)
		{
			char ch=inputString.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercaseletters ++;
			}
			if(Character.isLowerCase(ch))
			{
				lowercaseletters ++;
			}
			if(Character.isDigit(ch))
			{
				digits ++;
			}
			else
			{
				others ++;
			}
		}
		double UppercasePercentage=((uppercaseletters *100.0)/total);
		double lowercasePercentage=((lowercaseletters *100.0)/total);
		double digitsPercentage=((digits *100.0)/total);
		double othersPercentage=((others *100.0)/total);
		DecimalFormat formater =new DecimalFormat("##.##");	
		System.out.println("In '"+inputString+"':");
		System.out.println("UppercasePercentage is:"+formater.format(UppercasePercentage)+"%");
		System.out.println("LowercasePercentage is:"+formater.format(lowercasePercentage)+"%");
		System.out.println("digitsPercentage is:"+formater.format(digitsPercentage)+"%");
		System.out.println("othersPercentage is:"+formater.format(othersPercentage)+"%");
		 System.out.println("-----------------------------");
		
    }

}


