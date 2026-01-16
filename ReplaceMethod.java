package program1;

public class ReplaceMethod 
{
	public static void main(String[] args) 
	{
		String a1="School name is sbjhons 143";
		System.out.println(a1.replace('b', 't'));
		String a2=a1.replace("sbjhons", "stjhons");
		System.out.println(a2);
	    String a3=a1.replaceAll("[A-Z]","");
	    System.out.println(a3);
	    String a4=a1.replaceAll("[a-z]", "");
	    System.out.println(a4);
	    String a5=a1.replaceAll("[0-9]", "");
	    System.out.println(a5);
		
	}

}
