package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people={new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("daniel",25,'f', LocalDate.of(1989,2,25));


        ArrayList<Person> students=new ArrayList<>();
        students.addAll(Arrays.asList(people));


        //print name and birthday of each person
        for (Person student : students) {
            System.out.println(student.name+" : "+student.birthday);
        }

        //remove the persons whose age are older than 55
        students.removeIf(person -> person.age>55);
        System.out.println(students);




    }
}
