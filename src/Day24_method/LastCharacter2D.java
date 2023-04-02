package Day24_method;

public class LastCharacter2D {
    public static void main(String[] args) {

        String [][] info = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        // info[0].length --- > 3
        // info[1].length --- > 4
        // info[2].length --- > 2
        // info.length ----- > 3


        for ( String [] eachArr : info) {

            for ( String eachWord  : eachArr) {

                System.out.print(eachWord.substring(eachWord.length()-1));
                //System.out.println(eachWord.charAt(eachWord.length()-1));   // This is the other way to access the last character of each word
            }
            System.out.println();
        }
    }
}
