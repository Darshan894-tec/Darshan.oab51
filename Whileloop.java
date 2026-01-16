package program1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Whileloop 
{
	public static void main(String[] args)
	{
		Collection<Integer> f1=new ArrayList<Integer>();
		f1.add(43);
		f1.add(45);
		f1.add(55);
		f1.add(100);
		
		Iterator<Integer> i2=f1.iterator();
		
		while (i2.hasNext())
		{
		System.out.println(i2.next());	
		}
		
	}

}
