public class SwapTwoVariables {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
