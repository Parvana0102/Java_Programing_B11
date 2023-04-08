package my_util;

import java.util.Arrays;

public class ArrayUtil {

        /**
         * This method made by Loopcamp Batch#1
         * The method accepts a String and returns the reversed String
         */
//    public static String reverseStr(String str) {
//
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        return reversed;
//    }
//---------------------------------------------------------------------------
        /**
         * Array Unique character only
         */
        public static String uniqueCharacters (String word){
        String[] arr = word.split("");
        String unique1 = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                unique1 += arr[i];
            }
        }

        return unique1;
    }
//-----------------------------------------------------------------------------
        /**
         *  Return an array with the given number added to the end of the array
         *
         *
         */

        public static int[] addToArr ( int number, int ...arr){
        int[] arr2 = Arrays.copyOf(arr, arr.length + 1);
        arr2[arr2.length - 1] = number;
        return arr2;
    }
        /**--------------------------------------------------------------------
         * method accept Array
         * And will return the minimum number
         */
        public static int minNumInArr ( int[] arr){

        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

        /**-------------------------------------------------------------------
         * method accept Array
         * And will return the minimum number with SORT
         */

        public static int minNumInArrWithSort ( int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

        /*
    Contains
    create a method that will accept an int array and an int number. Check and return if the given number is in the array.
    */
        public static boolean containArr ( int[] arr, int num ){

        for (int each : arr) {
            if (each == num) {
                return true;
            }
        }
        return false;
    }


        /**
         *
         * This method accepts int array and a number
         * And retrns the index of the number in the array
         * If it does not exist, it returns -1
         */
        public static int indexOf ( int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

        /**
         *
         * This method accepts String array and a String
         * And retrns the index of the String in the array
         * If it does not exist, it returns -1
         */
        public static int indexOf (String[]arr, String word){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

        /**
         *
         * This method accepts int array and the int num
         * And returns the a new array with the num added at the end
         */
        public static int[] add ( int[] arr, int num){

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;

        return newArr;

    }

        /**
         *
         * This method accepts String array and the String word
         * And returns the new array with the word added at the end
         */
        public static String[] add (String[]arr, String word){

        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;

        return newArr;

    }

        /**
         *
         * This method accepts int number and the int array
         * And returns the new array with the number added at the beginning
         */
        public static int[] addElementBeginning ( int num, int ...arr){

        int[] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {

            newArr[i] = arr[i - 1];
        }
        newArr[0] = num;
        return newArr;
    }

        /**
         *
         * This method accepts String word and the String array
         * And returns the new array with the word added at the beginning
         */
        public static String[] addElementBeginning (String word, String ...arr){

        String[] newArr = new String[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {

            newArr[i] = arr[i - 1];
        }
        newArr[0] = word;
        return newArr;
    }
    }

