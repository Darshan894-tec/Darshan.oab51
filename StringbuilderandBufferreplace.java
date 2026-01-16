package ProgramsPractices;

public class StringbuilderandBufferreplace 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s1.insert(6, "Kumar"));
		System.out.println(s1.replace(13,19, "rai"));
		System.out.println(s1.delete(13, 19));
		System.out.println(s1.substring(13));
		System.out.println(s1.reverse());
		
		StringBuilder n1=new StringBuilder("Manish kumar Tiwari");
		System.out.println(n1.delete(13, 19));
		
	}

}
