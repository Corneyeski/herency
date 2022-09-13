import entities.Apple;
import entities.abstraction.A;
import entities.abstraction.B;
import entities.enums.Colors;
import entities.enums.Tastes;
import entities.polymorphism.Animal;
import entities.polymorphism.Dog;
import entities.polymorphism.Pig;
import service.ServiceOne;
import service.impl.ServiceImpl;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

        System.out.println("********************INHERITANCE********************");

        /**
         * Example of inheritance
         */
        inheritanceExample();

        System.out.println("********************POLYMORPHISM********************");

        /**
         * Example of polymorphism
         */
        polymorphismExample();

        System.out.println("********************OVERLOAD********************");

        /**
         * Example of overload
         */
        overload();
        overload(1);
        overload("test");

        System.out.println("********************ABSTRACTION********************");

        /**
         * Example of abstraction
         */
        abstraction();

        /**
         * Example of interfaces
         */
        interfaces();

    }


    public static void inheritanceExample() {
        //Initialize Apple class with default attr for the parent
        Apple apple = new Apple();
        apple.showParentAttributes();

        //We can set the properties of the parent class using the child class object
        apple.setColor(Colors.GREEN);
        apple.setTaste(Tastes.SAVORY);
        apple.setFamily("Apple-t-ini");

        apple.showParentAttributes();

        System.out.println(apple);

        Apple apple2 = new Apple("green apple", new Date(), "Frucasa");
        System.out.println(apple2);
    }


    public static void polymorphismExample() {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

    public static void overload() {
        System.out.println("Overload with no parameters");
    }

    public static void overload(int i) {
        System.out.println("Overload with one parameter type int");
    }

    public static void overload(String i) {
        System.out.println("Overload with one parameter type String");
    }

    public static void abstraction() {
        A abs = new B();
        abs.printSomething();
        A.printSomething("Cool");

        B b = new B();
        b.printSomething();
        b.printStatus();
    }

    public static void interfaces() {
        ServiceOne serviceOne = new ServiceImpl();

        serviceOne.methodOne();
        serviceOne.methodTwo("Test message");
        System.out.println(serviceOne.methodThree("this", "are", "multiple", "values"));
        System.out.println(serviceOne.methodFour());
    }
}