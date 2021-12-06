package Info;

public class Cars implements Inf {
    int speed;
    String color;
    int weight;

    public Cars(int speed, String color, int weight) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public int sort() {
        if (this.weight > 101) {
            return this.weight = 50;
        }
        if (this.weight < 99) {
            return this.weight = 10;
        } else {
            return 0;
        }
    }

    @Override
    public int weihgt() {
        return this.weight;
    }

    @Override
    public void info() {
        System.out.println(speed + " " + color + " " + weight);
    }
}
