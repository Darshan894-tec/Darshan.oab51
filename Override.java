package program1;
  class Google_Auth
{
	 void Override() 
	{
	System.out.println("Login to amazon with ph number");	
	}
}

public class Override extends Google_Auth
{

	void Override()
	{
		super.Override();
		System.out.println("Login to amazon with Email id");
	}


	public static void main(String[] args)
	{
		Override g1=new Override();
		g1.Override();

	}

}
