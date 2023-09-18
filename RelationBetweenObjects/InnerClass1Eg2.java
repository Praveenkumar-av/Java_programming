// Nested private Inner class

import java.util.Scanner;
class BankAcct
{
    // balance amount is the variable
    private double balance;
    // initialize the balance
    BankAcct(double balance)
    {
        this.balance = balance;
    }

    // in this method, inner class is created after verifying 
    void contact(double r)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = scan.next();
        if(pass.equals("xyz"))
        {
            // create inner class 'Interest' object here
            Interest in = new Interest(r);
            in.calculateInterest();
        }
        else
        {
            System.out.println("Invalid password");
        }
    }

    // inner class
    private class Interest
    {
        // rate of interest
        private double rate;
        // initialize the rate
        Interest(double r)
        {
            rate = r;
        }

        void calculateInterest()
        {
            // calculate the interest amount and update balance
            double interest = balance * (rate/100);
            balance += interest;
            System.out.println("updated balance :"+balance);
        }
    }
}

class InnerClass1Eg2
{
    public static void main(String args[])
    {
        // create BankAcct class object
        BankAcct b = new BankAcct(10000);
        // call the contact method and pass rate of interest
        b.contact(3);
    }
}