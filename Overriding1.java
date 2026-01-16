package ProgramsPractices;
class Google_Auth1
{
	void login(int a)
	{
		System.out.println("Login into gmail useing facbook");
	}
}
class Google_Auth extends Google_Auth1
{
	void login()
	{
		
		System.out.println("Login into gmail useing mobile number");
	}
}

public class Overriding1 extends Google_Auth
{
	void login()
	{
		super.login();
		System.out.println("Login into gmail useing Email_Id");
	}
	public static void main(String[] args) 
	{
		Overriding1 h=new Overriding1();
		h.login();
		h.login(23);
		
		
	}
}
