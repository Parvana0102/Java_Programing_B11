package Day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<String>();
        items.add("Hat");
        items.add("Shoes");
        items.add(1, "Jacket");
        items.add(0, "Towel");
        items.add(2, "Car");

        // Print the ArrayList
        System.out.println("ArrayList after adding elements: " + items);
    }
}

