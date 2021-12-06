package Interface;

public class Apples implements Comparable<Apples> {
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


}
