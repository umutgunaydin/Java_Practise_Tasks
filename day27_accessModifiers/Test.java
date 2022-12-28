package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("------------------");

        System.out.println(AccessModifiers.publicDate);//  public is accessible within same project
        System.out.println(AccessModifiers.protectedData);// protected is accessible within same package and child of this class can access
        System.out.println(AccessModifiers.defaultData);//  default is accessible within the same package
        //System.out.println(AccessModifiers.privateData);// private is not accessible within the same package only for within the class

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
    //    AccessModifiers.privateMethod();  // is not accessible



    }
}
