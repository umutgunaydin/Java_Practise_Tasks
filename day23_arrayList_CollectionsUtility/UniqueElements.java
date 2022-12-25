package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("ahmet");
        names.add("memet");
        names.add("brooks");
        names.add("johnny");
        names.add("mike");
        names.add("mike");
        names.add("ahmet");

        ArrayList<String> uniqueNames=new ArrayList<>();

        for (String each : names) {
            if (names.indexOf(each)==names.lastIndexOf(each)){
                uniqueNames.add(each);
            }
        }

        System.out.println(uniqueNames);




    }
}
