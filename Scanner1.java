package program1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner1 
{
	public static void main(String[] args) 
	{
		try {
			Scanner s1=new Scanner(System.in);
		    String	name=s1.next();
		    String d1=s1.next(name);  
		   System.out.println(d1);
			
		} catch (InputMismatchException e) 
		{
			Scanner s1=new Scanner(System.in);
		    String	name=s1.next();
		    String d1=s1.next(name);  
		   System.out.println(name);
		   System.out.println(d1);
		}
		
	}

	
}
