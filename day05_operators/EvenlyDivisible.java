package day05_operators;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        boolean isDivisibleBy2 = 65 % 2 == 0;
        boolean isDivisibleBy3 = 65 % 3 == 0;
        boolean isDivisibleBy5 = 65 % 5 == 0;
        boolean isDivisibleBy6 = isDivisibleBy2 && isDivisibleBy3;// this is the logic behind math!!!

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);
        System.out.println(number + " is divisible by 6: " + isDivisibleBy6);


    }
}
