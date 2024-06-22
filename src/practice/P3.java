package practice;

import java.util.function.BiFunction;

public class P3 {
    public static void main(String[] args) {

        //BiFunction<Integer,Integer,Integer> add = (a, b)->a+b;
        BiFunction<Integer,Integer,Integer> add = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        System.out.println(add.apply(11,22));

    }
}
