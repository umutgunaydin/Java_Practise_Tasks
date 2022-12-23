package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        // index elements 0  1  2    0  1  2  3  4    0   1
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10}};
        //index arrays       0              1           2

        for (int i = 0; i < arr2D.length; i++) {

            System.out.println(Arrays.toString(arr2D[i]));

            for (int each:arr2D[i]){
                System.out.println(each);
            }
        }

        System.out.println("-----------------------");

        for (int[] each1D:arr2D){
            System.out.println(Arrays.toString(each1D));
            for (int each : each1D) {
                System.out.println(each);
            }
        }

        System.out.println("------------------------");

        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }


    }
}
