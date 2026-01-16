package ProgramsPractices;

public class Parameteres 
{
	static void add(int a , int b) 
	{
	int	Result=a+b;
	System.out.println(Result);
	}
	
	void sub(int a, int b)
	{
		int Result=a-b;
		System.out.println(Result);
	}
	
	public static void main(String[] args)
	{
		add(10,20);
		Parameteres b1=new Parameteres();
		b1.sub(24, 9);
		
	}

}
