package practice;

import java.util.*;
import java.util.function.Function;

public class P6 {

    public static void main(String[] args) {
        /*Function<Integer,Integer> factorial = (num) -> {
            int fact = 1;
            for(int i=num; i>0; i--)
            {
                fact *= i;
            }
            return fact;
        };

        System.out.println(factorial.apply(6));*/

        /*Function<Integer,String> armstrong = (num) -> {

            double temp = num;
            double digit = 0;
            double sum = 0;
            while(num > 0)
            {
                digit = num % 10;
                sum = sum + Math.pow(digit,3);
                num = num /10;
            }

            if(temp == sum)
                return "Armstrong number";
            else
                return "Not armstrong number";
        };

        System.out.println(armstrong.apply(153));*/
        /*Function<List<Integer>, Integer> largestNum = (numbersList) -> {

            Integer numbersArray[] = new Integer[numbersList.size()];
            for(int i=0; i<numbersArray.length;i++)
            {
                numbersArray[i] = numbersList.get(i);
            }
            Arrays.sort(numbersArray, Collections.reverseOrder());

            return numbersArray[0];
        };

        List<Integer> inputNumbers = new ArrayList<>();
        for(int i=0;i<11;i++)
        {
            inputNumbers.add(i);
        }
        Collections.shuffle(inputNumbers);
        System.out.println(largestNum.apply(inputNumbers));*/

        Function<Integer[], Map<Integer,Integer>> frequencyOfNums = (numbersArray) -> {

            Map<Integer,Integer> numsAndFreq = new HashMap<>();

            for(Integer i:numbersArray)
            {
                if(numsAndFreq.containsKey(i))
                {
                    Integer value = numsAndFreq.get(i);
                    value +=1;
                    numsAndFreq.put(i,value);
                }
                else
                {
                    numsAndFreq.put(i,1);
                }
            }

            return numsAndFreq;

        };

        Integer[] numbersArray = new Integer[] {null,null,1, 2, 8, 3, 2, 2, 2, 5, 1,8,5,6,7};
        Map<Integer,Integer> result = frequencyOfNums.apply(numbersArray);
        //Set<Map.Entry<Integer,Integer>> mapEntries = result.entrySet();

        System.out.println("Number      Frequency");
        /*result.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey()+"        "+entry.getValue()));*/
        result.forEach((k,v) -> System.out.println(k+"        "+v));
        /*for(Map.Entry<Integer,Integer> it:mapEntries)
        {
            System.out.println(it.getKey()+"        "+it.getValue());
        }*/

        System.out.println("Duplicate numbers are:");
        result.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
        /*for(Map.Entry<Integer,Integer> it:mapEntries)
        {
            if(it.getValue() > 1)
            {
                System.out.println(it.getKey());
            }

        }*/

    }
}
