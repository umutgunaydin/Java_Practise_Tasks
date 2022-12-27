package day26_constructors_statics;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi=3.14;


    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI="+pi+
                ", area="+calcArea()+
                ", perimeter="+calcPerimeter()+
                '}';
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }





}
