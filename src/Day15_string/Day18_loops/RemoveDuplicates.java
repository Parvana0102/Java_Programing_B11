package Day15_string.Day18_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "abcaabcaaaaaaadaaaaaaaaaa";
        String unique = "";

        for (int i = 0; i < word.length() ; i++) {

            if (!unique.contains("" + word.charAt(i))){  // 'a' -- > ("" + 'a') ---- ? "a"
                unique += word.charAt(i);
            }


        }

        System.out.println(unique);
    }
}
