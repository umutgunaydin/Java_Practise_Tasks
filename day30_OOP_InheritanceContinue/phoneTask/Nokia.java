package day30_OOP_InheritanceContinue.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defense");
    }


}
