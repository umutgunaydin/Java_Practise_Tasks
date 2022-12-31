package day30_OOP_InheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student=new Student("lucy",'f', LocalDate.of(1990,5,16),'a',"a01");

        President president=new President("daniel",'m',LocalDate.of(1980,12,1),LocalDate.of(2020,1,1));

        Teacher teacher=new Teacher("emily",'f',LocalDate.of(1985,11,1),"math teacher","c1",95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("-----------------------");

        student.eat("baklava");
        teacher.drink("water");
        president.drink("coffee");

    }



}
