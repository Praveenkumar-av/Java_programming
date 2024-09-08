// Parameterized Lambda expression

interface Calculation{
    public int add(int x, int y);
}

class LambdaExpEg2{
    public static void main(String[] args){
        Calculation c = (a, b)->a+b;  
        // It will automatically return the result as the return type of method is int

        System.out.println(c.add(6, 2));
    }
}