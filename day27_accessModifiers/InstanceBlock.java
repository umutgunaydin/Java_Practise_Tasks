package day27_accessModifiers;

public class InstanceBlock {

    {  // it runs before the constructor
        System.out.println("instance block");
    }
    public InstanceBlock(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock();
        new InstanceBlock();


    }

}
