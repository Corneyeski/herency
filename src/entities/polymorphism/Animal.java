package entities.polymorphism;

public class Animal {

    int legs;

    {
        legs = 4;
        System.out.println("Default number of legs: " + legs);
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
