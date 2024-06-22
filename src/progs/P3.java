package progs;

public class P3 {

    public static void main(String[] args) {

        /*String input = "Character";
        char[] ipArray = input.toCharArray();

        for(char s:ipArray)
        {
            System.out.print(s+" ");
        }*/

        String first = "Chaitanya";
        String second = "Kulkarni";

        System.out.println(first+second);
        first = first.concat(second);
        second = first.substring(0,(first.length()-second.length()));
        first = first.substring(second.length());

        System.out.println(first+second);


    }

}
