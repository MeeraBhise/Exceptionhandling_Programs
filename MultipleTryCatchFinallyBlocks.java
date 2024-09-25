/*
package Exceptionhandling;

public class MultipleTryCatchFinallyBlocks {
    void test() {
        System.out.println("test method");
    }

    public static void main(String[] args) {
        int a = 100, b = 10, c;
        try {
            c = a / b;
            try {
                MultipleTryCatchFinallyBlocks s = null;
                System.out.println("try block1.1");
                s.test();
            }
            catch (NullPointerExceptionHandlingPratice ne) {
                System.out.println("null pointer exception");
            }
            System.out.println("try block1");
            System.out.println(c);
        } catch (ArithmeticException ae) {
                // System.out.println("arithmetic exception");
            } finally {
                try {
                    a = 100;
                    b = 0;
                    c = a / b;// in try block there is exception occures  then next code after that exception line donot get executed .
                    System.out.println("try block");
                } catch (ArithmeticException ae) {
                    System.out.println("Arithmetic exception");
                }
                System.out.println("finally block always excuted there exception or not exception present");
            }
        }
    }*/




