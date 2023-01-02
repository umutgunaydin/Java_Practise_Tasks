package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person = new Person("daniel", 'M', LocalDate.of(1991, 2, 3));

        System.out.println(person);
        person.breath();

        System.out.println("-----------------------");

        Employee employee = new Employee("daniel", 'M', LocalDate.of(1991, 2, 3), "java dev", 100000);

        System.out.println(employee);
        employee.breath();


    }
}
