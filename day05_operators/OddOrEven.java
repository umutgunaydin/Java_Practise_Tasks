package day05_operators;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 20;

        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 == 1;

        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);

        System.out.println(number+" is an even number: "+isEven);
        System.out.println(number+" is an odd number: "+isOdd);

    }
}
