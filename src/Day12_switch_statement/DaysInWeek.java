package Day12_switch_statement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int dayNumber = input.nextInt();

        switch (dayNumber){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("It is Weekend");
                break;
            default:
                System.out.println(dayNumber + " is invalid");
        }

    }
    }


