package program1;

import java.util.Arrays;

public class Anagram2 
{
	public static void main(String[] args)
	{
		
		String c1[]= {"Listen" , "Silent"};
		
		if (c1[0].length()!=c1[1].length())
		{
			System.out.println("They are not Anagram");
			
		}
		else 
		{
			char s1[]=c1[0].toCharArray();
			char s2[]=c1[1].toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			boolean b2=Arrays.equals(s1, s2);
			
			if (b2==true) 
			{
				System.out.println("It is Anagram");
			}
			else 
			{
				System.out.println("It is not Anagram");
			}
			
			
		}
		
	}

}
