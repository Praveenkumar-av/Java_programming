interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo{
    public void method1(){
        UseLambda ul=new UseLambda();
        // pass the lambda expression as argument to callLambda function
        ul.callLambda(()->{System.err.println("Hello");});
    }
}

class LambdaExpEg4{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
}