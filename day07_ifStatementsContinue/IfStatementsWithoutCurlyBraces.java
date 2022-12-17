package day07_ifStatementsContinue;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {

        int age=32;

        //only if the if statement has one command we can give up using curly braces
        if (age>=22) System.out.println("eligible");
        else System.out.println("not eligible");

        System.out.println("---------------------");

        //not using curly braces is not good practise

    }
}
