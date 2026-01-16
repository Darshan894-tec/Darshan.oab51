package program1;

import java.util.Scanner;

public class ScannerClass5 
{
	public static void main(String[] args) 
	{
		Scanner d1=new Scanner(System.in);
		System.out.println("Please enter String");
		String name1 =d1.next();
		System.out.println(name1);
		System.out.println("Please enter rollno");
		int Rollno=d1.nextInt();
		System.out.println(Rollno);
		System.out.println("Please enter String");
		String name2=d1.next();
		System.out.println(name1.equalsIgnoreCase(name2));
		d1.close();
	}

}

