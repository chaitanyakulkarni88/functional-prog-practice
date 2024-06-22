package practice;

import java.util.function.Consumer;
import java.util.function.Function;

public class P2 {
    public static void main(String[] args) {

        Function<Integer, String> data =(name)->{
            return "Hello, "+name;
        };

        System.out.println(data.apply(Integer.valueOf(11)));

    }
}