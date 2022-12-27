package day26_constructors_statics;

public class TestIPhoneObjects {

    public static void main(String[] args) {
        IPhone iPhone=new IPhone("iPhone12","black",1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        System.out.println(iPhone);

        System.out.println(IPhone.brand);// static , as we see no need to create an object
        System.out.println(IPhone.OS);
        System.out.println(IPhone.madeIn);



    }



}
