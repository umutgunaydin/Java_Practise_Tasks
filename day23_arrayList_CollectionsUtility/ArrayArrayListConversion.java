package day23_arrayList_CollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String[] arr={"a","c","b","d"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("-------------------");

        ArrayList<String> list2=new ArrayList<>();
        list2.addAll(Arrays.asList("java","python","c#"));

        String[] languages=list2.toArray(new String[list2.size()]);
        System.out.println(Arrays.toString(languages));

        System.out.println("-----------------------");

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Integer[] n=nums.toArray(new Integer[0]);// we can use 0 rather than size
        System.out.println(Arrays.toString(n));

        System.out.println("---------------------------");




    }
}
