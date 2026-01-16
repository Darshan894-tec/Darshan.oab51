package program1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProgram2
{
	public static void main(String[] args) 
	{
		Collection<Object> c1=new ArrayList<Object>();
		c1.add(true);
		c1.add("Ram");
		c1.add(63.45);
		c1.add(98349);
		c1.remove("Ram");
		c1.add('A');
		System.out.println(c1);
		
		Collection<Object> c2=new ArrayList<Object>();
		c2.addAll(c1);
		c1.remove("Ram");
		c2.add("Sachin");
		c2.add("Santosh");
		c2.removeAll(c1);
//		c2.addAll(c1);
		boolean d1=c2.contains("Sachin");
	    boolean d2=c2.containsAll(c1);
		System.out.println(c2);
		System.out.println(d1);
		System.out.println(d2);
		
		Collection<Integer> f1=new ArrayList<Integer>();
		f1.add(34);
		f1.add(45);
		f1.add(76);
		f1.add(87);
		f1.remove(45);
		System.out.println(f1);
		
		
	}

}
