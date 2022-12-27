package Chapter1.Question12;

public class Question12 extends B implements A {
    public static void main(String[] args) {
        // スーパークラスBが優先されるが、メソッドがpublic以外の場合コンパイルエラーが発生する
        new Sample().test();
    }
}
/*
 * A. 「A」と表示される
 * B. 「B」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外がスローされる
 */
