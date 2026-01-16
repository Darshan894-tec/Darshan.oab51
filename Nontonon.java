package ProgramsPractices;
class Display
{
	String name= "Darshan";
	void names()
	{
		System.out.println("Name"+" "+ name);
	}
	void name2()
	{
		names();
	}
	
}
class Display1
{
	void name3()
	{
		//Display1.name2();
	}
}
public class Nontonon 
{
	public static void main(String[] args) 
	{
		Display g1=new Display();
		g1.name2();
		
	}

}
