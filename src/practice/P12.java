package practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P12 {

    public static void main(String[] args) {

        String input = "Grass is greener on the other side";
        input = input.replaceAll("\s","");
        input = input.toLowerCase();

        Map<Character,Integer> characterFreq = new HashMap<>();
        int count = 0;

        for (int i=0;i<input.length();i++)
        {
            if(characterFreq.containsKey(input.charAt(i)))
            {
                count = characterFreq.get(input.charAt(i));
                characterFreq.put(input.charAt(i),++count);
            }
            else
            {
                characterFreq.put(input.charAt(i),1);
            }
        }

        System.out.println(Collections.max(characterFreq.entrySet(),  (o1,o2) -> o1.getValue() - o2.getValue()));

        System.out.println(Collections.min(characterFreq.entrySet(), (o1,o2) -> o1.getValue() - o2.getValue()));

    }

}
