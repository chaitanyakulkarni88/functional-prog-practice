package practice;

import java.util.*;

public class P13 {

    public static void main(String[] args) {

       /* String first = "abcde";
        String second = "deabc";
        first = first.concat(first);
        String result = first.contains(second) ? "Yes" : "No";
        System.out.println(result);*/

        String inputSentence = "big black bug bit a big black dog on his big black nose";

        /*String[] words = inputSentence.split(" ");
        Map<String,Integer> wordsfreq = new HashMap<>();
        int count = 0;

        for(int i=0;i< words.length;i++)
        {
            if(wordsfreq.containsKey(words[i]))
            {
                count = wordsfreq.get(words[i]);
                wordsfreq.put(words[i],++count);
            }
            else
            {
                wordsfreq.put(words[i],1);
            }

        }

        wordsfreq.entrySet().stream()
                .filter(w -> w.getValue() > 1)
                .forEach(w-> System.out.println(w.getKey()));*/

        String[] arrayOfWords= inputSentence.split(" ");

        System.out.println(Collections.max(Arrays.asList(arrayOfWords), (a,b) -> {
            return a.length() - b.length();
        }));

        System.out.println(Collections.min(Arrays.asList(arrayOfWords), (a,b) -> {
            return a.length() - b.length();
        }));


    }

}
