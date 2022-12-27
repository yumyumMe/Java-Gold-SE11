package Chapter1;
public class Question3 {
    private int num = 2;
    public void hoge(){
        Inner test = new Inner();
        test.data = 100;
        test.execute();
    }
    private static class Inner{
        private int data;
        void execute(){
            //インナークラスからエンクロージングクラスへのアクセスは可能だが、
            // staticなメソッドから非staticなフィールドやメソッドにはアクセスできない
            System.out.println(num * data);
        }
    }
}
/**
 * A. 5行目でコンパイルエラーが発生する
 * B. 11行目でコンパイルエラーが発生する
 * C. 「200」と表示される
 * D. 実行時に例外がスローされる
 */
