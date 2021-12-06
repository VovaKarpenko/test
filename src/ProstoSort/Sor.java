package ProstoSort;

import java.util.ArrayList;

public class Sor {
    public static int[] sort(int[] mas) {
        boolean end = true;

        while (end) {

            end = false;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i] > mas[i + 1]) {
                    int swich = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = swich;
                    end = true;

                }

            }
        }
        return mas;
    }

    public static String[] sort(String[] mas) {
        boolean end = true;

        while (end) {

            end = false;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i].compareTo(mas[i+1])>0 ) {
                    String swich = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = swich;
                    end = true;

                }

            }
        }
        return mas;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> mas) {
        boolean end = true;

        while (end) {

            end = false;
            for (int i = 0; i < mas.size() - i + 1; i++) {
                if (mas.get(i) > mas.get(i + 1)) {
                    int swich = mas.get(i);
                    mas.set(i, mas.get(i + 1));
                    mas.set(i + 1, swich);
                    end = true;

                }

            }
        }
        return mas;
    }
}
