package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        //      addAll()   -----> you can use with index
        list1.addAll(numbers);
        System.out.println(list1);

        System.out.println("-------------------------");

        //     asList()    ---> 2 type, one is with index
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list1);

        System.out.println("--------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("ahmet", "mehmet", "muhtar", "mahmut", "berk"));
        System.out.println(students);

        students.addAll(0, Arrays.asList("umut"));
        System.out.println(students);

        System.out.println("-----------------------------");

        // converting array to arraylist!!

        // it has to be nonprimitive
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(l1);

        System.out.println("-----------------------------");

        //      containsAll()
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("umut", "brooks", "sam", "berk", "jonny"));
        System.out.println(employees);

        boolean hasUmutBrooks = employees.containsAll(Arrays.asList("umut", "brooks"));// order does not matter
        System.out.println("hasUmutBrooks = " + hasUmutBrooks);

        System.out.println("---------------------------");

        //    removeAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 1, 1, 1, 13, 4, 6));
        System.out.println(list2);
        list2.removeAll(Arrays.asList(1, 4));
        System.out.println(list2);

        System.out.println("--------------------------------");

        //      retainAll() ------> removes the elements that are not matching
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("brooks", "adam", "berk", "muhtar", "umut", "alena"));
        System.out.println(developers);
        developers.retainAll(Arrays.asList("umut", "brooks"));
        System.out.println(developers);

        System.out.println("----------------------------");

        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("eggs","milk","bread","orange","water","strawberry"));
        System.out.println(groceryList);
        groceryList.retainAll(Arrays.asList("bread","eggs","water"));
        System.out.println(groceryList);








    }
}
