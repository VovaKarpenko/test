package Search;

import java.util.ArrayList;

import java.util.List;


public class Intersect2 {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 6, 8, 9, 11, 17, 20, 22, 23};
        int[] array2 = {3, 4, 7, 9, 10, 11, 14, 16, 17};
        search(array1, array2).forEach(System.out::println);
    }

    public static List<Integer> search(int[] array1, int[] array2) {
        int last1 = array1[array1.length - 1];
        int last2 = array2[array2.length - 1];
        List<Integer> arrayTheSame = new ArrayList<Integer>();
        int inArr1 = 0;
        int inArr2 = 0;
        while (array1[inArr1] < last2 + 1 && array2[inArr2] < last1 + 1) {
            if (array1[inArr1] > array2[inArr2]) {
                inArr2 += 1;
            } else if (array1[inArr1] == array2[inArr2]) {
                arrayTheSame.add(array1[inArr1]);
                inArr1 += 1;
                inArr2 += 1;
            }
            if (array1[inArr1] < array2[inArr2]) {
                inArr1 += 1;
            } else if (array1[inArr1] == array2[inArr2]) {
                arrayTheSame.add(array1[inArr1]);
                inArr1 += 1;
                inArr2 += 1;
            }
        }
        return arrayTheSame;
    }
}
