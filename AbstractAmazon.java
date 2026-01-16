package ProgramsPractices;

abstract class Amazon
{
	abstract void login();
	abstract void logout();
}

public class AbstractAmazon extends Amazon
{
	public static void main(String[] args) 
	{
		
	}


	void login() 
	{
		
		System.out.println("Login_Implimentation");
	}

	
	void logout() 
	{
		System.out.println("Logout_Implimentation");
		
	}
	

}
