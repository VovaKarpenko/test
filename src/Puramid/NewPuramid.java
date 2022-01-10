package Puramid;

import java.util.Arrays;
import java.util.Scanner;

public class NewPuramid {

    static int[][] Tower;
   static int disk = 10;

    static int[] arrayHeightFrom ={0, disk, disk};
   static int[] arrayHeightTo = {-1,disk-1,disk-1};

    public static void diskTower(int disk, int from, int buf, int to) {


        if (disk != 0) {
            diskTower(disk - 1, from, to, buf);
            real(from, to,arrayHeightTo,arrayHeightFrom);
            diskTower(disk - 1, buf, from, to);

        }
    }


    public static void real(int from, int to, int[] arrayHeightTo,int[]arrayHeightFrom) {

        setTower(swap(Tower, arrayHeightTo,arrayHeightFrom, from, to));
        arrayHeightFrom[from] += 1;
        arrayHeightFrom[to] -= 1;
        arrayHeightTo[from] += 1;
        arrayHeightTo[to] -= 1;
        print(getTower());
    }


    public static int[][] swap(int[][] tower, int[] heightTo,int[] heightFrom, int from, int to) {
        int swap = tower[heightFrom[from]][from];
        tower[heightFrom[from]][from] = tower[heightTo[to]][to];
        tower[heightTo[to]][to] = swap;
        return tower;
    }

    public static void print(int[][] array) {

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        System.out.println("");
    }


    public static int[][] getTower() {
        return Tower;
    }

    public static void setTower(int[][] tower) {
        Tower = tower;
    }


    public static void makeTower(int disk) {
        int[][] array = new int[disk][3];
        for (int i = 0; i < disk; i++) {
            array[i][0] = i + 1;
        }
        setTower(array);
    }

    public static void main(String[] args) {
        int from = 0;
        int buf = 1;
        int to = 2;



        makeTower(disk);
        print(Tower);
        diskTower(disk, from, buf, to);
    }


}



