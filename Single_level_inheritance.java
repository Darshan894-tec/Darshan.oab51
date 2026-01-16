package program1;
class Praent
{
	static void add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
		
	}
}
public class Single_level_inheritance extends Praent
{
    static void sub()
    {
    	int c=30;
    	int d=10;
    	int result=c-d;
    	System.out.println(result);
    	
    }
  public static void main(String[] args) 
  {
	sub();
	add();
}
}
