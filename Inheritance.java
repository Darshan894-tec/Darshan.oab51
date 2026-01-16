package ProgramsPractices;
class Parent
{
	static void add()
	{
		System.out.println("add");
	}
}

public class Inheritance extends Parent
{
	static void sub()
	{
		System.out.println("sub");
	}
	public static void main(String[] args)
	{
		add();
		sub();
		
	}
	
}
