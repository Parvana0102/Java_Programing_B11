package Day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {
        ArrayList<Character> upperCaseLetters = new ArrayList<>();

        // Fill the ArrayList with letters from A to Z
        for (char i = 'A'; i <= 'Z'; i++) {
            upperCaseLetters.add(i);
        }
        System.out.println(upperCaseLetters);


    }
}


