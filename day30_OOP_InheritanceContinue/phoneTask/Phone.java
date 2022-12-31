package day30_OOP_InheritanceContinue.phoneTask;

public class Phone {
    private String brand, model, size, color;
    private double price;


    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +// gives exact class name
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " is calling "+phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand()+" is texting to " + phoneNumber);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("white") || color.equalsIgnoreCase("pink") || color.equalsIgnoreCase("blue")
                || color.equalsIgnoreCase("black") || color.equalsIgnoreCase("gold")) {
            this.color = color;
        } else {
            System.err.println("Invalid color!");
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.err.println("Invalid price!");
            System.exit(1);
        }
    }
}
