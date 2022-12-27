package day26_constructors_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // studentGroup has a student ----  relationship

    public  String groupName;
    public  int groupId;
    public ArrayList<Student> students=new ArrayList<>();


    public void addStudent(Student student){// adds one student object
        students.add(student);
    }

    public void addStudent(String name,int age, char gender, String id){// takes name age ...creates student object
        Student student=new Student(name,age,gender,id);
        students.add(student);
    }

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void removeStudent(String id){// takes id and removes the student object with specified id
        students.removeIf(p -> p.id.equals(id));
    }

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
