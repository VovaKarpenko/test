import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int i = 5;
makeTower(i);
    }

    public static void makeTower(int disk) {
        int[][] array = new int[disk][3];
        for (int i = 0; i < disk; i++) {
            array[i][0] = i+1;
        }
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);

    }
}


