package Chapter2;

import java.util.function.BiPredicate;

public class Question8 {
    BiPredicate<Integer, Integer> p1 = (a, b) -> a + b;
    BiPredicate<Integer, Integer> p2 = (a, b) -> a == b;
    BiPredicate<Integer, Integer> p3 = (a) -> a > 0;
    BiPredicate<Integer, Integer> p4 = (a) -> a == 0;
}
