package ProgramsPractices;


public class ReversetheString 
{
	public static void main(String[] args)
	{
		String input="Mango";
		String reverse="";
		
		for (int i = 4; i >= args.length; i--)
		{
			char d1=input.charAt(i);
			reverse=reverse+d1;
			
			
		}
		System.out.println(reverse);
	}

}
