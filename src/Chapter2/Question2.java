package Chapter2;

import java.util.function.Supplier;

public class Question2 {
    Supplier<String> s1 = (str) -> System.out.println(str);
    s1.get("test");

    Supplier<String> s2 = (str) -> "test" + str;
    System.out.println(s2.get());

    Supplier<String> s3 = () -> "test";
    System.out.println(s3.get());

    Supplier<String> s4 = () -> "test";
    System.out.println(s4.apply());
}
