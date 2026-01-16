package ProgramsPractices;

import java.util.Date;

public class FeatureDate
{
	public static void main(String[] args)
	{
		Date d1= new Date(); 
		System.out.println(d1.getTime()); //Epcho time 
		System.out.println(d1);            // Human understandable time
		
		String formate1=d1.toString();
		String date=formate1.substring(8, 10);
		String month=formate1.substring(4, 7);
		String year=formate1.substring(formate1.length()-4);
		System.out.println(date+"/"+month+"/"+year);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*4));
		System.out.println(d3);
		
		
		
	}

}
