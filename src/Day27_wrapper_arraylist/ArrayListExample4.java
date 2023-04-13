package Day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample4 {

    public static void main(String[] args) {
        ArrayList<Character> lowerCaseLetters = new ArrayList<>();

        // Fill the ArrayList with letters from A to Z
        for (char i = 'a'; i <= 'z'; i++) {
            lowerCaseLetters.add(i);
        }
        System.out.println(lowerCaseLetters);


    }
}

