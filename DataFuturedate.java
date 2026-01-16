package program1;

import java.util.Date;

public class DataFuturedate 
{
	public static void main(String[] args)
	{
		Date d1= new Date();
		System.out.println(d1.getTime());
		System.out.println(d1);
		String format1=d1.toString();
		String dateString=format1.substring(8, 10);
		System.out.println(dateString);
		String MonthFormat= format1.substring(4, 7);
		System.out.println(MonthFormat);
		String yearFormat=format1.substring(format1.length()-1);
		System.out.println(yearFormat);
		String format2= dateString.concat("-").concat("-").concat(MonthFormat).concat("-").concat(yearFormat);
		System.out.println(format2);
		
		
	}

}
