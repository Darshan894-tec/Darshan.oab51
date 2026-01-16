package program1;

 abstract class Amazone09 {
	abstract void login(); // abstract method

	abstract void logout(); // abstract method

	void add() // Concrete method
	{

	}

	static void sub() // Concrete method(0 to 100%) to do 100% abstraction we go for interface
	{

	}


public class Overrrding_abstarcAndConcereteMethodes extends Amazone09 {

	public static void main(String[] args) {

	}

	void login() {
		System.out.println("The Real impelemnetion-login");

	}

	void logout() {
		System.out.println("The Real impelemnetion-logout");

	}
}
 }

