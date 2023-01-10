package day39_collections;// --Collections-- size is dynamic , supports non-primitive ONLY

import java.util.*;

public class ListDemo { // Lists-- has index number , allows duplicate
    public static void main(String[] args) {

        List<Integer> arrayList=new ArrayList<>(); //Array Based Class ==> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        List<Integer> linkedList=new LinkedList<>();// Node Based Class (Doubly linked list)==> add() addAll() remove() removeIf() retainAll() are faster
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("-----------------------------------------------");

        Vector<Integer> vector=new Vector<>(); // synchronized version of arrayList
        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);

        System.out.println("--------------------------");

        Stack<Integer> stack=new Stack<>(); // child class of vector -- LIFO last in first out pop()
        stack.add(100);
        stack.add(200);
        stack.add(300);









    }
}
