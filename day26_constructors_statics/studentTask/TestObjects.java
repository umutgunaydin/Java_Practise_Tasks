package day26_constructors_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("yusuf",21 , 'm', "a16");
        Student student2 = new Student("glenio",24 , 'm', "b34");
        Student student3 = new Student("sumeyye", 22, 'f', "c56");
        Student student4 = new Student("mehmet", 25, 'm', "d43");
        Student student5 = new Student("sebastian", 23, 'm', "e27");

        StudentsGroup studentsGroup1=new StudentsGroup("java turtles",1);
        studentsGroup1.addStudent(student1);
        studentsGroup1.addStudent(student2);
        studentsGroup1.addStudent(student3);
        studentsGroup1.addStudent(student4);
        studentsGroup1.addStudent(student5);

        System.out.println(studentsGroup1);

        studentsGroup1.addStudent("brooks",34,'m',"f32");

        System.out.println(studentsGroup1);

        studentsGroup1.removeStudent("d43");

        System.out.println(studentsGroup1);

        System.out.println("-------------------");

        for (Student each : studentsGroup1.students) {
            System.out.println(each);
        }


    }
}
