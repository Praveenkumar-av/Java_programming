// Program to call main() method of class1 from MainFromAnotherMain. So we give the name of file as MainFromAnotherMain

class class1
{   
    public static void main(String args[])
    {
        for(String s : args)
        {
            System.out.println(s);
        }
    }
}

class MainFromAnotherMain
{
    public static void main(String args[])
    {
        String str[] = {"Gopi","Kamal","Vinay"};
        class1.main(str);
    }
}