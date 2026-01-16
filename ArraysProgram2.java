package program1;

public class ArraysProgram2
{
	public static void main(String[] args) 
	{
		int average[]= {44,45,56,57};
		double sum=0;
		double Avg=0;
		System.out.println(average.length);
		int average2[]= new int[average.length];
		for (int i = 0 ; i < average.length; i++) 
		{
			sum=sum+average[i];
			Avg=sum/average.length;
			 
			 
		}
		System.out.println(Avg);
		
		
		
	}

}
