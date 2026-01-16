package program1;
class Amazon22
{
	public Amazon22()
	{
		System.out.println("This is Parent_Constructor1");
}
}
class Amazon23 extends Amazon22
{
	 Amazon23() 
	{
		 
		System.out.println("This is Parent_Constructor");
	}
}

public class SuperCalling extends Amazon23
{
	public SuperCalling()
	{
		super();
		System.out.println("This is Child_Constructor");
	}
	
	public static void main(String[] args) 
	{
		new SuperCalling();
		
	}

}
