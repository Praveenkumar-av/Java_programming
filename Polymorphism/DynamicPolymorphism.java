/* Dynamic Polymorphism in Java
    It is also known as runtime polymorphism. It is a process in which a function call to the
overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.

Method overriding :
    Writing methods in both sub class and super class such that the methods hava the same name and same signature 
is called method overriding. */

class Animal {

    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class DynamicPolymorphism {

    public static void main(String[] args) {
        // Run-time polymorphism: method called based on actual object type
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); // Reference type: Animal, Object type: Dog
        Animal animal3 = new Cat(); // Reference type: Animal, Object type: Cat

        animal1.makeSound(); // Calls Animal's makeSound()
        animal2.makeSound(); // Calls Dog's makeSound()
        animal3.makeSound(); // Calls Cat's makeSound()
    }
}
