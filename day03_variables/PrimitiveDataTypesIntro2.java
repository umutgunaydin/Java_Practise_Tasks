package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main(String[] args) {

        char a = 'a'; // ascıı table - single character
        // uses single quote - memory 2 bytes
        // values from 0 to 65535

        char b = 65; // we can use the number of character

        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------");

        int sum = 'A' + 'B'; //it uses the number of char
        System.out.println(sum);

        System.out.println("---------------------");

        boolean r = true; //it takes true or false
        //memory 1 bit
        boolean t = 5 < 6;
        System.out.println(t);
    }
}
