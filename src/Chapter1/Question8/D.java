package Chapter1.Question8;

public class D implements A {
    public static void main(String[] args) {
        A.test();
        // SE8以降は定数や抽象メソッド以外も定義可能になったが、
        // staticメソッドは定義したインターフェースからしか呼び出しできない。
        B.test();
        C.test();
        test();
    }
}
/*
 * A. Dクラスの5行目でコンパイルエラーが発生する
 * B. Dクラスの8行目でコンパイルエラーが発生する
 * C. Dクラスの9行目でコンパイルエラーが発生する
 * D. Dクラスの10行目でコンパイルエラーが発生する
 */