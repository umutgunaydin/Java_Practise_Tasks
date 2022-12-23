package day22_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            int frequency = 0;
            for (Integer each2 : list) {
                if (each == each2) {
                    frequency++;
                }
            }
            if (frequency==1){
                newList.add(each);
            }
        }

        System.out.println(list);
        System.out.println(newList);


    }
}
