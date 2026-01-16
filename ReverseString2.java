package program1;

import java.util.Iterator;

class ReverseString2 
{
	public static void main(String[] args)
	{
		String name= "arora";
		String reverseName="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char c1=name.charAt(i);
			reverseName=reverseName+c1;
			
		}
		System.out.println(reverseName);
		System.out.println(name.contentEquals(reverseName));
		
	}

}
