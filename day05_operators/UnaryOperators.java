package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(++x);//11
        System.out.println(x++);//10   passes it then changes
        int y = 15;

        System.out.println(--y);//14
        System.out.println(y--);//15

        int n = 30;
        int m = n++; //m=30 !!!

    }
}
