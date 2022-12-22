package day19_arraysIntro;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] numbers={1,3,2,4,5};

        int[] reversed=new int[numbers.length];

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reversed));


        System.out.println("--------------");

        int[]  nums={1,2,3,4,5,6,7,8,9,0};
        nums=ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));
    }
}
