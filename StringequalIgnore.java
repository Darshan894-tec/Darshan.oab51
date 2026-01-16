package ProgramsPractices;

public class StringequalIgnore 
{
	public static void main(String[] args) 
	{
	  String input="school";
	  boolean b1=input.equals("School");
	  System.out.println(b1);
	  boolean b2=input.equalsIgnoreCase("SCHOOL");
	  System.out.println(b2);
		
	}

}
