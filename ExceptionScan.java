package ProgramsPractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionScan {

	public static void main(String[] args) throws InputMismatchException
	{
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter the age");
				int  age=input.nextInt();

						if (age > 0) {
		                System.out.println("Valid age: " + age);
		            } else {
		                System.out.println("Age must be positive");
		            }
				
		  } catch (InputMismatchException e)
		{
	            System.out.println("Invalid input! Please enter numbers only.");
	        
		                                              //Second chance for customer to enter the input
		{
			Scanner g=new Scanner(System.in);
			System.out.println("Please enter the age only numbers");
				int  age=g.nextInt();
				System.out.println(age);
			g.close();
			
		}
		
		
	}

	}
}
