package com.subbu.Demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Date d= new Date();
    	
    	Calendar cal = Calendar.getInstance();
    	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
    	System.out.println(sdf.format(d));
     	System.out.println(sdf.format(cal.getTime()));
    	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
    	System.out.println(cal.get(Calendar.MINUTE));
    	System.out.println(cal.get(Calendar.ERA));
    }
}
