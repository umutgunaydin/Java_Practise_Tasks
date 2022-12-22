package day20_arraysUtilities_forEach;

import java.util.Arrays;

public class ForEachLoopPractise {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if (each % 2 != 0) {
                System.out.println(each);
            }
        }

        System.out.println("---------");

        int[] nums = {34, 555, 2, 4, 6, 909, 23, 4, 1};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }

            if (each<min){
                min=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------------");
        //merging
        int[] a1={1,2,3,4,5};
        int[] a2={7,8,9};

        int[] a3=new int[a1.length+a2.length];

        int k=0;

        for (int each : a1) {
            a3[k++]=each;
        }

        for (int each : a2) {
            a3[k++]=each;
        }
        System.out.println(Arrays.toString(a3));

    }
}
