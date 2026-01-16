package program1;
import java.util.AbstractList;
import java.util.ArrayList;

public class CollectionProgram1 
{
	void add()
	{
		
	}

  public static void main(String[] args) 
  {
	  ArrayList a1=new ArrayList();
	  //Upcasting
	  Object p1=new CollectionProgram1() ;
	  //now converted child class into super class
	   System.out.println(p1.equals(p1)); 
	  
	
}
}
