package day36_OOP_PolymorphismContinue;

public class Square {

    private double side;


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            System.err.println("Invalid Object");
            System.exit(1);
        }
        if (this.side == ((Square) obj).side) {
            return true;
        }
        return false;
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
