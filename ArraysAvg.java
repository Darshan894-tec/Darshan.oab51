package ProgramsPractices;

public class ArraysAvg
{

public static void main(String[] args)
{
	int sum=0;
	double Avg=0;
	int []number=new int[4];
	number[0]=12;
	number[1]=34;
	number[2]=45;
	number[3]=55;
	
	
	for(int i=0; i<=number.length-1;i++)
	{
		 sum = sum + number[i];
		
	}
	     Avg=sum/number.length;
	     System.out.println(Avg);
	     System.out.println(sum);
	
	
}
}
