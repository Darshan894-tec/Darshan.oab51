package program1;

public class MatchesFunctions {
	public static void main(String[] args) {
		String a = "Allan";
		boolean a1 = a.matches(".....");
		System.out.println(a1);
		boolean a2 = a.matches("(.)*n");
		System.err.println(a2);
		boolean a3 = a.matches("A(.)*");
		System.out.println(a3);
		String a5="spidermanstar";
		     boolean a6=a5.matches("(.)*man(.)*");
		     System.out.println(a6);

	}

}
