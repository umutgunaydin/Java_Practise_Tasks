package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        //container for elements
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] arr3 = {9, 10};

        System.out.println("-------------------------");
        //container for arrays
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, arr3};// by name or by data
        //index Arrays:     0               1          2
        //index Elements: 0  1  2    0  1  2  3  4   up to arr3
        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[1][1]);




    }
}
