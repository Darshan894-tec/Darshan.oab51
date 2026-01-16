package ProgramsPractices;

class addition1 {
	static void add() {
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);

	}

	void sub() {

		int a = 10;
		int b = 20;
		int result = a - b;
		System.out.println(result);
	}
}

class Multiplay {
	void mul() {
		addition1 b1=new addition1();
         b1.sub();
         addition1.add();
         int a = 10;
		int b = 20;
		int result = a * b;
		System.out.println(result);
	}

	static void div() {
         addition1.add();
         addition1 b2=new addition1();
        b2.sub();
		int a = 10;
		int b = 20;
		int result = a / b;
		System.out.println(result);
	}

public class NonStaticbtwenclass 
{
	public static void main(String[] args) 
	{
		addition1.add();
		addition1 g3=new addition1();
		g3.sub(); 
		 Multiplay b1= new  Multiplay();
		 b1.mul();

		
	}

}
}
