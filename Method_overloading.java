package program1;

public class Method_overloading 
{
	static void loginfacebook(long Mobilenumber)
	{
		System.out.println(Mobilenumber);
	}
	static void loginfacebook(String Emailid)
	{
		System.out.println(Emailid);
	}
	 void logingmail(long Mobilenumber)
	{
		System.out.println(Mobilenumber);
	}
	 void logingmail(String Emailid)
	{
		System.out.println(Emailid);
	}
	 public static void main(String[] args)
	{
		 loginfacebook(9090909909L);	
		 loginfacebook("darshanksdasda@facebook.com");
		 Method_overloading m1=new Method_overloading();
		 m1.logingmail(9090909909L);;
		 m1.logingmail("darshanksdasda@gmail.com");
	}
}
