package ProgramsPractices;

class Mainclass2 {
	final static double pi = 3.14;

	static void CircleArea() {
		int r = 10;
		double result = pi * r * r;
		System.out.println(result);
	}

	class Mainclass3 {

		static void CircleArea1() 
		{
			CircleArea();

			int r = 10;
			double result1 = pi * r * r;
			System.out.println(result1);
		}

		public class Static {

			public static void main(String[] args) 
			{
				Mainclass2.CircleArea();
				CircleArea();

			}

		}

	}

}
