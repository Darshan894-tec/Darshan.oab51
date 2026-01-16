package program1;
class Parent
{
	void add()
	{
		System.out.println("add");
	}
}
public class Inheritancenon extends Parent
{
	void sub()
	{
		System.out.println("sub");
	}
	public static void main(String[] args) 
	{
		Inheritancenon n1=new Inheritancenon();
		n1.add();
		n1.sub();
		
		
	}

}
