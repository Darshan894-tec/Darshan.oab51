package program1;

public class AccessSpecifier1 
{
	public static void name() 
	{
		 
		{
			 int a=10;
			int b=90;
			int result=a+b;
			System.out.println(result);
			
		}
	}
	
	protected static void name1() 
	{
		
	}
	static void name2()
	{
		
	}
	private static void name3() 
	{
		
	}
	public static void main(String[] args)
	{
		name();
		name1();
		name3();
		
	}

}
