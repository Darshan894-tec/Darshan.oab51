package ProgramsPractices;

import java.util.Arrays;

public class Arrayconcept
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[3];
		rollno[0]=1;
		rollno[1]=3;
		rollno[2]=2;
		Arrays.sort(rollno);
		
		for(int i=0; i<=2; i++)
		{
			System.out.println(rollno[i]);
		}
		
		
	}

}
