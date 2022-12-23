package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractise2 {
    public static void main(String[] args) {

        int[][] arr201 = {{1, 2, 3, 4}, {5}};
        int[][] arr202 = {{0}, {6, 7, 8}};
        int[][] arr203 = {{6}};

        int[][][] arr3D = {{{1, 2, 3, 4}, {5}}, {{0}, {6, 7, 8}}, {{6}}};//it must be contain n-1 dimension array!!!!!
        //index elements:    0  1  2  3    0      0    0  1  2      0
        //index 1D                0        1      0       1         0
        //index 2D                  0                   1           2

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println(arr3D[1][1][1]);

        System.out.println("--------------------");

        for (int i = 0; i < arr3D.length; i++) {
            int[][] each2D=arr3D[i];
            System.out.println(Arrays.deepToString(each2D));
            for (int j = 0; j < each2D.length; j++) {
                int[] each1D=each2D[j];
                System.out.println(Arrays.toString(each1D));
                for (int k = 0; k < each1D.length; k++) {
                    int eachElement=each1D[k];
                    System.out.println(eachElement);
                }
            }
        }

    }
}
