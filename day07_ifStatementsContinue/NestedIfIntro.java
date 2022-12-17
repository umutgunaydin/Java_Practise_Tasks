package day07_ifStatementsContinue;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score=955;
        String result="";

        if (score>=0&&score<=100){
            if (score>=60){
                result="passed";
            }else {
                result="failed";
            }

        }else {
            result="invalid score";
        }
        System.out.println("result = " + result);
    }
}
