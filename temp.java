class show
{
    int num;
    void display(int num)
    {
        this.num = num;
        System.out.println("Number is: "+this.num);
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