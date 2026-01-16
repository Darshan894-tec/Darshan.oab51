package program1;
class addition
{
	int a=10;
	int b=20;
	void add()
	{
		int result=a+b;
		System.out.println(result);
		
	}
}
class subtraction extends addition
{
	static void sub()
	{
		subtraction j=new subtraction();
		int result1=j.a-j.b;
		System.out.println(result1);
		
	}
	
	
}

public class Multilevelstaticnon extends subtraction
{
	void mul()
	{
		
		int result3=a*b;
		System.out.println(result3);
	}
	public static void main(String[] args) 
	{
		Multilevelstaticnon n4=new Multilevelstaticnon();
		n4.add();
		subtraction.sub();
		n4.mul();
		
	}

}
