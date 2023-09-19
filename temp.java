class show
{
    static int num;
    static void display(int num)
    {
        show.num = num;
        System.out.println("Number is: "+show.num);
    }
}

class temp
{
    public static void main(String args[])
    {
        show s = new show();
        s.display(10);
    }
}