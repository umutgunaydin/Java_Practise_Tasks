package day19_arraysIntro;

import java.util.Arrays;

public class MultiplyOdds {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2==1){
                numbers[i]*=2;
            }

        }

        System.out.println(Arrays.toString(numbers));

    }
}
