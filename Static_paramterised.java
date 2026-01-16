package program1;

public class Static_paramterised 
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void mul(int a, String name, boolean m, char d, double s)
	{
		System.out.println("a = " + a + ", name = " + name + 
                ", m = " + m + ", d = " + d + ", s = " + s);
	}
public static void main(String[] args) 
{
	add(10,20);
	mul(99,"Darshan",true,'O',3.134);
	
}
}
