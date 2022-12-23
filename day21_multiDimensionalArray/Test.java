package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,5,4,3,2,1};

        int[] newArray = new int[array.length - 1];
        newArray = ArraysUtility.remove(array, 4);
        System.out.println(Arrays.toString(newArray));

        System.out.println("--------------------------");

        int[] newArray2=ArraysUtility.removeDuplicates(array);
        System.out.println(Arrays.toString(newArray2));

    }
}
