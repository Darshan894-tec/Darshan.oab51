package ProgramsPractices;

public class Stringconcat
{
	public static void main(String[] args) throws InterruptedException
	{
		String input="Darshan";
		Thread.sleep(3000);
		System.out.println(input.concat("Onkar"));
		String i2="are";
		String i1="Students";
		String i3="good";
		System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
		boolean a=input.contains(i3);
		System.out.println(a);
		
	}

}
