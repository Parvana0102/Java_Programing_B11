package Day25_methods;

import java.util.Arrays;

public class MinNumlnArray {

    public static int minNumInArr(int[] arr) {

        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }
}

