package day08_ternary_switch;

public class SwitchIntro3 {
    public static void main(String[] args) {

        int score = 98;
        String result = "Your grade is: ";

        if (score > 79) {
            result += "A";
        } else if (score > 69) {
            result += "B";
        } else if (score > 59) {
            result += "C";
        } else if (score > 49) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);

//when you want to do this example with switch you need to attempt 100 cases
// that is why in such scenarios we use if statements
    }
}
