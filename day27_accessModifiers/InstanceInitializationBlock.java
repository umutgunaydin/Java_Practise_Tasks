package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    { // by default, it sets these // it is not the best practise we use constructor rather than this
        name="james";
        age=20;
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1=new InstanceInitializationBlock();
        InstanceInitializationBlock obj2=new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }

}
