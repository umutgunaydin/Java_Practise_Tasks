package day05_operators;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 220;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        // boolean isZero = number == 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);


    }
}
