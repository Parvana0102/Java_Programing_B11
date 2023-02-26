package day07_relation_operators;

public class SalaryCalculator {
    public static void main(String[] args) {


        double salary = 1_000_00,
           stateTaxRate = 0.08,
               federalTaxRate = 0.21;


        double stateTax, federalTax, totalTax, salaryAfterTax;


           stateTax =salary * 0.08; // %8
           federalTax =salary * 0.21; //%21

        totalTax = stateTax + federalTax;
        salaryAfterTax = salary -totalTax;



    }
}
