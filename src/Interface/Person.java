package Interface;

public class Person implements Info<Person>  {
   private final int tall;
    private final int weight;
    private final String name;

    public Person(int tall, int weight, String name) {
        this.tall = tall;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public void info() {
        System.out.println("tall "+ tall + " name " + name + " weight " + weight);
    }
}


