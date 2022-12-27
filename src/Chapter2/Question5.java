package Chapter2;

import java.util.function.BiConsumer;

public class Question5 {
    BiConsumer<Integer, Integer> test1 = (a, b) -> a + b;

    BiConsumer<Integer, Integer> test2 = (a, b) -> System.out.println(a + b);

    BiConsumer<Integer, Integer> test3 = (a) -> a * 2;

    BiConsumer<Integer, Integer> test4 = (a) -> System.out.println(a * 2);
}
