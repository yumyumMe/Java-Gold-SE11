package Chapter1.Question5;
public class Sample {
    private String message;
    public Test test(String value) {
        class A implements Test {
            @Override
            public void execute() {
                System.out.println(message + value);
            }
        }
        // ローカルクラスよりも前に定義していないためコンパイルエラー
        value = "LocalClass";
        message = "Hello, ";
        return new A();
    }
}
/**
 * A. 「Hello, LocalClass」と表示される
 * B. 「Hello, Java」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外が発生する
 */
