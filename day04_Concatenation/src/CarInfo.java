public class CarInfo {
    public static void main(String[] args) {

        int year = 2018,
                miles = 50_000,
                price = 19_000;

        String make = "Toyota",
                model = "Camry",
                color = "Red";

        System.out.println("Car information is:\n\t"+year+" "+make+" "+model+", "+miles+" miles, "+color+", $"
                +price+".");
    }
}
