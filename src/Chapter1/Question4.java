package Chapter1;
public class Question4 {
    void test(){
        Inner.message = "Hello, Java";
    }
    class Inner {
         // 非staticなインナークラスではstaticなフィールドやメソッドの定義はできない
         // (staticクラスでは非static・staticどちらのフィールドやメソッドも定義可能)
        private static String message;
        public void test() {
            System.out.println(message);
        }
    }
    public static void main(String[] arges) {
        Question4 question4 = new Question4();
        question4.test();
        question4.new Inner().test();
    }
}
/*
 * A. 「null」と表示される
 * B. 「Hello, Java」と表示される
 * C. コンパイルエラーが発生する
 * D. 実行時に例以外がスローされる
 */
