package HiddenNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiddenNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        System.out.println(search(arr));
    }
    public static int search(int[] array){
        int max = array.length+1;
        int fullArray = Arrays.stream(array).sum();
        return (max * (max +1)/2)-fullArray;
    }
}

//        int fullArray = 0;
//        for (int j : array) {
//            fullArray += j;
//        }
//        max = max * (max + 1) / 2;
//        int result = max - fullArray;
//        System.out.println(result);



