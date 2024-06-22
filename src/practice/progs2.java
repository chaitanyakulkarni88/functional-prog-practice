package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class progs2 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(101,201,301,401,501);

        Optional<Integer> any = numList.stream().findAny();

        System.out.println(any);
        /*boolean result = numList.stream()
                                               .allMatch(f -> f.intValue() > 30);

        System.out.println(result);*/

        /*double total = numList.stream()
                .map(cost -> cost + 0.11*cost)
                .reduce((sum,cost) -> sum + cost).get();
                //.forEach(System.out::println);
        System.out.println("Total is: "+total);

        List<String> features = Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");

        String collect = features.stream()
                .map(f -> f + " topic")
                .collect(Collectors.joining(","));

        System.out.println(collect);*/

    }
}
