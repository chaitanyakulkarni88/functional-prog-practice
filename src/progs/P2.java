package progs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class P2 {

    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("C:/Users/kchai/Downloads/text.txt");
        BufferedReader br = new BufferedReader(file);
        String line;
        //int count = 0;
        List<String> allWords = new ArrayList<>();
        Map<String, Integer> wordFreq = new HashMap<>();

        while((line = br.readLine()) != null)
        {
            String words[] = line.split("[,. ]");
            for(String word:words)
            {
                allWords.add(word.toLowerCase());
            }
            //count += words.length;
        }

        int count = 0;

        for(String word: allWords)
        {
            if(wordFreq.containsKey(word))
            {
                count = wordFreq.get(word);
                wordFreq.put(word,++count);
            }
            else
            {
                wordFreq.put(word,1);
            }
        }

        System.out.println(wordFreq.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());

    }

}
