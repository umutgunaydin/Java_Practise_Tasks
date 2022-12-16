package day05_operators;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 3);//multiplication will be executed first like in math//11

        System.out.println(7 + 3 - 2 / 2);//9

        System.out.println(-5 + 3);//-2

        System.out.println(!false == true);//true

        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                  true  == false && ...................
        //                        false    &&        false       ||  false
        //                                false                || false
        //                                              false

        int a = 20;
        a += 10 + 2 * 3;
        //a +=10+6;
        //a+=16;
        //a=36;
    }
}
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! PRECEDENCE TABLE IS SO IMPORTANT !!!!!!!!!!!!!!!!!!!!!