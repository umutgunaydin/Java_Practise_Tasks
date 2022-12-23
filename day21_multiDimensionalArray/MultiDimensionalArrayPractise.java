package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractise {
    public static void main(String[] args) {

        String[] group1 = {"lucy", "umran", "sumeyye", "abdullah"};
        String[] group2 = {"ahmet", "memet", "veli"};
        String[] group3 = {"elif"};
        String[] group4 = {"zeki", "mike", "john"};

        String[][] groups = {group1, group2, group3, group4};

        for (String[] each1D : groups) {
            System.out.println(Arrays.toString(each1D));
            for (String eachElement : each1D) {
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = eachGroup.length - 1; j >= 0; j--) {
                String eachName = eachGroup[j];
                System.out.println(eachName);
            }
        }

        System.out.println("---------------------");

        System.out.println(Arrays.deepToString(groups));

    }
}
