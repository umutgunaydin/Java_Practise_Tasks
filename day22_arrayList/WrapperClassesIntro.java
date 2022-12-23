package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int a1=10;
        Integer a2=10;

        System.out.println("---------------------------");

        int b1=10;

        Integer b2=b1;//     !!!!!auto boxing!!!!!
        // it needs exact type


        char ch='a';
        Character ch1=ch;


        System.out.println("----------------------");


        Integer n1=30;
        int n2=n1;//     !!!!unboxing!!!!
        long n3=n1;
        double n4=n1;//no need to use exact type

        Character e1='a';
        char e2=e1;





    }
}
