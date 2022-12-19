package day14_methodOverloading_loopsIntro;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        System.out.println(sumOfNumbers(5,6,2,3));


    }

    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return sumOfNumbers(num1,num2)+num3;
    }

    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return sumOfNumbers(num1,num2,num3)+num4;
    }


}
