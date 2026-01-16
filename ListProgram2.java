package program1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListProgram2
{
	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Ram");
		l1.add("Allan");
		l1.add("Pallavi");
		
		
		System.out.println(l1);
		
		List<String> l2=new ArrayList<String>();
		l2.add("Divya");
		l2.add("Chaitra");
		l2.addAll(l1);
		//System.out.println(l2);
		l2.remove("Ram");
//		boolean g1=l2.addAll(l1);
    	boolean	h1=l2.containsAll(l1);
    	Collections.sort(l2);
    	System.out.println(l2);
    	
    	System.out.println("Forward iteration"); 
    	
    	ListIterator<String> b1 = l2.listIterator();                            
    	
    	while (b1.hasNext())
    	{
			System.out.println(b1.next());
		}
    	
    	System.out.println("Backward iteration");
    	
    	while (b1.hasPrevious())
    	{
			System.out.println(b1.previous());
		}
    	
		
		
       	
		
	    
	    
	   
		
		
		
	}

}
