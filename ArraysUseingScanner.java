package program1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUseingScanner
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the value of size of i");
		  int age[] =new int[s1.nextInt()];
		  System.out.println("please enter the value of size of j");
		  int age2[] =new int[s1.nextInt()];
		  
		  for (int i = 0, j=age2.length-1; i <age.length; i++,j--) 
		  {
			  //System.out.println("Please enter value of i");
			  age[i]=s1.nextInt();
			//System.out.println(age[i]);
			 age2[j]=age[i];
			
		}
		  System.out.println("Input array"+ Arrays.toString(age) );
			 System.out.println("rverse array"+ Arrays.toString(age2) );
		s1.close();
		
	}

}
