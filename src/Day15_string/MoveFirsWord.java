package Day15_string;

import java.util.Scanner;

public class MoveFirsWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Java is a fun language
        //0123456789......
        // 1 - get index of first space
        int firstIndexOfSpcae = sentence.indexOf(" ");   // 6
        // 2 - get the firsd word
        String beginning = sentence.substring(0, firstIndexOfSpcae );
        // 3 - second part of the sentence
        String secondPart = sentence.substring(firstIndexOfSpcae+1);
//        String secondPart2 = sentence.substring(firstIndexOfSpcae).trim();



        System.out.println(beginning);
        System.out.println(secondPart);

        System.out.println(secondPart + " " + beginning);
    }
}
