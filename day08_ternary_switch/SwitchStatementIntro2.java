package day08_ternary_switch;

public class SwitchStatementIntro2 {
    public static void main(String[] args) {

        int n = 5;

        String day = "";

        switch (n) {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                day = "invalid day";

        }
        System.out.println("day = " + day);

    }
}
