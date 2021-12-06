package Interface;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person(2, 4, "Vova");
        people[1] = new Person(5, 8, "Gorge");
        people[2] = new Person(9, 6, "Iarik");

        sort(people);


        Apples[] apples = new Apples[4];
        apples[0] = new Apples(2, "green");
        apples[1] = new Apples(3, "yellow");
        apples[2] = new Apples(8, "red");
        apples[3] = new Apples(4, "green");

        sort(apples);


    }

    public static void sort(Comparable[] mas) {

        boolean end = true;

        while (end) {

            end = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i].compareTo(mas[i + 1]) > 0) {
                    Comparable swich = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = swich;
                    end = true;
                }
            }
        }
    }
}






