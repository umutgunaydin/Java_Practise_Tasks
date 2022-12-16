package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 1;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has30Days && !has28Days;

        String result = "";

        if (has28Days) {
            result = "28 days";
        }
        if (has30Days) {
            result = "30days";
        }
        if (has31Days) {
            result = "31 days";
        }
        System.out.println(result);
    }
}
