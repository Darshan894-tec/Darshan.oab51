package ProgramsPractices;

public class Palindrome
{
	public static void main(String[] args) 
	{
		String input="redder";
		String reverse="";
		
		for(int i=input.length()-1; i>=0;i--)
		{
			char d1=input.charAt(i);
			reverse=reverse+d1;
		}
		System.out.println(reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("Yes it is palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		
	}

}
