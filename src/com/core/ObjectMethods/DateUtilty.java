package com.core.ObjectMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilty {
	public static void main(String[] args) throws ParseException {
		String beginDate="25JUL2017";
		Date begin_Date=getDate(beginDate);
		System.out.println("begin_Date::"+begin_Date);
		String endDate="27JUL2017";
		Date end_Date=getDate(endDate);
		Date newDate=getDate(new Date());
		System.out.println("newDate::"+newDate);
		String datecompleted="26JUL2017";
		Date date_completed=getDate(datecompleted);
		System.out.println("date_completed::"+date_completed);
		System.out.println(begin_Date.compareTo(newDate));
		if(date_completed.compareTo(begin_Date)>=0 && date_completed.compareTo(end_Date)<=0){
           System.out.println("phani true");
     }
		if(begin_Date.compareTo(date_completed)<=0 && end_Date.compareTo(date_completed)>=0){
			System.out.println("chandu is ---true");
		}
		else{
			System.out.println("fasle");
		}
		System.out.println();
		;
		
		
	}
	private static Date getDate(Date indate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyy");
        return sdf.parse(sdf.format(indate));
   }
	
	private static Date getDate(String indate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyy");
        return sdf.parse(indate);
 }

}
