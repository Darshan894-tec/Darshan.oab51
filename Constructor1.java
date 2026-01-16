package ProgramsPractices;



public class Constructor1 
{
	int Id;
	String name;
	Constructor1(int Id, String name)
	{
		this.Id=Id;
		this.name=name;
		
	}

	
	public static void main(String[] args) 
	{
		Constructor1 n1=new Constructor1(101,"Darshan");
		System.out.println(n1.Id);
		System.out.println(n1.name);
		
	}

}
