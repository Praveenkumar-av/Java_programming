// User defined Exception

class InsufficientBalanceException extends Exception
{
    String str1;
    InsufficientBalanceException(String str)
    {
        str1 = str;
    }

    public String toString()  // overriding toString() method of Exception class
    {
        return ("Account reg :"+str1);
    }
}

class Account
{
    double balance;
    Account(double balance)
    {
        this.balance = balance;
    }

    void checkBalance() throws InsufficientBalanceException
    {
        if(balance < 1000)
        {
            throw new InsufficientBalanceException("Balance less than 1000");
        }
        else
        {
            System.out.println("Balance :"+balance);
        }
    }
}

class UserDefinedExceptionEg2
{
    public static void main(String args[])
    {
        Account c1 = new Account(500);
        // catch the exception thrown by checkBalance() method
        try
        {
            c1.checkBalance();  
        }
        catch(InsufficientBalanceException i)
        {
            System.out.println(i.toString());
        }
    }
}