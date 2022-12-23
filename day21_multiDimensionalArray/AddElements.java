package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;

        System.out.println(Arrays.toString(newArray));

        System.out.println("-----------------------");

        int[] numbers = ArraysUtility.addElement(array, element);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------");

        System.out.println(ArraysUtility.contains(array,7));

    }
}
