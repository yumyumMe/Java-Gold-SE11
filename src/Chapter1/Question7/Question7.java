package Chapter1.Question7;

public class Question7 {
    public static void main (String[] args) {
        Sample sample = new Sample() {
            // 匿名クラスは名前がないのでクラス名と同じ名前にする必要があるコンストラクタは存在しない
            // 初期化するには{}(初期化子)を使用する
            public Sample() {
                System.out.println("B");
            }
        };
    }
}
/*
 * A. 「A」と表示される
 * B. 「B」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例外がスローされる
 */
