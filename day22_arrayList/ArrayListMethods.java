package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        // add()
        list.add(10);
        list.add(5);
        list.add(32);
        System.out.println(list);

        //to exact index but by shifting
        list.add(1,15);
        System.out.println(list);

        //  size()
        System.out.println(list.size());

        // get()
        System.out.println(list.get(3));





    }
}
