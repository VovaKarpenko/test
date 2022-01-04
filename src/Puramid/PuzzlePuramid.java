package Puramid;

import java.util.Arrays;

public class PuzzlePuramid {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0},        //[0,0,0]
                {2, 0, 0},
                {3, 0, 0},
                {4, 0, 0}

        };
        int max = array[array.length - 1][0];
        int count = 0;

        int countArray1 = -1;
        int countArray2 = array[array.length - 1][0] - 1;
        int countArray3 = array[array.length - 1][0] - 1;


        for (int i = 0; i < Math.pow(max, 2) - 1; i++) {

            if (max % 2 == 0) {
                if (count % 3 == 0) {

                    if (array[countArray1 + 1][count % 3] % 2 == 0) {
                        if (!(countArray3 == max - 1)) {
                            if (array[countArray1 + 1][count % 3] < array[countArray3 + 1][postionX(count)] || array[countArray3][postionX(count)] == 0) {
                                swap(array, countArray1 + 1, count % 3, countArray3, postionX(count));
                            }
                        } else {
                            swap(array, countArray1 + 1, count % 3, countArray3, postionX(count));
                        }

                        count -= 2;
                        countArray3 -= 1;
                        countArray1 += 1;
                    } else {
                        if (!(countArray2 == max - 1)) {
                            if (array[countArray1 + 1][count % 3] < array[countArray2][(count + 1) % 3] || array[countArray2 + 1][(count + 1) % 3] == 0) {
                                swap(array, countArray1 + 1, count % 3, countArray2, (count + 1) % 3);
                            }

                        } else {
                            swap(array, countArray1 + 1, count % 3, countArray2, (count + 1) % 3);
                        }

                        count += 2;
                        if (array[array.length - 1][count % 3] == 0)
                            count += 1;
                        countArray2 -= 1;
                        countArray1 += 1;

                    }
                    Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
                    System.out.println("");


                }
                if (count % 3 == 1) {
                    if (array[countArray2 + 1][count % 3] % 2 == 0) {
                        if (!(countArray1 == max - 1)) {

                            if (array[countArray2 + 1][count % 3] < array[countArray1 + 1][postionX(count)] || array[countArray1][postionX(count)] == 0) {
                                swap(array, countArray2 + 1, count % 3, countArray1, postionX(count));
                            }

                        } else {
                            swap(array, countArray2 + 1, count % 3, countArray1, postionX(count));
                        }

                        count -= 2;
                        countArray1 -= 1;
                        countArray2 += 1;
                    } else {
                        if (!(countArray3 == max - 1)) {
                            if (array[countArray2 + 1][count % 3] < array[countArray3 + 1][(count + 1) % 3] || array[countArray3 + 1][(count + 1) % 3] == 0) {
                                swap(array, countArray2 + 1, count % 3, countArray3, (count + 1) % 3);
                                count += 2;
                                countArray3 -= 1;
                                countArray2 += 1;
                            }else {
                                count += 1;

                        }
                        }


                    }
                }


                if (count % 3 == 2) {

                    if (array[countArray3 + 1][count % 3] % 2 == 0) {
                        if (!(countArray2 == max - 1)) {
                            if (array[countArray3 + 1][count % 3] < array[countArray2 + 1][postionX(count)] || array[countArray2][postionX(count)] == 0) {
                                swap(array, countArray3 + 1, count % 3, countArray2, postionX(count));
                            }
                        } else {
                            swap(array, countArray3 + 1, count % 3, countArray2, postionX(count));
                        }


                        count -= 2;
                        countArray3 += 1;
                        countArray2 -= 1;

                    } else {
                        if (!(countArray2 == max - 1)) {
                            if (array[countArray3 + 1][count % 3] < array[countArray1 + 1][(count + 1) % 3] || array[countArray1][(count + 1) % 3] == 0) {
                                swap(array, countArray3 + 1, count % 3, countArray1, (count + 1) % 3);
                            }
                        } else {
                            swap(array, countArray3 + 1, count % 3, countArray1, (count + 1) % 3);
                        }


                        count += 2;

                        countArray3 += 1;
                        countArray1 -= 1;
                    }
                }
                Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
                System.out.println("");

//            if (!(max % 2 == 0)) {
//
//            }


                System.out.println("");


                //swap(array,disc1,disc2);


            }
        }
    }


    public static int[][] swap(int[][] array, int countY, int countX, int placeY, int placeX) {
        int swap = array[countY][countX];
        array[countY][countX] = array[placeY][placeX];
        array[placeY][placeX] = swap;
        return array;
    }

    public static int postionX(int i) {
        switch (i % 3) {
            case 0:

                return 2;

            case 1:
                return 1;

            case 2:
                return 0;

            default:
                return i;

        }
    }
}


//int[] array1 = {1, 2};
//        int[] array2 = {0, 0};
//        int[] array3 = {0, 0};
//  for (int j = 0; j < array1.length; j++) {
//                    System.out.println(array1[j] + " " + array2[j] + " " + array3[j]);
//                }


//                if (array[countY1][countX1] % 2 == 0 && !(array[countY1][countX1] == 0)) {
//
//                    array = swap(array, countY1, countX1, placeY1, postionX(placeX1));
//                    placeY2 -= 1;
//
//
//                } else if (!(array[countY2][countX2] % 2 == 0)) {
//                    placeX2 += 1;
//                    array = swap(array, countY2, countX2 % 3, placeY2, placeX2 % 3);
//                    countY2 = placeY2;
//                    countX2 = placeX2;
//                    countY1 += 1;
//
//
//                }
//
//            }


//    public static int postionY(int i, int postion) {
//
//        int firstStick[] = {0, 0, 0};
//        firstStick[postion] += i;
//        if (firstStick[postion] > i) {
//            firstStick[postion] += 1;
//        }
//        return firstStick[postion];
//
//    }
//}


//String[][] arr = {{"|","|","  ()"},{"|","|"," (  )"},{"|","|","(    )"}} ;