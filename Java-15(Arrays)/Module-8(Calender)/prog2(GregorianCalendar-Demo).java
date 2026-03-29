import java.util.GregorianCalendar;
class prog2
{
    public static void main(String[] args)
    {
		String[]  a = {"January" , "Feb" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
		String[]  b = {"" , "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};
		GregorianCalendar  gc = new  GregorianCalendar();
		int date  = gc.get(GregorianCalendar.DATE);
        int month = gc.get(GregorianCalendar.MONTH);
        int year  = gc.get(GregorianCalendar.YEAR);
		System.out.println("Current  date : " + date + " - " + a[month] + " - " + year); // How  to  print  current  date  in  the  form  of  5 - Jan - 2026
        int hour   = gc.get(GregorianCalendar.HOUR);
        int minute = gc.get(GregorianCalendar.MINUTE);
        int second = gc.get(GregorianCalendar.SECOND);
		System.out.println("Current  time : " + hour + " : " + minute + " : " + second); // How  to  print  current  time  in  the  form  of  8 : 34 : 45
        int day = gc.get(GregorianCalendar.DAY_OF_WEEK);
		System.out.println("Day  of  the  week : " + b[day]); //  How  to  print  day  of  the  week  i.e.  Monday
    }
}
