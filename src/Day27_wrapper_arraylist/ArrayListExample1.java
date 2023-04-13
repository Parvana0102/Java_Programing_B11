package Day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample1 {
        public static void main(String[] args) {

            ArrayList<String> List= new ArrayList<String>();
            ArrayList list= new ArrayList<>();
            // Add elements to the ArrayList
            list.add("Iron Man");
            list.add("Spider Man");
            list.add("Thor");
            list.add("Captain America");
            list.add("Hawkeye");
            System.out.println(list);
            list.remove("Iron Man");

             System.out.println("ArrayList after removing the first index: " + list);

        }
    }

