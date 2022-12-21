package day15_branchingStatements;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter age:");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.err.println("invalid entry. please reenter your age:");
            age = input.nextInt();
        }

        System.out.println("enter country:");
        String country = input.nextLine();

        while (!(country.equalsIgnoreCase("usa"))) {
            System.err.println("invalid entry. please reenter your country:");
            country = input.nextLine();
        }

        if (age>=21){
            System.out.println("eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }

        input.close();



    }
}
