package Day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int number =  input.nextInt();


        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Your number is not Fizz, Buzz or FizzBuzz: " + number );
        }
    }
}
