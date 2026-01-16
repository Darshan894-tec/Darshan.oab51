package ProgramsPractices;

class addition
{
	void add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
	}
}
class subtraction
{
	void sub() 
	{
		int a=10;
		int b=20;
		int result=a-b;
		System.out.println(result);
		
	}

}

public class Nonstaticbtwnclass 
{
	public static void main(String[] args) 
	{
		addition b1=new addition();
		subtraction b2=new subtraction();
		b1.add();
		b2.sub();
		
		
		
		
		
	}

}
