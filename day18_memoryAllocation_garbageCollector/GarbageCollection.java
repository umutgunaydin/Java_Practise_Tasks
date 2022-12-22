package day18_memoryAllocation_garbageCollector;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1="java";
        s1=null;//eligible for garbage collection

        System.out.println(s1);

        //System.out.println(s1.toUpperCase());

        System.out.println("-------------------------");

        String a="";//allocated
        String b=null;//does not exist

        System.out.println("-------------------------");

        String str1="python";//eligible for garbage collector
        str1="java";
        System.out.println(str1);

    }
}
