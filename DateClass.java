package program1;

import java.util.Date;

public class DateClass 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		System.out.println(d1);
		String Date=d1.toString(); 
		System.out.println(Date);
		System.out.println(Date.length());
		System.out.println(Date.substring(8, 10));
		System.out.println( Date.subSequence(4, 7));
		System.out.println(Date.substring(Date.length()-4));
		
		//future and past date
		
		Date futureDate=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(futureDate);
		
		Date pastDate=new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println(pastDate);
	}

}
