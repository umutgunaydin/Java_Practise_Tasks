package day26_constructors_statics;

import static day27_accessModifiers.Data.*;// this is static import!!!!! for certain static member or * for all statics

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1=new Circle(3.5);
        Circle circle2=new Circle(5);

        System.out.println(circle1);
        System.out.println(circle2);

        Circle.printPi();
        System.out.println(Circle.pi);

        System.out.println(d);

    }
}
