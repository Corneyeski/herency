package entities;

import entities.enums.Colors;
import entities.enums.Tastes;

public class Fruit {
    private Colors color;
    private String family;
    private Tastes taste;
    public Fruit(Colors color, String family, Tastes taste) {
        this.color = color;
        this.family = family;
        this.taste = taste;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Tastes getTaste() {
        return taste;
    }

    public void setTaste(Tastes taste) {
        this.taste = taste;
    }

    public void exampleCall() {

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", family='" + family + '\'' +
                ", taste=" + taste +
                '}';
    }
}