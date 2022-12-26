package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate birthday;






    public void setInfo(String name, int age, char gender, LocalDate birthday) {
        this.name = name;
        this.age = LocalDate.now().getYear()-birthday.getYear();
        this.gender = gender;
        this.birthday = birthday;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
