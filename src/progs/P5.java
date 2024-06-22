package progs;

import java.util.function.Consumer;
import java.util.function.Function;

public class P5 {

    public static void main(String[] args) {
        String input = "I am coding.";
        System.out.println("Input string is: "+input);
        String reverse = recursive(input);
        System.out.println("Reverse string is: "+reverse);

    }

    private static String recursive(String input) {

        if (input.isEmpty())
            return input;

        return recursive(input.substring(1))+input.charAt(0);

    }

}
