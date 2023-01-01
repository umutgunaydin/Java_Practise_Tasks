package day31_methodOverriding.shape_methodOverriding;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", side='" + getSide() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
