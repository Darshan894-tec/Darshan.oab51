package program1;


class c
{
	static void add()
	{
		System.out.println("add");
	}
}
class b extends c
{
	static void sub()
	{
		System.out.println("sub");
	}
}

public class Multilevel extends b
{
	static void mul()
	{
		System.out.println("mul");
	}
	public static void main(String[] args) 
	{
		sub();
		mul();
		
	}

}
