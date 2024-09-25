package Exceptionhanling;

public class ExceptionTest1 {
   public int divide(int a,int b) {
           int c = a / b;
           System.out.println("return values:" + c);
           return c;
   }
    public static void main(String[] args) {
        System.out.println("main method");
        ExceptionTest1 s=new ExceptionTest1();
        s.divide(10,0);
        System.out.println("main ends");
    }
}