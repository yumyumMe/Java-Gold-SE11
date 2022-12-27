package Chapter1.Question11;

public class Question11 {
    public static void main(String[] args) {
        // クラスとインターフェースの両方の定義を継承している場合、
        // クラスの定義が優先される
        A a = new C();
        a.test();
    }
}
/*
 * A. 「A」と表示される
 * B. 「B」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外がスローされる
 */
