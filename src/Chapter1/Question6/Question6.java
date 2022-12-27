package Chapter1.Question6;

public class Question6 {
    public static void main(String[] args) {
        var sample = new Sample(10) {
            // 匿名クラス
            void modify(int num) {
                setNum(num);
            }
        };
        sample.modify(100);
        System.out.println(sample.getNum());
    }
}
/*
 * A. 「10」と表示される
 * B. 「100」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外がスローされる
 */
