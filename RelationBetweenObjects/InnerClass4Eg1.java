// Anonymous Inner Class - 3 types
// 1. Anonymous Inner class that extends a class

/*  An inner class declared without a class name is known as an anonymous inner class. 
In case of anonymous inner classes, we declare and instantiate them at the same time.
Generally, they are used whenever you need to override the method of a class or an interface. 
The syntax of an anonymous inner class is as follows :  */

// Syntax

// AnonymousInner an_inner = new AnonymousInner() {
//    public void my_method() {
//       ........
//       ........
//    }   
// };

class Outer
{
    void show()
    {
        System.out.println("This is inside Outer class");
    }
}

class InnerClass4
{
    // an anonymous class with Demo as base class
    static Outer d = new Outer()
    {
        // override the show() method in Parent class
        @Override  // optional
        void show()
        {
            // call 'show' method of parent class using super keyword
            super.show();

            System.out.println("This is inside anonymous class");
        }
    };

    public static void main(String args[])
    {
        // call 'show' method
        d.show();
    }
}