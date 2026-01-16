package ProgramsPractices;

public class ThisKeyword 
{
	String name;
	double salary;
	int age;
	
	void Student_details(String name, double salary, int age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
		
		System.out.println("Hi My name is"+ name);
		System.out.println("Hi This my salary is"+ salary);
		System.out.println("Hi This my age"+ age);
	}
	public static void main(String[] args) 
	{
	ThisKeyword h=new ThisKeyword();
	h.Student_details("Darshan", 100000, 34);
	System.out.println(h.name);
	System.out.println(h.salary);
	System.out.println(h.age);
		
	}

}
