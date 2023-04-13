package day07_relation_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int age  = 13;

        boolean isKid = age <= 13;  // value has to be tru or false ALWAYS
        System.out.println("You are a kid. Correct? " + isKid);

        System.out.println();

        boolean isAdult = age >= 30;
        System.out.println("You are an adult. Correct? " + isAdult);
    }

}
