import java.util.Arrays;



/**
 * Description: Code for Text to Binary String Conversion and vice versa 
 * @author Ananta Bhatt
 *
 */
public class MDES {
	//Initialising Values
	  public static int padding_value;
    public static String plaintext="This program code is an example of MDES."
    		+"This is part of my second assignment for Cryptography course,(Winter term)."
    		+"It is an interesting course. Do i love it? Yes,I love it.";
    public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' ,' ','.',',','?','(',')'};
    public static char elements[]  = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    
    //Converting String to Binary
    public static int[] binaryConversion(String plainText)
    {
        int i=0;
        int[] a=new int[plainText.length()];
        //Mapping correspondence elements with the plaintext and alphabets
        for (i = 0; i < plainText.length(); i++)
        {
                for (int j = 0; j < 32; j++)
                {
                    if (p[j] == plainText.charAt(i))
                    {
                        a[i] = elements[j];
                        break;
                    }
                }
        }
        //System.out.println(a[1]);
        return a;
            
    }
    
    //Converting binary to bits
    public static String bitsConversion(int[] a)
    {
        String bit_value="";
        int i=0;
        while(i<a.length)
        {
        	//Convert in String
            String string_value= Integer.toBinaryString(a[i]);
            while (string_value.length() < 5) 
            	string_value = "0" + string_value;
            bit_value+=string_value;
            i++;
        }
        return bit_value;
    }
    
    //Padding function
    public static String padding(String binary_value)
    {
    	padding_value=0;
    	 //Padding 
        while(binary_value.length()%5!=0)
        {
        	binary_value+='0';
        	padding_value++;
        }
       return binary_value;
    }
    
    
  //Convert binary to String
    public static String binaryToStringConversion(String binary_value)
    {
        int x;
        int count=0;
        
        //Call for padding function
       String bin_value=padding(binary_value);
       
       //Diving binary_value in 5 substring length
        int[] bin_substring=new int[bin_value.length()/5];
        int i=0;
        //Partitioning in 5 substrings
        while(i<bin_value.length())
        {
            x= Integer.parseInt(bin_value.substring(i, i+5), 2);
            bin_substring[count]=x;
            count++;
            i=i+5;
        }
      
        String string_text="";
       i=0;
       char[] a=new char[bin_substring.length];

       //Correspondence to the element Value
        while(i<bin_substring.length)
        {
        	
        	for(int j=0;j<32;j++)
        	{
        		 if(bin_substring[i]==elements[j])
        		 {
        			 a[i]=p[j];
        			 
        		 } 
        	}	
           i++;
         }
       for(int j=0;j<bin_substring.length;j++)
       {
    	   string_text+=a[j];
       }
        return string_text;
    }
    
    
    public static void main(String args[])
    {
    	String plaintext_value= plaintext.toLowerCase();
        System.out.println("The Original Plaintext message is: \n" + plaintext);
        System.out.println();
        //String To Binary Conversion
        String binary_value=bitsConversion(binaryConversion(plaintext_value));
		        System.out.println("Binary Value of the Plaintext is:\n" +binary_value);
        System.out.println();
        //Binary to String conversion
      String string_message =binaryToStringConversion(binary_value);
        System.out.println("Original Message after Binary to String Conversion:\n" + string_message);
}}