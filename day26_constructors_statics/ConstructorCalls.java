package day26_constructors_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");
    }

    public ConstructorCalls(int a){
        this();// we have to use this() to call constructor in another one
        // it has to be in first step
        // it cannot be called in one constructor
        // it cannot be called other than constructor
        // cannot call itself
    }


    public static void main(String[] args) {




    }

    public static void method1(){
        System.out.println("method 1");
    }

    public static void method2(){
        method1();
        System.out.println("method 2");
    }

}
