package Practice;

public class CountCharacterOccurence
{
    public static void main(String[] args)
    {
        String s = "It is-b444etter@345with678mus44ic4";
 
        char c = '4';
 
        int count = s.length() - s.replace("4", "").length();
 
        System.out.println("Number of occurences of '4'  = "+count);
    }
}
