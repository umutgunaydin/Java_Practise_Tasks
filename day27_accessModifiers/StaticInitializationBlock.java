package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;


    static {//it is executed automatically
        a=100;
        b=20.5;
        c="java";
    }

}
