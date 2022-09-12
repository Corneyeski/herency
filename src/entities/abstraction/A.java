package entities.abstraction;

public abstract class A {

    abstract void printStatus();

    public static void printSomething(String some){
        System.out.println("This is the something: " + some);
    }

    public void printSomething(){
        System.out.println("This is the something: nothing.");
    }

}
