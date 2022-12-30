package day28_OOP_Encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {

        Student student = new Student();
        //student.age=-200;

        //System.out.println(student.getAge());

        student.setAge(21);

        System.out.println(student.getAge());

        student.setName("Aaron");

        System.out.println(student.getName());

    }
}
