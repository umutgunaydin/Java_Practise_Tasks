package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("java","java","java","java","java","c","c"));

        System.out.println(names);

        for (String each : names) {
            if (each.equals("java")){
                names.set(names.indexOf(each),"python");
            }
        }
        System.out.println(names);

        System.out.println("-------------------------");

        //replaceAll()
        Collections.replaceAll(names,"c","c#");
        System.out.println(names);

        System.out.println("---------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,5,5,5,5,6,7,8,9));

        // frequency()
        int count=Collections.frequency(list,5);
        System.out.println("count of 5 = " + count);

        System.out.println("------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,5,5,5,5,5,6,7,8,9));

        for (Integer each : list2) {
            if (Collections.frequency(list2,each)==1){
                System.out.println(each);
            }
        }


    }
}
