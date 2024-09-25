package Exceptionhandling;
public class ThrowKeyword {

    int test(int a)  throws ArithmeticException {
        try {
            int b = a / 0;
        } catch (ArithmeticException ae) {
        }
        System.out.println("display method");
        return 0;
}

    public static void main(String args[]) {
        ThrowKeyword s1 = new ThrowKeyword();
        s1.test(100);
    }
}
