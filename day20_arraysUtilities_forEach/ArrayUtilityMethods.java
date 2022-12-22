package day20_arraysUtilities_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 60};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println("---------------------");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(arr1, arr2);//elements and order must be same!!!!!!!
        System.out.println(r1);//true


        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"a", "c", "b"};

        System.out.println(Arrays.equals(str1, str2));//false

        Arrays.sort(str2);
        System.out.println(Arrays.equals(str1, str2));//true-after sorted

        System.out.println("------------------------");

        String[] students = {"yaxier", "madivac", "ali", "abdullah", "alena"};
        Arrays.sort(students);// it will compare characters one by one !!!
        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------");
//copyOf(arrayName, newLength);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));
        int[] array2 = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9};

        //merging two arrays!!!!
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }

        System.out.println("----------------------------");
                                            //this is not included
        //copyOfRange(arrayName,startingIndex,endingIndex)
        int[] copiedRange=Arrays.copyOfRange(n1,1,3);
        System.out.println(Arrays.toString(copiedRange));

    }
}
