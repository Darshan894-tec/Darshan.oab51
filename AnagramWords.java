package program1;
import java.util.Arrays;

public class AnagramWords 
{
	public static void main(String[] args) 
	{
		String s1="cat";
		String s2="act";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not Anagram");
		}
		else 
		{
			System.out.println("lets find out the if they are anagram");
			 char c1[]=s1.toCharArray(); //[c,a,t]
			 char c2[]=s2.toCharArray(); //[a,c,t]
			 Arrays.sort(c1); //[a,c,t]
			 Arrays.sort(c2); //[a,c,t]
			 boolean b1=Arrays.equals(c1,c2);
				System.out.println(b1);
				
				if (b1==true) 
				 {
					 System.out.println("It is Anagram");
					
				} 
				 else 
				 {
					 System.out.println("It is not Anagram");
				}
				 
					
				}
		
		}
		
		
		
		
	

}
