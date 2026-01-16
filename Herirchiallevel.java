package program1;
class Parent_1
{
	static void LaunchBrowser()
	{
		System.out.println("Launch_browser");
	}
}
  class Browser1 extends Parent_1
{
	static void Chrome()
	{
		System.out.println("Chrome");
	}
}
public class Herirchiallevel extends Browser1
{
 void Firefox()
{
	System.out.println("Firefox");
}
public static void main(String[] args)
{
	Herirchiallevel n=new Herirchiallevel();
	Herirchiallevel.LaunchBrowser();
	Herirchiallevel.Chrome();
	n.Firefox();
	
}
}
