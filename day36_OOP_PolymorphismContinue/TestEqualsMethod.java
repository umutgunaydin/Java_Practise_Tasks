package day36_OOP_PolymorphismContinue;

public class TestEqualsMethod {
    public static void main(String[] args) {

        Circle circle1=new Circle(5);
        Circle circle2=new Circle(5);

        System.out.println(circle1==circle2);//false because these are diff objects

        System.out.println(circle1.equals(circle2));

        System.out.println("------------------");

        IPhone iPhone1=new IPhone("apple","12","medium","black",900);
        IPhone iPhone2=new IPhone("apple","12","medium","black",900);

        System.out.println(iPhone1.equals(iPhone2));


    }
}
