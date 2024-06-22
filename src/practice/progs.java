package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class progs {

    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas","Default Method","Stream API","Date and Time API");
        features.forEach(f -> {
            f = f + " topic";
            System.out.println(f);
        });
        /*for(String feature:features)
        {
            System.out.println(feature);
        }

        features.forEach(f -> System.out.println(f));

        features.forEach(System.out::println);*/

        /*filterList(features,f -> f.startsWith("D"));
        filterList(features,f -> f.endsWith("s"));
        filterList(features,f -> f.length() > 10);*/

        /*Predicate<String> startsWithD = (f) -> f.startsWith("D");
        Predicate<String> lengthGreaterThan11 = (f) -> f.length() > 15;

        features.stream()
                .filter(startsWithD.or(lengthGreaterThan11))
                .forEach(System.out::println);*/
    }
  /*  private static void filterList(List<String> features, Predicate<String> condition) {
        for(String feature: features)
        {
            if(condition.test(feature))
            {
                System.out.println(feature);
            }
        }
    }*/

   /* private static void filterList(List<String> features, Predicate<String> condition) {

        features.stream()
                .filter(condition::test)
                .forEach(System.out::println);

    }*/

}
