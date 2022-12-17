package day07_ifStatementsContinue;

public class GradeLevel {
    public static void main(String[] args) {

        int grade=5;
        String result="";

        if (grade>=17){
            result="grad school";
        } else if (grade>=13) {
            result="College";
        } else if (grade>=9) {
            result="high school";
        } else if (grade>=6) {
            result="middle school";
        }else {
            result="elementary school";
        }
        System.out.println("result = " + result);
    }
}
