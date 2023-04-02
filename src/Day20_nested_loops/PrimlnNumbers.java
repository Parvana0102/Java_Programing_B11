package Day20_nested_loops;

public class PrimlnNumbers {
    public static void main(String[] args) {

        /*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */

        int num2  = 46;
        int count2 = 0;
        for (int j = 1; j <= num2; j++) {

            if (num2  % j  == 0) {
                count2++;
            }

        }


        if (count2 == 2) {
            System.out.println( num2 + " is prime number ");

        } else {
            System.out.println( num2 + " is  NOT prime number ");

        }
    }
}
