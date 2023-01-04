package day36_OOP_PolymorphismContinue;

import day29_OOP_Inheritance.Animal;
import day29_OOP_Inheritance.Dog;
import day30_OOP_InheritanceContinue.phoneTask.Nokia;
import day30_OOP_InheritanceContinue.phoneTask.Phone;
import day33_OOP_Abstractiom.employeeTask.Developer;
import day33_OOP_Abstractiom.employeeTask.Employee;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = new Dog();// there is implicit type casting which is upcasting

        System.out.println("---------------------");

        Animal animal1 = new Dog();
        // we can use only the methods of parent in upcasting

        ((Dog) animal1).bark();// this is down casting by this way we can reach the methods of child

        Dog dog1=(Dog) animal1;// this reusable down casting
        dog1.bark();

        // there has to be is relationship between casted types

        System.out.println("---------------------------------");

        Phone phone=new Nokia("XR20","Small","blue",350);

        // in order to use the selfdefense() method this must be down casted

        Nokia nokia=(Nokia) phone;
        nokia.selfDefense();

        System.out.println("---------------------------");

        Employee employee=new Developer("lucy","a12","java dev",34,120000,'f',"java");

        System.out.println(((Developer) employee).getProgrammingLanguage());

    }
}
