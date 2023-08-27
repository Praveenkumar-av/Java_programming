/* When there are several statements and we have to chose only one option from available ones, we use switch statement.
Syntax :
    switch(expression)
    {
        case value1:
            statements;
            break;
        case value2:
            statements;
            break;
        case value3:
            statements;
            break;
        default:
            statements;
    }
*/

class SwitchStatement
{
    public static void main(String args[])
    {
        int day = 3;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturaday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:        // default is optional
                System.out.println("Invalid day");
        }
    }
}