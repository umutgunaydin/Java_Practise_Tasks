package day30_OOP_InheritanceContinue.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        setGender(gender);
        setAge(LocalDate.now().getYear() - DOB.getYear());
        setDOB(DOB);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void drink(String drink){
        System.out.println(getName()+" is drinking "+drink);
    }
    public void eat(String food){
        System.out.println(getName()+" is eating "+food);
    }
}
