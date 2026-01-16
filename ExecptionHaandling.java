package ProgramsPractices;

public class ExecptionHaandling 
{
	public static void main(String[] args)
	{
		try {
			double a=1/0;
			System.out.println(a);
			
		} catch (ArithmeticException a) 
		{
		System.out.println("Exception is handled");	
		}
		
		
	}

}
