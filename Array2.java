package program1;

public class Array2 
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		try {
			String name1[]=new String[3];
			 name1[0]="Darshan";
			 name1[1]="abcd";
			 name1[2]="dffd";
			 name1[3]="sds";
			 System.out.println(name1[0]);
			 System.out.println(name1[1]);
			 System.out.println(name1[2]);
			 System.out.println(name1[3]);
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			String name1[]=new String[3];
			 name1[0]="Darshan";
			 name1[1]="abcd";
			 name1[2]="dffd";
			 System.out.println(name1[0]);
			 System.out.println(name1[1]);
			 System.out.println(name1[2]);
		}
		
		
		 
	}

}
