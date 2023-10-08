// implementation of ShowData of packageInterface1
import packageinterface1.MyDate;
import java.util.*;

class Sample implements MyDate
{
    public void showDate()
    {
        Date d = new Date();
        System.out.println(d);
    }
}

class ClassInterface1
{
    public static void main(String args[])
    {
        Sample s = new Sample();
        s.showDate();
    }
}