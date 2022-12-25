package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2,6,3,9,0,1, 3, 4, 5, 6, 7, 8, 9));

        // min() -----   max() --> we need to import
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("----------------------");

        //   sort() --> by ascending style
        //Collections.sort(list);
        System.out.println(list);

        // reverse() ---> reverses the array not orders
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("-------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("umut", "brooks", "sam", "berk", "jonny"));
        System.out.println(employees);
        Collections.swap(employees,0,1);
        System.out.println(employees);

        Collections.swap(employees,0,employees.size()-1);
        System.out.println(employees);




    }
}
