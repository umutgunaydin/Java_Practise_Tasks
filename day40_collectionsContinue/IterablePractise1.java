package day40_collectionsContinue;

import java.util.*;

public class IterablePractise1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));
        System.out.println(list);

        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("-------------");

        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));// find nth max number

        int n=5;
        int max=0;

        for (int i = 0; i < 4; i++) {
            list1.removeIf(p->p== Collections.max(list1));
        }

        max=Collections.max(list1);
        System.out.println(max);


    }

}
