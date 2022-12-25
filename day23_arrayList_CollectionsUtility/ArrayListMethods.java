package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("ahmet");
        names.add("memet");
        names.add("brooks");
        names.add("johnny");
        names.add("mike");
        System.out.println(names);

        System.out.println("--------------------------");

        //    set()    ---> removes the previous one
        names.set(1,"umut");
        System.out.println(names);

        System.out.println("-------------------------");

        //    remove()   --> we can use either object or index
        names.remove(0);
        names.remove("brooks");
        System.out.println(names);

        System.out.println("----------------------------");

        //  clear()  ---->  removes all the elements
        //names.clear();
        //System.out.println(names);

        System.out.println("--------------------------------");

        //      indexOf()----------lastIndexOf()
        System.out.println(names.indexOf("umut"));
        System.out.println(names.lastIndexOf("umut"));

        System.out.println("-----------------------------");

        //     contains()
        boolean hasUmut= names.contains("umut");
        System.out.println(hasUmut);

        System.out.println("-------------------------------");

        //      equals()   ------> order is important
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        boolean isSame=list1.equals(list2);
        System.out.println("isSame = " + isSame);

        System.out.println("----------------------------------");

        //    isEmpty()
        list1.clear();
        System.out.println(list1.isEmpty());

        System.out.println("------------------------------------");





    }
}
