package ProgramsPractices;

public class ConstructorOverl
{
	 ConstructorOverl()
	 {
		 System.out.println("Constructor 1");
	 }
	 ConstructorOverl(int a)
	 {
		 System.out.println(a);
	 }
	 
	 public static void main(String[] args) 
	 {
		
		 new ConstructorOverl();
		 new ConstructorOverl(10);
		 
		
	}

}
