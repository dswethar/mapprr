package Practice;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0-127
		// 7 bits
		// ascii-american standard code for information interchange
		// 2*7=128
		/*Each character corresponds to a seven-digit sequence of zeroes and ones, 
		 *which can then be represented as a decimal number, or as a hexadecimal number. 
		 * The ASCII characters can be divided into several groups.
        ->Control Characters (0–31 & 127): Control characters are not printable characters.
          They are used to send commands to the PC or the printer and are based on telex technology.
          With these characters, you can set line breaks or tabs. Today, they are mostly out of use.
        -> Special Characters (32–47 / 58–64 / 91–96 / 123–126): Special characters include all printable characters 
          that are neither letters nor numbers. These include punctuation or technical, mathematical characters. 
          ASCII also includes the space (a non-visible but printable character), and, 
          therefore, does not belong to the control characters category, as one might suspect.
        ->Numbers (48–57): These numbers include the ten Arabic numerals from 0-9.
        -> Letters (65–90 / 97–122): Letters are divided into two blocks, with the first group containing 
          the uppercase letters and the second group containing the lowercase.*/
		for (int i=0;i<=127;i++)
		{
			System.out.printf("%d  :  %c  \n ",i,i);
		}

	}

}
