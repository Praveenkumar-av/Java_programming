// A static block is a block of code which is executed first in the program when a class is loaded into the memory.

class StaticBlock
{
    // static block
    static
    {
        System.out.println("This is static block");
    }

    public static void main(String args[])
    {
        System.out.println("Inside main method");
    }
}