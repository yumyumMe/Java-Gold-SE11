package Chapter2;

import java.util.function.Consumer;

public class Question4 {
    Consumer<String> c1 = x -> System.out.println(x);
    c1.accept("hello");

    Consumer<String> c2 = x -> "Hello, " + x;
    System.out.println(c2.accept("test"));

    Consumer<String> c3 = () -> "Hello, test";
    System.out.println(c3.accept());

    Consumer<String> c4 = () -> System.out.println("test");
    c4.accept();
}
