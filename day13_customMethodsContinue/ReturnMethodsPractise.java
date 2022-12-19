package day13_customMethodsContinue;

public class ReturnMethodsPractise {
    public static void main(String[] args) {

        System.out.println(isEven(15));
        System.out.println(isOdd(15));

        int maks=max(15,20);
        System.out.println("maks = " + maks);
    }

    public static boolean isOdd(int number){
        boolean isOdd=false;
        if (number%2==1){
               isOdd=true;
        }
        return isOdd;
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }

    public static int max(int number1,int number2){
        int max=number2;
        if (number1>number2){
            max=number1;
        }
        return max;
    }


}
