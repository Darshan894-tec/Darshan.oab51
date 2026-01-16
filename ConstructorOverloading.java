package ProgramsPractices;

public class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("This is Constructor1");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("This is Constructor2");
	}
public static void main(String[] args)
{
    new ConstructorOverloading();
	new ConstructorOverloading(2);
}
}
