package program1;
class Flipkart1
{
	Flipkart1(int a)
	{
		System.out.println("This is super contructor1");
	}
}

class Flipkart2 extends Flipkart1
{
   Flipkart2(int a, int b)

	{
	   super(10);
		System.out.println("This is super contructor");
	}
}

public class Flipkart extends Flipkart2
{
	Flipkart()
	{
		super(10,20);
		System.out.println("This is sub contructor ");
		
	}
	public static void main(String[] args) 
	{
	new Flipkart(); 
	}

}
