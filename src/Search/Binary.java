package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas1 = new int[50];
        for (int i = 0; i < mas1.length - 1; i++) {
            mas1[i] = (int) (Math.random()*1000);
        }
        Arrays.sort(mas1);
        System.out.println(Arrays.toString(mas1));
        int search = scanner.nextInt();
        int low = 0;

        int high = mas1.length;
        int midle = high / 2;
        while (!(search == mas1[midle])) {
            if (mas1[midle] > search) {
                high = midle;
                midle = (low + high) / 2;
            }
            if (mas1[midle] < search) {

                low = midle;
                midle = (low + high) / 2;

            }
            System.out.println("@");
        }
        System.out.println(mas1[midle]);
    }
}

