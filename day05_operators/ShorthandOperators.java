package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        a = 30;
        System.out.println(a);

        System.out.println("---------------------");

        double balance = 100;
        System.out.println("balance = " + balance);
        balance += 1000;//balance=100+1000; both are same
        System.out.println("balance = " + balance);

        balance -= 500;
        System.out.println("balance = " + balance);

        balance *= 2;
        System.out.println("balance = " + balance);

        balance /= 5;
        System.out.println("balance = " + balance);

        balance %= 100;
        System.out.println("balance = " + balance);
    }
}
