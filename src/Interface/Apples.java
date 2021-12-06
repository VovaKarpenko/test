package Interface;

import Interface.Info;

public class Apples implements Info<Apples> {
    int weight;
    String color;


    public Apples(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public int compareTo(Apples o) {
        return this.color.compareTo(o.color);
    }

    @Override
    public void info() {
        System.out.println("color " + color + "weight " + weight);
    }

}
