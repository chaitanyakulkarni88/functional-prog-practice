package practice;

import java.util.*;

public class P8 {

    public static void main(String[] args) {
        //Integer[] arrayOfNumbers = new Integer[] {1, 2, 3, 4, 5};

        /*for(int i=0;i<3;i++)
        {
            int j;
            int first = arrayOfNumbers[0];
            for(j=0;j<arrayOfNumbers.length-1;j++)
            {
                arrayOfNumbers[j] = arrayOfNumbers[j+1];
            }
            arrayOfNumbers[j] = first;

        }

        List<Integer> listOfNumbers = Arrays.asList(arrayOfNumbers);
        listOfNumbers.stream().forEach(i -> System.out.println(i));*/

        /*for(int i=0;i<3;i++)
        {
            int j;
            int last = arrayOfNumbers[arrayOfNumbers.length-1];
            for(j=arrayOfNumbers.length-1;j>0;j--)
            {
                arrayOfNumbers[j] = arrayOfNumbers[j-1];
            }
            arrayOfNumbers[j] = last;

        }

        List<Integer> listOfNumbers = Arrays.asList(arrayOfNumbers);
        listOfNumbers.stream().forEach(i -> System.out.println(i));*/

        Integer[] arrayOfNumbers = new Integer[] {1, 2, 3, 4, 4};

        Set<Integer> setOfNumbers= new HashSet<>();

        Collections.addAll(setOfNumbers,arrayOfNumbers);
        System.out.println(setOfNumbers);
    }

}
