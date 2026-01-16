package ProgramsPractices;

public class GlobleVariables
{
	double pi=3.14;
	static int r=10;

	public static void main(String[] args) 
	{
		GlobleVariables b1=new GlobleVariables();
		double area=b1.pi*r*r;
		System.out.println(area);
		
	}
}
