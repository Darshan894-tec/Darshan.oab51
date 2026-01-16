package ProgramsPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysScan
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		 System.out.println("Please enter the size of array1");
		
		 System.out.println("Please enter the size of array2");
	     int age[]=new int[input.nextInt()]; //Declaration of Arrays size
	     int age2[]=new int[input.nextInt()];
	     for (int i = 0; i < age.length; i++) 
	     {
	    	 System.out.println("Please enter the age persionnumber="+i);
	    	 age[i]=input.nextInt();
	    	 age2[i]=input.nextInt();
		}
	     input.close();
	    
	    if(Arrays.equals(age, age2))
	    {
	    	System.out.println("equals");
	    	
	    }
	    else {
			System.out.println("NOt equals");
		}
	}

}
