package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public static final int numberOfHeads;

    static {
        numberOfHeads = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;// because of being final it is checked here in constructor
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {

    }

    public void drink() {

    }

    public void sleep() {

    }

    public final void breath() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
