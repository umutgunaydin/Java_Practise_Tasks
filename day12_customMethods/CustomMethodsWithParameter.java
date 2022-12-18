package day12_customMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(5);

        System.out.println("------------------------");
        oddOrEven(100);

        System.out.println("----------------");
        eligibleToBuyAlcohol(25);

        System.out.println("-----------------------");
        gradeOfStudent(95);
    }

    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }

    }

    public static void eligibleToBuyAlcohol(int number){
        if (number>=21){
            System.out.println(number+" years is eligible to buy alcohol.");
        }else{
            System.out.println(number+" years is not eligible to buy alcohol.");
        }

    }

    public static void gradeOfStudent(int number){
        String result="";
        if (number>=90&&number<=100){
            result="A";
        } else if (number>=80) {
            result="B";
        } else if (number>=70) {
            result="C";
        } else if (number>=60) {
            result="D";
        } else if (number<60) {
            result="F";
        }else {
            result="invalid!";
        }
        System.out.println("Your grade is "+result);


    }
}
