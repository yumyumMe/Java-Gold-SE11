package Chapter1.Question9;

public class Question9 implements Sample {
    public static void test() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        Sample.test();
    }
}
/*
 * A. 「A」と表示される
 * B. 「B」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外がスローされる
 */
