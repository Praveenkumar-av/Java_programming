// Command line arguments represent the arguments passed to the main() method at the time of program execution.
// To catch and store these values, main() method has a parameter String args[].
// The user should pass the values at the time of program execution at command prompt as shown below:
// java CommandLineArguments 10 20 30

class CommandLineArguments
{
    public static void main(String[] args)
    {
        int n = args.length;
        System.out.println("Number of arguments passed : " + n);
        System.out.println("Arguments are : ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(args[i]);
        }

        // The values passed as arguments are always in the form of String.
        // To use a int value, we need to convert it into int using Integer.parseInt() method.
    }
}