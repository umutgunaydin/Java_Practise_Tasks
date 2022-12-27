package day26_constructors_statics;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car("bmw");
        System.out.println(car1);

        Car car2=new Car("audi","q4");
        System.out.println(car2);

        Car car3=new Car("toyota","camry",2021);
        System.out.println(car3);

        Car car4=new Car("honda","accord",2020,30000);
        System.out.println(car4);

        Car car5=new Car("ford","fiesta",2012,120000,"black");
        System.out.println(car5);




    }


}
