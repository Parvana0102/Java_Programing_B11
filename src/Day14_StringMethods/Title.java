package Day14_StringMethods;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name, with titles: ");

        String nameAndTitle = input.nextLine();  // MR LastName  --  Mr LastName  --  mr LastName

        //nameAndTitle = nameAndTitle.toLowerCase();  // We are trying to have one version for different version inputs.


           if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }


    }
}
