package day06_ifStatements;

public class GradeLevel2 {
    public static void main(String[] args) {

        int gradeLevel = 2;
        String result = "";//temporary value

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            result = "Elementary School";
        }
        if (gradeLevel > 5 && gradeLevel <= 8) {
            result = "Middle School";
        }
        if (gradeLevel > 9 && gradeLevel <= 12) {
            result = "High School";
        }
        if (gradeLevel > 12 && gradeLevel <= 16) {
            result = "College";
        }
        if (gradeLevel > 16 && gradeLevel <= 18) {
            result = "Grad School";
        }
        System.out.println(result);
    }
}
