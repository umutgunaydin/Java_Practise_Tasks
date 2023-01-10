package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();// order is random->but maintains random order , duplicate is not allowed , does not have index number
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(set1);

        System.out.println("----------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();// maintains the insertion order, accept null , child of hashset
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(set2);

        System.out.println("--------------------");

        Set<Integer> set3 = new TreeSet<>();// implements sortedset interface, sorted with an increasing order, does not accept null, there is no get()
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(set3);

        System.out.println("--------------------------");

        //!!!!! we can convert one to another

        List<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,4,4,4,5,5,5,5,6,6,6,6));

        Set<Integer> newNumbers=new TreeSet<>(numbers);

        System.out.println(numbers);
        System.out.println(newNumbers);


    }
}
