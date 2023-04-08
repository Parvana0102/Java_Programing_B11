package my_util;

public class StringUtil {

/**
 * This method accepts a String parametr in a reverse format
 *
 *Ex:
 *  input : Loop
 *  Output: Pool
 *
 */
    public static  String reverseStr(String str) {

                String reversed = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }

                return reversed;
            }

            /**
             * This method accepts a String parametr and puts in a format
             * Ex:
             * First letter Upper case and rest in lower case
             * <p>
             * Then return a String in a formatted way .
             */

            public static String fixFormat(String str) {
                String fixed =str.trim();
                fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                return fixed;


            }
            /**
             *For duplicate String
             */

            public static String duplicateString (String word) {
                String duplicate = "";
                // outer loop is the letter we will use to check the rest of the word
                // we start with the first A and then want to check all the letters after A to see if there is another
                // first letter is A -> we assign i = 0 to start

                for (int i = 0; i < word.length(); i++) {
                    // we use the inner loop to check the letters that come after A
                    // start checking using index j = i + 1 -> this is the letter after A because i = A

                    for (int j = i + 1; j < word.length(); j++) {
                        // if the letter at index i = letter at index j then we found a duplicate and add the letter to duplicateString to store
                        if (word.charAt(i) == word.charAt(j) && !duplicate.contains("" + word.charAt(i))) {
                            duplicate += word.charAt(i);
                        }
                    }
                }
                return duplicate ;
            }

            /**
             * This method accept String and char
             * And return how many times that char exist in the String
             */
            public static int frequencyOfCharacter(String word, char letter) {
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter) {
                        count++;
                    }
                }
                return count;
            }

            /*
             * And returns only unique characters as a String
             */
            public static String uniqueCharacters(String word) {
                String checked = "";
                String unique = "";
                for (int i = 0; i < word.length(); i++) {
                    if (!checked.contains(word.charAt(i) + "")) {
                        int count = StringUtil.frequencyOfCharacter(word, word.charAt(i));
                        checked += word.charAt(i);
                        if (count == 1) {
                            unique += word.charAt(i);
                        }
                    }
                }
                return unique;
            }
        }

