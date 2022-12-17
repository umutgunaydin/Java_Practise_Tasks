package day07_ifStatementsContinue;

public class GradeReport {
    public static void main(String[] args) {
        int score = 98;
        String result = "Your grade is: ";

        if (score > 79) {
            result += "A";
        } else if (score > 69) {
            result += "B";
        } else if (score > 59) {
            result += "C";
        } else if (score > 49) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);

    }
}
