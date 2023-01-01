package day31_methodOverriding;

 class A {
     public int a=100; // this field will hide because of same variable at the child class
        }


public class FieldHiding extends A{

     public int a=300;

    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);

    }

}
