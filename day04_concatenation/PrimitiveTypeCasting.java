package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        //-------------implicit castings-------------
        //   smaller to larger
        byte a = 15;
        short b = a;
        System.out.println("b = " + b);

        long d = 3000L;
        float f = d;
        System.out.println("f = " + f);

        //----------explicit casting----------
        // larger to smaller
        int x = 100;
        byte y = (byte) x;
        System.out.println("y = " + y);

        float z = 20.8F;
        short q =(short) z; // this will ignore the decimal part
        System.out.println("q = " + q);




    }
}
