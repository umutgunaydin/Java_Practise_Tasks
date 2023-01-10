package day40_collectionsContinue;

import java.util.*;

public class QueueDemo {// allow duplicates -- does not have index numbers
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); //order is random - does not accept null -- first in first out order FIFO--allow duplicates
        queue1.addAll(Arrays.asList(1, 1, 1, 2, 3, 2, 3, 4));
        queue1.addAll(Arrays.asList(1, 1, 1, 2, 3, 2, 3, 4));
        queue1.addAll(Arrays.asList(1, 1, 1, 2, 3, 2, 3, 4));

        System.out.println(queue1);

        int num1 = queue1.poll();// ==> FIFO -- it will return and remove that value
        System.out.println(num1);
        System.out.println(queue1);

        System.out.println("----------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();// keeps insertion order -- allow duplicates-- does not accept null
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue2);

        int numOf2 = queue2.poll();
        System.out.println(numOf2);
        System.out.println(queue2);

        System.out.println("---------------------------------");

        Queue<Integer> queue3 = new LinkedList<>();// keeps insertion order -- allow duplicates-- has index numbers--accept null
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue3);

        int num=queue3.poll();
        System.out.println(num);
        System.out.println(queue3);

        System.out.println("-----------------");

        List<Integer> list=new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));

        ((LinkedList)list).poll();//FIFO

        System.out.println(queue3);

    }
}
