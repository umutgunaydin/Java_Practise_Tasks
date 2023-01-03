package day33_OOP_Abstractiom.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

        Honda honda=new Honda("pilot","black",2019,35000);
        Audi audi=new Audi("q6","silver",2020,36000);
        Tesla tesla=new Tesla("model y","blue",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("----------------");

        honda.start();
        audi.start();
        tesla.start();



    }
}
