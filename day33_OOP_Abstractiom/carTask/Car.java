package day33_OOP_Abstractiom.carTask;

import java.time.LocalDate;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    protected final void stop(){
        System.out.println("Press the brake to stop "+getMake()+" "+getModel());
    }

    public abstract void start();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        if (year<1886){
            System.err.println("Invalid year. Year cannot be less than 1886!");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price. Price cannot be negative or zero!");
            System.exit(1);
        }
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
