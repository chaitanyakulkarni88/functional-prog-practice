package progs;

import java.util.Optional;

public class P6 {

    public static void main(String[] args)
    {
        /*String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);*/

        /*String[] words = new String[10];
        Optional<String> checkNull
                = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else if(checkNull.isEmpty())
            System.out.println("word is null");*/

        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.ofNullable(str[3]);
        System.out.println(value);
    }

}
