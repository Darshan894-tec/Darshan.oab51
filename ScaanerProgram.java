package ProgramsPractices;

import java.util.Scanner;

public class ScaanerProgram
{
	public static void main(String[] args) 
	{
		Scanner n1=new Scanner(System.in);
		System.out.println("Please Enter value of a");
		int a=n1.nextInt();
		System.out.println("Please Enter value of b");
		int b=n1.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
        n1.close();
	}

}
