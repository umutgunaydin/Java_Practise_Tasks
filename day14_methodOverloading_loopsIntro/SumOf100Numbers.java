package day14_methodOverloading_loopsIntro;

public class SumOf100Numbers {
    public static void main(String[] args) {

        int result=0;

        for (int i=1;i<=100;i++){
            result+=i;
        }
        System.out.println("result = " + result);

    }
}
