import entities.Apple;
import entities.AppleRead;
import entities.abstraction.A;
import entities.abstraction.B;
import entities.abstraction.C;
import entities.enums.Colors;
import entities.enums.Tastes;
import entities.polymorphism.Animal;
import entities.polymorphism.Dog;
import entities.polymorphism.Pig;
import service.ServiceOne;
import service.impl.ServiceImpl;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        String text = "sdgasd";

        Map<Character, Integer> mapTxt = new HashMap<>();

        for (char c : text.toCharArray())
            mapTxt.put(c, mapTxt.getOrDefault(c, 0) + 1);

        System.out.println(mapTxt.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst());


        String name = "Alan";
        name = "";

        String nameMayus = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameMayus);
        System.out.println(name.toUpperCase());



        AppleRead re = new AppleRead("minusculas", new Date(), "");
        System.out.println(re.toUpperCase());



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

        System.out.println("********************INTERFACES********************");

        /**
         * Example of interfaces
         */
        interfaces();


        Map<Integer, String> map = new HashMap<>();
        Map<Apple, Boolean> map2 = new LinkedHashMap<>();
        Map<Integer, String> map3 = new TreeMap<>();

        map.put(2, "Carlos");
        map.put(1, "Alan");

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }


    public static void inheritanceExample() {
        //Initialize Apple class with default attr for the parent
        Apple apple = new Apple();
        apple.showParentAttributes();

        apple.setColor(Colors.RED);

        //We can set the properties of the parent class using the child class object
        apple.setColor(Colors.GREEN);
        apple.setTaste(Tastes.SAVORY);
        apple.setFamily("Apple-t-ini");

        apple.showParentAttributes();

        System.out.println(apple);

        Apple apple2 = new Apple("green apple", new Date(), "Frucasa");
        System.out.println(apple2);


        AppleRead read = new AppleRead("Reader", new Date(), "provider");
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


        A a = new B();
        A a2 = new C();

        a.printStatus();
        a2.printStatus();
    }

    public static void interfaces() {

        ServiceOne serviceOne = new ServiceImpl();

        serviceOne.methodOne();
        serviceOne.methodTwo("Test message");
        System.out.println(serviceOne.methodThree("this", "are", "multiple", "values"));
        System.out.println(serviceOne.methodFour());

    }
}