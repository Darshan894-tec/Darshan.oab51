package ProgramsPractices;

import java.util.Arrays;

public class Copyonearrytoother 
{
	public static void main(String[] args) 
	{
		int array1[]= {45,55,67,78};
		//First we are checking the length is same or not
		int array2[]=new int[array1.length];
		
		for(int i=0,j=3; i<array1.length;i++,j--)
		{
			array2[j]=array1[i];
		}
		//Arrays.sort(array2); true
		System.out.println(Arrays.equals(array1, array2));
		System.out.println("I/P array1--->"+ Arrays.toString(array1));
		System.out.println("I/P array1--->"+ Arrays.toString(array2));
		
		
	}

}
