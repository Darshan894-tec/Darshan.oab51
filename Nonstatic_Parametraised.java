package program1;

public class Nonstatic_Parametraised 
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	 void mul(int a, String name, boolean m, char d, double s)
	{
		System.out.println("a = " + a + ", name = " + name + 
                ", m = " + m + ", d = " + d + ", s = " + s);
	}
public static void main(String[] args) 
{
	Nonstatic_Parametraised nonstatic_Parametraised = new Nonstatic_Parametraised();
	add(10, 20);
	nonstatic_Parametraised.mul(99,"Darshan",true,'O',3.134);
	
}

}
