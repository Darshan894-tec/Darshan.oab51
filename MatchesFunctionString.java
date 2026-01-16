package ProgramsPractices;

public class MatchesFunctionString
{
	public static void main(String[] args)
	{
		String a="allan";
		boolean a1=a.matches(".....");
		System.out.println(a1);
	
		//Check String end with 'n'
		
		boolean b2=a.matches("(.)*n");
		System.out.println(b2);
		
		boolean b3=a.matches("a(.)*");
		System.out.println(b3);
		
		//Check if the given String end with man
		String b="Spiderman";
		
		System.out.println(b.matches("(.)*man(.)*"));
		
		String s5="Aditi";
		System.out.print(s5.repeat(3));
		
		
		
	}

}
