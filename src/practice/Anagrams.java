package practice;

import java.lang.*;
import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1,b1);
    }

    public static void main(String[] args) {

        String a = "anagram";
        String b = "marganas";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
