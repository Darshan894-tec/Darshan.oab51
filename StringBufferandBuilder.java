package ProgramsPractices;

public class StringBufferandBuilder 
{
	public static void main(String[] args)
	{
		String s1=new String("Darshan");
		s1.concat("onkar");
		System.out.println(s1);
		
		//Builder [Mutable]
		
		StringBuilder s2=new StringBuilder("Darshan");
		s2.append("Onkar");
		System.out.println(s2);
		
		//Buffer [Mutable]: We can change the string
		
		StringBuffer s4=new StringBuffer("Darshan");
		s4.append("omkar");
		System.out.println(s4);
		
		
		
	}

}
