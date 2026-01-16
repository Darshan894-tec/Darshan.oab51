package program1;
class Parent1
{
	void add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
	}
}

public class Nonstatic_single_level extends Parent1
{
	void sub()
	{
		int f=20;
		int g=70;
		int result=f-g;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		Nonstatic_single_level r1=new Nonstatic_single_level();
		r1.sub();
		r1.add();
		
	}

}
