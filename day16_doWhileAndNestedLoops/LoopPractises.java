package day16_doWhileAndNestedLoops;

import java.util.Scanner;

public class LoopPractises {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println(i+".Hello! by For Loop");
        }

        System.out.println("----------------------------");

        int j=1;
        while (j<6){
            System.out.println(j+".Hello! by While Loop");
            j++;
        }

        System.out.println("------------------------");

        Scanner input=new Scanner(System.in);

        System.out.println("enter score:");
        int score =input.nextInt();

        while(score>100||score<0){
            System.out.println("invalid score. please reenter your score:");
            score=input.nextInt();
        }

        if (score>=60){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        input.close();

    }
}
