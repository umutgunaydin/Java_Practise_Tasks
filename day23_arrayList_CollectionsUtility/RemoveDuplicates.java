package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("ahmet");
        names.add("memet");
        names.add("brooks");
        names.add("johnny");
        names.add("mike");
        names.add("mike");
        names.add("ahmet");

        ArrayList<String> newNames = new ArrayList<>();

        for (String each : names) {
            if (!newNames.contains(each)) {
                newNames.add(each);
            }
        }

        System.out.println(newNames);


    }
}
