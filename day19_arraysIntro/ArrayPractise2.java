package day19_arraysIntro;

import java.util.Arrays;

public class ArrayPractise2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];

        for (int i = 0, j = 10; i < arr1.length; i++, j += 10) {
            arr1[i] = j;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("------------------------");

        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println(Arrays.toString(days));

        int day=1;

        System.out.println(days[day-1]);



    }
}
