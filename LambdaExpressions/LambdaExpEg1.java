// Lambda expression
@FunctionalInterface
interface Display{
    public void display();
}

class LambdaExpEg1{
    public static void main(String[] args){
        Display d = ()->{System.out.println("Hi!");};

        d.display();
    }
}