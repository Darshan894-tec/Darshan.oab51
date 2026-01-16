package program1;

public class Thisword 
{
  String name; 
  double salary;
  int age;
 
  void Empoly_details(String name, double salary,int age) 
  {
//      this.name = name;
//      this.salary = salary;
//      this.age = age;

      System.out.println("Hi My name is : " + name);
      System.out.println("Hi My salary is : " + salary);
      System.out.println("Hi My age is : " + age);
  }

  public static void main(String[] args) 
  {
      Thisword g1 = new Thisword();
      g1.Empoly_details("Raj", 34000.0, 25);

      System.out.println(g1.name);
      System.out.println(g1.salary);
      System.out.println(g1.age);
  }
}
