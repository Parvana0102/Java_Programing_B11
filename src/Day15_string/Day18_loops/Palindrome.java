package Day15_string.Day18_loops;

public class Palindrome {
    public static void main(String[] args) {


        String word = "abcba";   // .length(); --- > 5
        //             01234
        String revers = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            revers += word.charAt(i);
        }

        if (word.equals(revers)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("___________________");
        System.out.println(word.equals(revers) ? "Palindrome" : "Not Palindrome");
    }
}
