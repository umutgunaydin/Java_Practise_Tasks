package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("constructor");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        new StaticBlock();
        new StaticBlock();
    }



}
