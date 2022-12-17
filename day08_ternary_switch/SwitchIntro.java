package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade='A';

        String result="";

        switch (grade){
            case 'A':
                result="excellent";
                break;
            case 'B':
                result="great";
                break;
            case 'C':
                result="good";
                break;
            case 'D':
                result="passed";
                break;
            case 'F':
                result="failed";
                break;
            default:
                result="invalid score";//no need to give break
        }
        System.out.println("result = " + result);


    }
}
