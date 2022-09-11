import entities.Apple;
import entities.enums.Colors;
import entities.enums.Tastes;

import java.util.Date;

public class Main {


    public static void main(String[] args) {

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
    }


}