package program1;

public class Amazon5 
{
	Amazon5()
	{
		this(33 ,"Aurna");
		System.out.println("1");
	}

	Amazon5(int a ,String c)
	{
		this("Darshan");
		System.out.println("Age is:"+ a+" & " +"name:"+  c);
	}
                                
	Amazon5(String b)
	{
		
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		new Amazon5();
	}
}
