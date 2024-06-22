package practice;

import java.util.Arrays;

public class P11 {

    public static void main(String[] args) {

        //String input = "Remove white spaces";
        //String output = input.replaceAll(" ","");
        //String output = input.toUpperCase();
        //String output = input.replaceAll("\s","-");
        //System.out.println(output);

        StringBuilder input = new StringBuilder("madam");
        StringBuilder reverse = new StringBuilder();

        for(int i=input.length()-1;i>=0;i--)
        {
            reverse.append(input.charAt(i));
        }
        String result = input.toString().equals(reverse.toString()) ? "Palindrome":"Not Palindrome";
        System.out.println(result);

    }

}
