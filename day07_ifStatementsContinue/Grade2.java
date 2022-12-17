package day07_ifStatementsContinue;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "Excellent";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println("result = " + result);
    }
}
