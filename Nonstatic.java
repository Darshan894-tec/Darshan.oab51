package ProgramsPractices;
 class addittion
{
	static void add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
	
	}
	 void sub()
	{
		add();
		int a=10;
		int b=20;
		int result=a-b;
		System.out.println(result);
	}
	void mul()
	{
		sub();
		int a=10;
		int b=20;
		int result=a*b;
		System.out.println(result);
	}
	static void div()
	{
		addittion g2=new addittion();
		g2.mul();
		int a=10;
		int b=20;
		int result=a/b;
		System.out.println(result);
	
	}
}
 

public class Nonstatic 
{
	public static void main(String[] args) 
	{
	addittion b1=new addittion();
	addittion.add();
	b1.sub();
	b1.mul();
	
	}


}
