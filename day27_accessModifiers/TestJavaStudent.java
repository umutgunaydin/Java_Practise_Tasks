package day27_accessModifiers;

public class TestJavaStudent {
    public static void main(String[] args) {

        System.out.println(JavaStudent.schoolName);// this is the optimal way

        JavaStudent javaStudent1=new JavaStudent("brooks",23,'m');

        System.out.println(javaStudent1);

        System.out.println(javaStudent1.schoolName);// this is not the better way
        System.out.println(javaStudent1.secretCode);

    }
}
