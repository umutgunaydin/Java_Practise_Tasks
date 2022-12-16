package day04_concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 45,
                weeklyHours = 40;
        double stateTaxRate = 0.06,
                federalTaxRate = 0.255;

        //------------------------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: "+salaryAfterTax);

        System.out.println("------------------------------------------------");



    }
}
