package ProgramsPractices;

public class Finallyblock 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a=1/1;
			System.out.println("a="+ a);
			
		} catch (ArithmeticException e)
		{
			System.out.println("Catch block");
			
		}
		finally 
		{
			System.out.println("finally block always excute");
		}
		
	}

}
