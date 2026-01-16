package program1;

import java.util.Arrays;


public class ArrayProgram
{
	public static void main(String[] args) 
	{
		int age[]=new int[3];
		 age[0]=45;
		 age[1]=35;
		 age[2]=65;
		int sum= 0;
		double Average=0;
		Arrays.sort(age);
		//System.out.println(Arrays.toString(age));
		
		for (int i = 0; i < age.length; i++)
		{
			sum= sum + age[i];
			Average=sum/age.length;
			
		}
		
		System.out.println(Average);
	}

}
