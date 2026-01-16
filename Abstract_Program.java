package program1;
class Play
{
	void add()
	{
		int a=90;
		int b=45;
		int result=a+b;
		System.out.println(result);
		}
	static void sub()
	{
		int a=80;
		int b=34;
		int result=a-b;
		System.out.println(result);
	}
}
abstract  class Amazon99 extends Play
{
	abstract void login(); //abstract method
	abstract void logout(); //abstract method
	void add()   //Concrete method
	{
		
	}
	static void sub() //Concrete method
	{
		
	}
}

public class Abstract_Program extends Amazon99
{

public static void main(String[] args) 
{
	
}


void login()
{
	System.out.println("The Real impelemnetion-login");
	
}


void logout() 
{
	System.out.println("The Real impelemnetion-logout");
	
}
}
