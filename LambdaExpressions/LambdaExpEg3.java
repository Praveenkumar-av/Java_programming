interface MyLambda{
    public void modify();
}

class Demo{
    int classVar=0;
    // you can use and modify class variables in lambda expression
    void start(){
        int localVar=0;
        // you can use but cannot modify local variables in lambda expression
        // localVar = 5; // Error: Local variable localVar defined in an enclosing scope must be final or effectively final
        MyLambda ml = ()->{
            int count=0;
            count++;
            // you can use and modify variables inside lambda expression
            System.out.println("Hello "+count+" "+(++classVar));
        };

        ml.modify();
    }
}

class LambdaExpEg3{
    public static void main(String []args){
        Demo d = new Demo();
        d.start();
    }
}