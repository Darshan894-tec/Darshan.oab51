package ProgramsPractices;

public class Demo5
{
	final double Pi=3.14;
	void Area(int r)
	{
		
		double AreaofCircle=Pi*r*r;
		System.out.println(AreaofCircle);
	}
	public static void main(String[] args)
	{
		Demo5 h1=new Demo5();
		h1.Area(23);
		
	}

}
