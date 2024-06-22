package progs;

import java.util.*;
import java.util.function.Function;

public class P4 {

    public static void main(String[] args) {
        Function<String, List<String>> minMaxPalindrome = (inputString) -> {

            String[] words = inputString.split(" ");
            Map<String,Integer> paliWordDetails = new HashMap<>();
            List<String> minMaxPali = new ArrayList<>();
            StringBuilder reverse = new StringBuilder();

            for(int i=0;i<words.length;i++)
            {
                for(int j=words[i].length()-1;j>=0;j--)
                {
                    reverse.append(words[i].charAt(j));
                }

                if(words[i].equalsIgnoreCase(reverse.toString()))
                {
                    paliWordDetails.put(words[i],words[i].length());
                }
                reverse.delete(0,words[i].length());
            }

            minMaxPali.add(paliWordDetails.entrySet().stream()
                    .min((o1,o2) -> o1.getValue() < o2.getValue() ? -1 : 1).get().getKey());
            minMaxPali.add(paliWordDetails.entrySet().stream()
                    .max((o1,o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey());
            return minMaxPali;

        };

        List<String> outputList = minMaxPalindrome.apply("Wow you own kayak");

        System.out.println("Min Palindrome word: "+outputList.get(0));
        System.out.println("Max Palindrome word: "+outputList.get(1));

    }

}
