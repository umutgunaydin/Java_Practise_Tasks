package day19_arraysIntro;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[1] = 1000;
        arr2[0] = 9999;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------");

        String[] a1 = {"brooks", "james"};

        a1 = new String[]{"jonny", "mike"};

        System.out.println(Arrays.toString(a1));


    }
}
