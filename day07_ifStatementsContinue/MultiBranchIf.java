package day07_ifStatementsContinue;

public class MultiBranchIf {
    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if (num > 0) {
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        } else {
            result = "zero";
        }

        System.out.println(num + " is " + result);

    }
}
