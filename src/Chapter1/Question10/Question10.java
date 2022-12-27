package Chapter1.Question10;

public class Question10 implements A, D {
    @Override
    public void test() {
        // インターフェスのデフォルトメソッドはオーバーライドしたクラスから
        // インターフェース名.super.メソッド名で呼び出せる
        A.super.test();
        // ※ただし1つ以上前の継承元のデフォルトメソッドは呼び出せない
        B.super.test();
        C.super.test();
    }
}
/*
 * A. A.super.test();
 * B. B.super.test();
 * C. C.super.test();
 * D. 上記の選択肢はいずれもコンパイルエラーとなる
 */