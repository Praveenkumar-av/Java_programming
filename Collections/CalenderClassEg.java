// Calender Class
// It helps in knowing the date and time.

import java.util.*;
class CalenderClassEg
{
    public static void main(String args[])
    {
        Calendar cl = Calendar.getInstance();

        // display date
        System.out.print("Current date :");
        int dd = cl.get(Calendar.DATE);
        int mm = cl.get(Calendar.MONTH);
        ++mm;
        int yy = cl.get(Calendar.YEAR);

        System.out.println(dd+"-"+mm+"-"+yy);

        // display time
        System.out.print("Current time :");
        int h = cl.get(Calendar.HOUR);
        int m = cl.get(Calendar.MINUTE);
        int s = cl.get(Calendar.SECOND);
        System.out.println(h+":"+m+":"+s);
    }
}