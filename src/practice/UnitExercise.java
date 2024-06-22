package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
               new Person("Mayur", "Naik", 31),
                new Person("Vishal", "Hoon", 28),
                new Person("Devyansh", "Jharkhandwala", 27),
                new Person("Mukesh", "Kumar", 35)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });


        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLname().startsWith("K");
            }
        });

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFname().startsWith("D");
            }
        });

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return true;
            }
        });
    }
    interface Condition
    {
        boolean test(Person p);
    }
    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p:people)
        {
            if(condition.test(p))
            {
                System.out.println(p);
            }
        }
    }

}
