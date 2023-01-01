package day31_methodOverriding.shape_methodOverriding;

public class Circle extends Shape {

    private double radius;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    @Override
    public void draw() {
        super.draw();
        // code fragments......
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + getRadius() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
