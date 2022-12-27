package day26_constructors_statics;

public class IPhone {

    public static String brand = "Apple";
    public String model;
    public String color;
    public double price;
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;


    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //statics only accepts statics does not accept instances // we cannot use this keyword in statics
    public static void printOS(){// it can be usable without creating an object
        System.out.println("OS = " + OS);
    }


}
