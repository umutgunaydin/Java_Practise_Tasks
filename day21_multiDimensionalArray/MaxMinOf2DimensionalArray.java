package day21_multiDimensionalArray;

public class MaxMinOf2DimensionalArray {
    public static void main(String[] args) {

        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        int max=array[0][0];
        int min=array[0][0];

        for (int[] each1D : array) {
            for (int eachNumber : each1D) {
                if (eachNumber>max){
                    max=eachNumber;
                }
                if (eachNumber<min){
                    min=eachNumber;
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
