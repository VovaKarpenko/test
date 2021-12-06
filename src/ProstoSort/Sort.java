package ProstoSort;


import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Sor sort = new Sor();
        int[] array = {2,3,6,1,9,0,7};
        String [] arrayStr = {"a","t","l","b"};
        ArrayList<Integer> arrayList = new ArrayList<>();{
          arrayList.add(2);
            arrayList.add(8);
            arrayList.add(3);
            arrayList.add(1);
            arrayList.add(9);
            arrayList.add(0);
            arrayList.add(11);
            arrayList.add(19);
            arrayList.add(10);
        }
            Sor.sort(arrayList);
        System.out.println(Arrays.toString(new ArrayList[]{arrayList}));
Sor.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));


    }
}
