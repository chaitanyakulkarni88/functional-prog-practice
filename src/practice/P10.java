package practice;

import java.util.Arrays;

public class P10 {

    public static void main(String[] args) {
        String input = "FAN";
        int len = input.length();
        String[] subsets = new String[len*(len+1)/2];
        int temp = 0;

        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                subsets[temp] = input.substring(i,j+1);
                temp++;
            }
        }

        Arrays.asList(subsets).stream().forEach(s -> System.out.println(s));

    }

}
