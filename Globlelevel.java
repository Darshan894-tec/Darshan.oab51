package ProgramsPractices;

public class Globlelevel 
{
	static  int a=10;
	 double b=3.223;
	static void add()
	{
		
	}
	
	class abcd
	{
	double	result=a+b;
	
	
	}
public static void main(String[] args)
{
	Globlelevel n1=new Globlelevel();
	Globlelevel.abcd n2=n1.new abcd();
	System.out.println(n2.result);
	add();
	
	
	
	
	
	
	
	
	
}
}
