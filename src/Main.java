import entities.Apple;
import entities.enums.Colors;
import entities.enums.Tastes;
import entities.polymorphism.Animal;
import entities.polymorphism.Dog;
import entities.polymorphism.Pig;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

        /**
         * Example of inheritance
         */
        inheritanceExample();


        /**
         * Example of polymorphism
         */
        polymorphismExample();



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

        Apple apple2 = new Apple("green apple", new Date(), "Frucasa");
        System.out.println(apple2);

        overload();
        overload(1);
        overload("test");
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
}