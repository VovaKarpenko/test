import com.apple.eawt.AppEventListener;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[][] array ={{1,0,0}
                       ,{2,0,0}
                       ,{3,0,0}}
                ;
        String[][] arrayStr= new String[array[array.length-1][0]][3];

        for (int i = array[array.length-1][0]; i > 1; i--) {
            for (int j = 0; j < 3; j++) {

            }
        }


    }

    public static String[][] swapBeautiful(String[][] tower, int[] heightTo, int[] heightFrom, int from, int to) {
        String  swap = tower[heightFrom[from]][from];
        tower[heightFrom[from]][from] = tower[heightTo[to]][to];
        tower[heightTo[to]][to] = swap;
        return tower;
    }


}/*

                           |
                           |
                           |
                           |
                           |
                           |

     |
     |     (*)
     |    (***)
     |   (*****)
     |  (*******)
     | (*********)
     |(***********)



   */
