package Chapter1.Question15;

public class Question15 {
    public static void main(String[] args) {
        // Enumは呼び出し時にインスタンスが生成される
        // Sampleクラスのコンストラクタでvalueが3回出力され、
        // 下記のメインクラスで4回目のhelloが出力される
        System.out.println(Sample.A);
    }
}
/*
 * A.「A」と表示される
 * B. 「hello」が1回表示される
 * C. 「hello」が3回表示される
 * D. 「hello」が4回表示される
 */