package Exceptionhandling;

public class NullPointerExceptionHandlingPratice extends Throwable {
    void test()
    {
        System.out.println("test method");
    }
    public static void main(String[] args) {
        NullPointerExceptionHandlingPratice ns=new NullPointerExceptionHandlingPratice();
        ns=null;
        ns.test();
    }
}
