package ProgramsPractices;

public class Demo6 
{
	final double Pi=3.14;
	int r=45;
	double Area()
	{
		
		
		double AreaofCircle=Pi*r*r;
		System.out.println(AreaofCircle);
		return(AreaofCircle);
	}
	public static void main(String[] args)
	{
		Demo6 g1=new Demo6();
		g1.Area();
		
		//int r=10;
		double AreaofCircle1=g1.Pi*g1.r*g1.r;
		System.out.println(AreaofCircle1);
		
	}

}
