package day13_customMethodsContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        int total = sum(15, 82);
        System.out.println("total = " + total);

        int result = square(6);
        System.out.println("result = " + result);
    }

    public static int sum(int number1, int number2) {

        int total = number1 + number2;
        return total;
    }

    public static int square(int number) {

        int square = number * number;
        return square;
    }

}
