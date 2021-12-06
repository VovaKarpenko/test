package Search;

public class Intersect {
    public static void main(String[] args) {
        int[] mas1 = {2, 5, 6, 8, 9, 11, 17, 20, 22,23};
        int[] mas2 = {3, 4, 7, 9, 10, 11, 14, 16, 17};
        int inMas1 = 0;
        int inMas2 = 0;

        while (inMas2 < mas2.length - 1 || inMas1 < mas1.length - 1) {
            if (mas1[inMas1] == mas2[inMas2]) {
                System.out.println(mas1[inMas1]);
                if (inMas2 < mas2.length - 1) {
                    inMas2++;
                }
                if (inMas1 < mas1.length - 1) {
                    inMas1++;
                }
            }
            if (mas1[inMas1] < mas2[inMas2] && inMas1 < mas1.length - 1) {
                inMas1++;
            }
            if (mas1[inMas1] == mas2[inMas2]) {
                System.out.println(mas1[inMas1]);
                if (inMas2 < mas2.length - 1) {
                    inMas2++;
                }
                if (inMas1 < mas1.length - 1) {
                    inMas1++;
                }
            }
            if (mas1[inMas1] > mas2[inMas2] && inMas2 < mas2.length - 1) {
                inMas2++;
            }
        }
    }
}

