package day19_arraysIntro;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {

        String[] myGroup=new String[5];

        myGroup[0]="james";
        myGroup[1]="cook";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("-------------------------");




    }
}
