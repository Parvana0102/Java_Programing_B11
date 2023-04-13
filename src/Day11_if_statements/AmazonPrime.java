package Day11_if_statements;

import com.sun.tools.javac.Main;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 300;
        boolean isPrime = false;

        if (isPrime) {
            System.out.println("Eligible for 2 day shipping");
        } else {

            if (price >= 500) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");

                System.out.println("Your total is: " + (price + 3.99) );
            }


        }
    }

}
