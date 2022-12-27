package day26_constructors_statics;

public class ConstructorsCall2 {

    public ConstructorsCall2(){
        System.out.println("default");
    }

    public ConstructorsCall2(int a){
        this();
        System.out.println("int arg");
    }

    public ConstructorsCall2(String b){
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorsCall2 obj=new ConstructorsCall2();

        System.out.println("-----------------");

        ConstructorsCall2 obj2=new ConstructorsCall2(10);

        System.out.println("-------------------");

        ConstructorsCall2 obj3= new ConstructorsCall2("java");

    }

}
