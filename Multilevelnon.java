package program1;
class Addition
{
	int a=10;
	int b=20;
	void add()
	{
		int result=a+b;
		System.out.println(result);
	}
}
class Subtraction extends Addition
{
	void sub()
	{
		int result1=a-b;
		System.out.println(result1);
	}
}
public class Multilevelnon extends Subtraction
{
	void mul()
	{
		int result2=a*b;
		System.out.println(result2);
	}
	public static void main(String[] args) 
	{
		Multilevelnon n1=new Multilevelnon();
		n1.mul();
		n1.add();
		n1.sub();
		
	}

}
