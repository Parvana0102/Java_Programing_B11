package Day16_loops;

public class MethodChaining {

    public static void main(String[] args) {

        String word = "     Java is a great language       ";

        //"     Java is a great language       ";
        // 01234567............
        // 0
        String word2 = word.trim().substring(0, word.indexOf(" ")).toLowerCase().toUpperCase();
        System.out.println(word2);

        //"Java is a great language"
        // 01234567.............
        //     4
        String word3 = word.trim().substring(0, word.trim().indexOf(" ")).toLowerCase().toUpperCase();
        System.out.println(word3);



    }
}
