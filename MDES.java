/**
 * 
 */

/**
 * @author Ananta Bhatt
 *
 */
public class MDES {
	public static char alphabets[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' ,' ','.',',','?','(',')'};
    public static String elements[]  = {"00000", "00001", "00010", "00011", "00100", "00101","00110", "00111", "01000",
        "01001", "01010","01011","01100","01101","01110","01111", "10000", "10001", "10010", "10011", "10100", "10101",
        "10110", "10111", "11000", "11001","11010","11011","11100","11101","11111"};
    
    public static String[] binaryConversion(char[] plaintext)
    {
        String a[] = new String[(plaintext.length)];
        
        for (int i = 0; i < plaintext.length; i++)
        {
            for (int j = 0; j < 32; j++)
            {
                if (alphabets[j] == plaintext[i])
                {
                    a[i] = elements[j];
                    break;
                }
            }
        }
        return (a);
    }
    public static char[] string_Conversion(String[] binary_value)
    {
        char q[] = new char[(binary_value.length)];
        for (int i = 0; i < binary_value.length; i++)
        {
            for (int j = 0; j < 32; j++)
            {
                if (elements[j] == binary_value[i])
                {
                    q[i] = alphabets[j];
                    break;
                }
            }
        }
        return (q);
    }
    public static void main(String args[])
    {
    	 
        String plaintext="how do you like computer science";
        char[] plainText_char=plaintext.toLowerCase().toCharArray();
        System.out.println("The Plaintext message is: \n" + plaintext);
        System.out.println();
        String[] binary_value = binaryConversion(plainText_char);
        System.out.println("Binary Value after Text to binary conversion is: \n");
        for(int i=0;i<binary_value.length;i++)
        System.out.print("" + binary_value[i]);
        char[] text_message = string_Conversion(binary_value);
        System.out.println();
        System.out.println("\nMessage after binary string to Text conversion is:"  );
        for(int i=0;i<text_message.length;i++)
        System.out.print(text_message[i]);
    
}
  
}