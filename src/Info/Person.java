package Info;

public class Person implements Inf {
    int weight;
    int height;
    String name;

    public Person(int weight, int height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    @Override
    public int sort() {
        if (name.equals("Vova")) {

            return this.weight = 110;
        } else {
            return 2;
        }

    }

    @Override
    public int weihgt() {
     return this.weight;
    }

    @Override
    public void info() {
        System.out.println(weight +" " + height + " " + name);
    }
}
