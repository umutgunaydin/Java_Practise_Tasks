package day27_accessModifiers;

public class JavaStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public JavaStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName="java school";
        secretCode="wooden spoon";
    }

    public String toString() {
        return "JavaStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
