package Chapter2;

import java.util.function.Function;

public class Question10 {
    Function<Integer, Integer> a = x -> x + 2;
    Function<Integer, Integer> b = x -> x * 2;

    System.out.println(a.andThen(b).apply(10));
}
