package program1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetProperty 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(34);
		//s1.add(34);// duplicate not allowed
		s1.add(45);
		s1.add(56);
		s1.add(67);
		s1.add(69);
		Iterator<Integer> s2=s1.iterator();
		
		while (s2.hasNext()) 
		{
			System.out.println(s2.next());
			
		}
		
//		while (s2.hasprevious) //has previous is not allowed only for List not for hash set.
//		{
//			
//		}
		
		
	}

}
