package day18_memoryAllocation_garbageCollector;

import day17_customClassIntro.Employee;

class Car {

    public String color;
    public String brand;
    public String model;
    public int year;
}


public class MemoryAllocation {
    public static void main(String[] args) {
        int a = 100;//stack

        Car car = new Car();
        // stack    heap

        System.out.println("---------------------");

        Employee employee1=new Employee();
        Employee employee2=employee1;

        employee1.setInfo("brook",32,'f',"java dev.",435234,"s34");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("--------------------");

        String batch1=new String("java");// heap-String pool
        String batch2=batch1;
        String batch3=batch2;
        //there is just one memory allocation
    }

    public static void method1() {
        int b = 200;//stack
    }

    public static void method2() {
        String c = "hello";//heap because String is a class
        // stack    heap(string pool)

        String d = new String("hello");
        //  stack               heap
    }

}
