class show
{
    int num;
    void num(int a)
    {
        num = a;
        System.out.println("Number is: "+num);
        this.display();
    }

    private void display()
    {
        System.out.println("a :"+num);
    }
}

class temp
{
    public static void main(String args[])
    {
        try
        {
            show s = new show();
            s.num(10);
        }
        catch(Exception e)
        {
            System.out.println("Catched :");
        }
    }
}