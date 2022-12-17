package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int number=input.nextInt();
        String result="";
        
        switch (number){
            case 1:
                result="Monday";
                break;
            case 2 :
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
            default:
                result="Invalid day";
                break;
                
        }
        System.out.println("result = " + result);

        input.close();

    }
}
