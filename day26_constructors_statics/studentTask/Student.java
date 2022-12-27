package day26_constructors_statics.studentTask;

public class Student {

    public String name;
    public int age;
    public char gender;
    public String id;

    public void study(){
        System.out.println(name+" is studying");
    }

    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
