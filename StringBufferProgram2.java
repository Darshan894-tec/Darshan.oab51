package program1;

public class StringBufferProgram2 
{
	public static void main(String[] args) 
	{
		StringBuffer c1 = new StringBuffer("Manish");
		System.out.println(c1.insert(6, "Kumar"));
		System.out.println((c1.insert(6, "Kumar").length()));
	     System.out.println(c1.replace(13, 16, "rai"));
	      System.out.println(c1.delete(11, 16));
	     System.out.println( c1.replace(9, 14, "Darshan")); 
	        System.out.println( c1.subSequence(9, 16));  
	          System.out.println(c1.reverse()); 

	}
	
	
	
	
	
	

}
