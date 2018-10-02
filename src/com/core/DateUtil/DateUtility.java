package com.core.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	public static void main(String[] args) throws ParseException {
		String date ="1993-05-13 12:53:00";
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateformate=format.parse(date);
		System.out.println(dateformate.getTime());
	}

}
