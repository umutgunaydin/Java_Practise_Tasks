package day30_OOP_InheritanceContinue.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("12", "large", "black", 1000);
        Samsung samsung = new Samsung("s22", "medium", "white", 1100);
        Nokia nokia = new Nokia("brick", "small", "pink", 50);

        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);

        iPhone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        iPhone.faceTime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println("---------------------");

        System.out.println(iPhone);




    }
}
