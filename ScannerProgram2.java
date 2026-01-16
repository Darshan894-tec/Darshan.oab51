package ProgramsPractices;

import java.util.Scanner;

public class ScannerProgram2
{
	static void add(int a, int b)
	{
		int resualt=a+b;
		System.out.println("add="+resualt);
	}
	static void sub(int a, int b)
	{
		int resualt=a-b;
		System.out.println("Sub="+resualt);
	}
	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Please enter value of a");
	    int a	=a1.nextInt();
	    System.out.println("Please enter value of b");
	    int b	=a1.nextInt();
	    add(a, b);
	    sub(a, b);
	    a1.close();
	}

}
