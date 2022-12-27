package day25_constructors;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {

        Employee  employee1=new Employee("brooks",24,'m',"java developer",1000, LocalDate.of(2022,8,15));

        System.out.println(employee1);




    }
}
