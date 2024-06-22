package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExerciseWithLambdas {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
               new Person("Mayur", "Naik", 31),
                new Person("Vishal", "Hoon", 28),
                new Person("Devyansh", "Jharkhandwala", 27),
                new Person("Mukesh", "Kumar", 35)
        );

        Collections.sort(people, (o1, o2) -> o1.getLname().compareTo(o2.getLname()));


        printConditionally(people, (p) -> p.getLname().startsWith("K"), (p) -> System.out.println(p.getFname()));

        printConditionally(people, (p) -> p.getFname().startsWith("D"), (p) -> System.out.println(p.getLname()));

        printConditionally(people, (p) -> true, (p) -> System.out.println(p));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> operation) {
        for(Person p:people)
        {
            if(condition.test(p))
            {
                operation.accept(p);
            }
        }
    }

}
