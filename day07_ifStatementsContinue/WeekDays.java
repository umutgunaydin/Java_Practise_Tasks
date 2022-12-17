package day07_ifStatementsContinue;

public class WeekDays {
    public static void main(String[] args) {
        int number=5;
        String result="";

        if (number==1){
            result="monday";
        }else if (number==2){
            result="tuesday";
        }else if (number==3){
            result="wednesday";
        }else if (number==4){
            result="thursday";
        }else if (number==5){
            result="friday";
        }else if (number==6){
            result="saturday";
        }else {
            result="sunday";
        }
        System.out.println("result = " + result);
    }
}
