package program1;
class Amazon2
{
	 Amazon2()
	{
		System.out.println("This is Parent contructor2");
	}
}
class Amazon extends Amazon2
{
	 Amazon(int a) //Amazon(int a)
	{
		System.out.println("This is Parent contructor");
	}
}

public class Amazon1 extends Amazon
{
	
	Amazon1()
	{
		super(10);
		System.out.println("This is Child contructor");
	}
	public static void main(String[] args) 
	{
		//new Amazon1();
		new Amazon(10);
	}
}
