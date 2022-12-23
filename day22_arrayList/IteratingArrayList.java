package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(12);
        list.add(43);
        list.add(46);
        list.add(98);
        list.add(500);

        System.out.println(list);

        System.out.println("------------------");

        for (int i = 0; i < list.size(); i++) {
           int each= list.get(i);
            System.out.println(each);
        }

        System.out.println("---------------------");

        for (Integer each : list) {
            System.out.println(each);
        }


    }
}
