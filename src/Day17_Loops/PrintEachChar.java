package Day17_Loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String str = "java is great language"; // ---length(); --- > 4
        //            0123


        System.out.println(str.charAt(0));  // j
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println("-------------");
        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));

        }
    }
}
