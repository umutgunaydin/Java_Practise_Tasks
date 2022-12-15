public class SalaryCalculator {
    public static void main(String[] args) {

        String name = "Joshua";

        int hourlyRate = 40,
                weeklyHours = 45;

        int salary = hourlyRate * weeklyHours * 52;

        System.out.println("Given Data:");
        System.out.println("\t\tname = " + name);
        System.out.println("\t\thourlyRate = " + hourlyRate);
        System.out.println("\t\tweeklyHours = " + weeklyHours);
        System.out.println("Output:\n\tHello "+name+", your salary is $"+salary+".");

    }
}
