package Exceptionhandling;

public class AritheticException1 {
    void division(int a,int b)
    {
        System.out.println("division");
      try{
          int c=a/b;
      }
      catch(ArithmeticException e)
      {
        //  e.printStackTrace();
      }
    }
    public static void main(String[] args) {
        AritheticException1 a1=new AritheticException1();
        a1.division(190,0);
        System.out.println("main ends");
    }
}
