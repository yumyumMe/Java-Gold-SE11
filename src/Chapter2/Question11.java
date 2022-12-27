package Chapter2;

import java.util.function.BiFunction;

public class Question11 {
    BiFunction<Integer, Integer, String> test1 = (a, b) -> a + b;
    BiFunction<Integer, Integer, String> test2 = (a, b) -> Integer.toString(a + b);
    BiFunction<Integer, String> test3 = (a, b) -> a + b;
    BiFunction<Integer, String> test4 = (a, b) -> Integer.toString(a + b);
}
