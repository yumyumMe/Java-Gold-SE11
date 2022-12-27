package Chapter1;
public class Question1 {
    class Inner {
        public void Test() {
            System.out.println("test");
        }
    }
    public static void main(String args[]) {

        /**
         * A. new Inner();
         * B. new Question1.Inner();
         * C. new Question1().new Inner();
         * D. new Question1:Inner();
         */
        new Question1().new Inner();
    }
}