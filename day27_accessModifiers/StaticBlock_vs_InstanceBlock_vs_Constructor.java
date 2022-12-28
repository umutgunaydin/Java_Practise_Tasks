package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("constructor");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }


    public static void main(String[] args) {

        System.out.println("main method");

        StaticBlock_vs_InstanceBlock_vs_Constructor obj =new StaticBlock_vs_InstanceBlock_vs_Constructor();

        // execution flow is important

    }

}
