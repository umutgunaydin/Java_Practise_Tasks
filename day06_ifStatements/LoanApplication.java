package day06_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {

        int salary=8000;
        int creditScore=350;

        String result="";

        if (salary>=45_000&&creditScore>=700){
            System.out.println("eligible for loan.");
            result="eligible";
        }else {
            System.out.println("Not eligible for loan.");
            result="Not eligible";
        }
        System.out.println("result = " + result);

    }
}
