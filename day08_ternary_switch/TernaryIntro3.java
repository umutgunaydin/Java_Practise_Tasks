package day08_ternary_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score=130;

        String result=(score>=0&&score<=100)? //!!!!!!!!NESTED TERNARY!!!!!!!!!!!
                (score>=60)?"passed":"failed"

                :"invalid score";

        System.out.println("result = " + result);

        System.out.println("---------------------");

        int n=7;

        String day=(n>=1&&n<=7)?
                day=(n==1)?"monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday"
                        :(n==6)?"saturday":"monday"
                :"invalid day";

        System.out.println("day = " + day);
    }
}
