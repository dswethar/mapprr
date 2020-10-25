package Practice;

import java.util.Scanner;

public class reverseStringWord
{
	public static String reverseWord(String inputString)
	{
		String[] words= inputString.split("\\s");
		String outputString="";
		for(int i=words.length-1;i>=0;i--)
		{
			outputString = outputString + words[i]+ " ";
		}
		return outputString;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String inputString = sc.nextLine();
		String outputString = reverseWord(inputString);
		System.out.println("Input String :" + inputString);
		System.out.println("Output String :" + outputString);
		sc.close();
	}
//  driver.navigate().back();
//  driver.navigate().forward();
//  driver.close();
//  driver.quit();
//  driver.getTitle();
//  driver.getCurrentUrl();
//  driver.getPageSource();
//  System.setProperty("webdriver.chromedriver","C:\\work\\chromedriver.exe");
//  WebDriver driver =new ChromeDriver();
//  driver.get("");
//  driver.findElement(By.id("")).click();
  }
