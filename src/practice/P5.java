package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class P5 {

    public static void main(String[] args) {

        /*Function<Integer,String> evenOdd = (num) -> {
            if(num%2 == 0)
            {
                return "Number is even";
            }
            else
                return "Number is Odd";
        };
        System.out.println(evenOdd.apply(1));*/

        Function<Integer,Integer> nthPrimeNumber = (n) -> {

            List<Integer> primeNumbers = new ArrayList<>();
            int primeCount = 0;
            int num = 1;

            int m=0;
            while(primeCount < n)
            {
                num +=1;
                m=num/2;
                int flag = 0;
                for(int i=2;i<=m;i++)
                {
                    if(num % i == 0)
                    {
                        flag = 1;
                        break;
                    }
                }

                if(flag == 0)
                {
                    primeCount++;
                    primeNumbers.add(num);
                }

            }
            return primeNumbers.get(n-1);

        };

        System.out.println(nthPrimeNumber.apply(3));

        /*Function<String, String> paliOrNot = (original) -> {
            char[] originalArray = original.toCharArray();
            StringBuilder reverse = new StringBuilder();
            for(int j=originalArray.length-1;j>=0;j--)
            {
                reverse.append(originalArray[j]);
            }

            if(original.equals(reverse.toString()))
                return "PALINDROME";
            else
                return "NOT PALINDROME";
        };

        System.out.println(paliOrNot.apply("madam"));*/

        /*Function<Integer, String> paliOrNot = (num) -> {
            int sum = 0;
            int temp = num;
            int rem = 0;
            while(num > 0)
            {
                rem = num % 10;
                sum = (sum * 10) + rem;
                num = num / 10;
            }

            if(temp == sum)
                return "Palidrome number";
            else
                return "Not palidrome number";

        };

        System.out.println(paliOrNot.apply(455));*/
    }

}
