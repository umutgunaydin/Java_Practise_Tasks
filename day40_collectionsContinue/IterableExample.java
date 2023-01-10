package day40_collectionsContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,4,5,1,32,4,666,2,4,45));
        System.out.println(list);

        /*
        for (Integer each : list) {
            if (each<5){
                list.remove(each);
            }
        }
        System.out.println(list);
         */

       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<5){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        */

        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            Integer each=it.next();
            if (each<5){
                it.remove();
            }
        }

        System.out.println(list);

        System.out.println("-------------------");

        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,4,5,1,32,4,666,2,4,45));
        System.out.println(list2);

        list2.removeIf(each -> each<5);
        System.out.println(list2);





    }
}
