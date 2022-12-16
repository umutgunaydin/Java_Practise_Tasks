package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 45000;
        int creditScore = 700;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("--------------------------------------");

        String country = "Japan";
        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "Uk" || country == "Japan";
        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println("validAnswer = " + validAnswer);

        char grade='A';
        boolean passedTheExam=grade!='F';
        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println("--------------------------------------");
        System.out.println(!true);

        int score=65;
        boolean passed= score>=60;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
