package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SortShell {
    public static void main(String[] args) {

        int[] arr = {15, -17, 18, 8, -14, -10, 16, 12, -6, -9};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] array) {
        int step = array.length / 2;
        while (!(step == 0)) {
            int index;
            int i = step;
            while (i < array.length) {
                int num = array[i];
                index = i - step;
                while (index >= 0) {
                    if (num < array[index]) {
                        array[index + step] = array[index];
                    } else {
                        break;
                    }
                    index -= step;
                }
                i++;
                array[index + step] = num;
            }
            step /= 2;

        }
    }
}









