package program1;

public class SubString 
{
	public static void main(String[] args) 
	{
		String input="School name is abc";
		   String d1=input.substring(7);
		   System.out.println(d1);
		   String d2=input.substring(7, 11);
		   System.out.println(d2);
		   String d3=input.toString();
		   System.out.println(d3.subSequence(7, 15));
		
	}

}
