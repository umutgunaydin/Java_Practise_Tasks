package day31_methodOverriding.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square=new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("---------------");

        Circle circle=new Circle(3.5);

        System.out.println(circle);


    }


}
