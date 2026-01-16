package program1;

public class ThisStatement 
{
	ThisStatement()
	{
		this("Hello");
		System.out.println("Costrutcor_1");
	}
	
	ThisStatement (String a)
	{
		this(10);
		System.out.println("Costrutcor_2");
	}
	ThisStatement( int u) 
	{
		System.out.println("Costrutcor_3");
	}
	public static void main(String[] args) 
	{
		new ThisStatement();
		
	}
}
