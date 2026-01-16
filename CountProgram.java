package program1;

import java.util.Arrays;

public class CountProgram 
{
	public static void main(String[] args)
	{
	
	int count_space=0;	
	int count_digits=0;
	int count_Alphbates=0;
	String s1="Darshan o @ 665 ";
	char c[]=s1.toCharArray();
	System.out.println(Arrays.toString(c));
	
	for (int i = 0; i < c.length; i++)
	{
		boolean c1=Character.isAlphabetic(c[i]);
		boolean c2=Character.isDigit(c[i]);
		boolean c3=Character.isSpaceChar(c[i]);
		
		
		if (c3==true) 
		{
			count_space++;
			
		}
		
		if (c2==true) 
		{
			count_digits++;
		}
		
		
		if (c1==true) 
		{
			count_Alphbates++;
			
		}
		
	}
	int SpecialChar=s1.length()-(count_space+count_digits+count_Alphbates);
	System.out.println("SpecialChar count is:"+SpecialChar);
	System.out.println("Alphbates Count is :"+count_Alphbates);
	System.out.println("digits count is :"+count_digits);
	System.out.println("space count is:"
			+ ""+count_space);
	}
}
