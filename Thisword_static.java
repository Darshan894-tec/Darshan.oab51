package program1;

public class Thisword_static
{
   static String name; 
   static double salary;
   static int age;
 
  void Empoly_details(String name, double salary,int age) 
  {
	  Thisword_static.name = name;
	  Thisword_static.salary = salary;
	  Thisword_static.age = age;

      System.out.println("Hi My name is : " + name);
      System.out.println("Hi My salary is : " + salary);
      System.out.println("Hi My age is : " + age);
  }

  public static void main(String[] args) 
  {
      Thisword_static g1 = new Thisword_static();
      g1.Empoly_details("Raj", 34000.0, 25);

      System.out.println(name);
      System.out.println(salary);
      System.out.println(age);
  }
}


