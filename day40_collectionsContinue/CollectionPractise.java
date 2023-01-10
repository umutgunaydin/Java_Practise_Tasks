package day40_collectionsContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionPractise {
    public static void main(String[] args) {

        Collection<Integer> collection=new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(1,2,3,4,55,6,7,6));

        System.out.println(collection);

        System.out.println(((ArrayList)collection) .get(2));

        System.out.println("----------------------");

        Collection<Integer> collection2=new HashSet<>();
        collection2.addAll(Arrays.asList(1,1,1,1,3,3,3,2,2,2));

        System.out.println(collection2);

        System.out.println(new ArrayList<>(collection2).get(1));// for converting we need to use constructor





    }
}
