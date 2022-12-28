package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate=200;

    protected  static  int protectedData=300;

    static int defaultData=400;// for default we don't use it

    private static int privateData=500;

    public AccessModifiers(){// here  we can use all the access modifiers but, we cannot reach each one from every state
    }

    public static void publicMethod(){
        System.out.println("public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");
    }

    static void defaultMethod(){
        System.out.println("default");
    }

    private static void privateMethod(){
        System.out.println("private");
    }


    public static void main(String[] args) {

        System.out.println(publicDate);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();

    }



}
