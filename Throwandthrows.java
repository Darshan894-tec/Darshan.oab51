package ProgramsPractices;

import java.util.InputMismatchException;

public class Throwandthrows 
{
	public static void main(String[] args) throws InputMismatchException
	{
		if (4>3) 
		{
			throw new InputMismatchException();
		} else 
		{
			System.out.println("No Exception");

		}
	}

}
