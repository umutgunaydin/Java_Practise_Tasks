package day36_OOP_PolymorphismContinue;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;


    public double calcCost() {
        double totalCost = size * numberOfCheeseTopping * numberOfPepperoniTopping;
        return totalCost;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) {
            System.out.println("Invalid object: " + obj);
            System.exit(1);
        }

        Pizza givenPizza=(Pizza) obj;

        if (this.size == givenPizza.getSize() && this.numberOfPepperoniTopping == givenPizza.getNumberOfPepperoniTopping()
                && this.numberOfCheeseTopping == givenPizza.numberOfCheeseTopping) {
            return true;
        }
        return false;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
}
