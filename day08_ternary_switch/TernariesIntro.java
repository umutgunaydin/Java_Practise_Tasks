package day08_ternary_switch;

public class TernariesIntro {
    public static void main(String[] args) {

        int score=85;
        String result="";

        if (score>=60){
            result="passed";
        }else{
            result="failed";
        }
        System.out.println("result = " + result);

        System.out.println("----------------------------------");

        String result2=(score>=60)?"passed":"failed";// This is ternary!!!!!!!!!!!!!!!!!!!!
        System.out.println("result2 = " + result2);

        System.out.println("----------------------------");

        int age=34;
        /*
        String r;
        if (age>=31){
            r="eligible";
        }else {
            r="not eligible";
        }*/

        String result3=(age>=211)?"eligible":"not eligible";
        System.out.println(result3);

    }
}
