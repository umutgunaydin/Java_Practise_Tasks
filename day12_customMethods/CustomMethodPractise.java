package day12_customMethods;

public class CustomMethodPractise {
    public static void main(String[] args) {

        maximumNumber(15,20);

    }

    public static void maximumNumber(double number1,double number2){
        double max=0;
        if (number1>number2){
            max=number1;
        } else if (number1<number2) {
            max=number2;
        }else {
            System.out.println("Numbers are equal");
        }
        System.out.println("Maximum number is "+max);

    }

}
