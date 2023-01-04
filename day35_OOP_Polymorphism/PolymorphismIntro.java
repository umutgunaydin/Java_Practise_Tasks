package day35_OOP_Polymorphism;

import day31_methodOverriding.shape_methodOverriding.Circle;
import day33_OOP_Abstractiom.carTask.Honda;
import day33_OOP_Abstractiom.employeeTask.Developer;
import day33_OOP_Abstractiom.employeeTask.Employee;
import day34_OOP_AbstarctionContinue.animalTask.*;
import day34_OOP_AbstarctionContinue.transportationTask.Audi;
import day34_OOP_AbstarctionContinue.transportationTask.Car;
import day34_OOP_AbstarctionContinue.transportationTask.Electric;
import day34_OOP_AbstarctionContinue.transportationTask.Tesla;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("max", "husky", "medium", "white", 'm', 4);
        Cat cat = new Cat("max", "husky", "medium", "white", 'm', 4);

        Animal[] animals = {dog, cat};// this is polymorphism

        // parents reference to all the child objects
        Animal dog2 = new Dog("max", "husky", "medium", "white", 'm', 4);
        // but we can only use the parent's methods not the child's.

        System.out.println("---------------------------------");

        String str = "java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;

        Circle circle = new Circle(4);
        Honda honda = new Honda("pilot", "black", 2020, 100000);

        Object[] objects = {str, n, r, d, circle, honda};

        Object obj = new Developer("lucy", "a1", "java dev", 34, 100000, 'f', "java");
// by this way we cannot call the methods of child


        Employee developer = new Developer("lucy", "a1", "java dev", 34, 100000, 'f', "java");
        developer.work();
        // but if both has same method it runs the method of child

        System.out.println("----------------------");

        Car car = new Tesla("tesla", "y", "white", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;
        boolean isElectiricCar = car instanceof Electric;

        System.out.println(isTesla);
        System.out.println(isAudi);
        System.out.println(isElectiricCar);


    }
}
