package ProgramsPractices;

import java.util.Arrays;

public class AnagramProblem 
{
	public static void main(String[] args) 
	{
		String s1="cat";
		String s2="Act";
		
		if (s1.length()!=s2.length())
		{
			System.out.println("It is not Anagram");
		}
		else {
			System.out.println("Lets find out if they are Anagram");
		}
		char input1[]=s1.toCharArray();
		char input2[]=s2.toCharArray();
		Arrays.sort(input1);
		Arrays.sort(input2);
		
		if(Arrays.equals(input1, input2))
		{
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is not Anagram");
		}
		
		
	}

}
