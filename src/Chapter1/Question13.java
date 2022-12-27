package Chapter1;
public interface Question13 {
    private void a();
    // SE9以降インターフェースにprvateメソッドを追加できるようになったが、
    // 処理のないprivateメソッドは定義できないので注意
    private void b(){}
    private default void c(){}
}
/*
 * A. private void a();
 * B. private void b(){}
 * C. private default void c(){}
 * D. 上記の選択肢はいずれもコンパイルエラーとなる
 */