package Chapter2;

import java.util.function.BinaryOperator;

public class Question14 {
    BinaryOperator op1 = (a, b) -> a + b;
    BinaryOperator<Integer> op2 = (a, b) -> a + b;
    BinaryOperator<Integer, Integer> op3 = (a, b) -> a + b;
    BinaryOperator<Integer, Integer, Integer> op4 = (a, b) -> a + b;
}
