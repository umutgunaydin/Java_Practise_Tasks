package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number=100;
        String result="";

        /*
        if (number>0){
            result="positive";
        }else if (number<0){
            result="negative";
        }else {
            result="zero";
        }
         */

        result=(number>0)?"positive":(number<0)?"negative":"zero";
        System.out.println("result = " + result);

        System.out.println("-------------------------");

        int n=1;

        String day="";

        day=(n==1)?"monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday"
                :(n==6)?"saturday":"monday";

        System.out.println("day = " + day);

        System.out.println("--------------------------------------");

    }
}
