package day15_branchingStatements;

import java.util.Scanner;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter word:");
        String word = input.next();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (result.contains(""+word.charAt(i))) {
                continue;
            }
            result += word.charAt(i);
        }
        System.out.println("result = " + result);

        System.out.println("-----------------------------------------");

        int sum=0;
        for (int i = 50; i <101 ; i++) {
            if (i%2==1){
                continue;
            }
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
