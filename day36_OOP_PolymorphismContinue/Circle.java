package day36_OOP_PolymorphismContinue;

public class Circle {

    private double radius;

    public final static double PI = 3.14;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if (this.radius == ((Circle) obj).radius) {
            return true;
        }
        return false;
    }
}
