package program1;
class Method_Overloading3
{
	void login()
	{
		System.out.println("1");
	}
}

public class Method_Overloading2 extends Method_Overloading3
{
	void login()
	{
		System.out.println("2");
		super.login();
	}
	

	public static void main(String[] args)
	{
		Method_Overloading2 g1=new Method_Overloading2();
		g1.login();
		
	}

}
