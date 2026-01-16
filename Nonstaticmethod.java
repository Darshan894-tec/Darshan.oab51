package program1;

public class Nonstaticmethod
{
	static void div()
	{
		int a=10;
		int b=2;
		System.out.println(a/b);
	}
	void addition()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void subtraction()
	{
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	
	void mul()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		Nonstaticmethod result=new Nonstaticmethod();
		 div();
		result.addition();
		result.subtraction();
		result.mul();
		
	}

}
