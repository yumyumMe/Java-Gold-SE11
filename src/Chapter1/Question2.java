package Chapter1;
public class Question2 {
    public static class Inner {
        /**
         * A. Inner inner = new Inner();
         * B. Inner inner = new Question2().new Inner();
         * C. Inner inner = Question2.new Inner();
         * D. Inner inner = new Question2().Inner();
         */
        Inner inner = new Inner(); // staticインナークラスはインスタンス化にエンクロージングクラスのインスタンスが不要
    }
}