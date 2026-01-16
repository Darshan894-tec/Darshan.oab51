package program1;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String input="Darshan";
		String Reverse="";
		System.out.println( input.length());
		
		for (int i= input.length()-1; i>=0; i--) 
		{
		char b1=input.charAt(i);
		 Reverse = Reverse + b1;
		}
		System.out.println(Reverse);
	}
	
	

}
