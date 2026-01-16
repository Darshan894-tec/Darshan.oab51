package ProgramsPractices;

import java.util.Arrays;

public class Tocountaphabets {
    public static void main(String[] args) {

        int count_of_alphabets = 0;
        int count_of_digits = 0;
        int   Count_of_Space=0;
        String s1 = "KV no @665";
        char[] c1 = s1.toCharArray();

        System.out.println(Arrays.toString(c1));

        for (int i = 0; i < c1.length; i++) {

            if (Character.isAlphabetic(c1[i])) {
                count_of_alphabets++;
            } 
            else if (Character.isDigit(c1[i])) {
                count_of_digits++;
            }
            else if (Character.isSpaceChar(c1[i])==true) //or (c1[i] == ' ')
            {
            	Count_of_Space++;
			
			}
          
        }
        int Count_of_Special=s1.length()-(count_of_alphabets+count_of_digits+Count_of_Space);
        System.out.println("Special_char="+ Count_of_Special);
        
         System.out.println("Space_count="+ Count_of_Space);
        System.out.println("Alphabets count = " + count_of_alphabets);
        System.out.println("Digits count = " + count_of_digits);
    }
}
