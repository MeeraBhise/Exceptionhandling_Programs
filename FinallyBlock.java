package Exceptionhandling;

public class FinallyBlock {
    void test()
    {
        System.out.println("test method");
    }

    public static void main(String[] args) {
         FinallyBlock s=null;
       // FinallyBlock s=new FinallyBlock();
       try {
           s.test();
       }
      /* catch(NullPointerException ne)
       {
           System.out.println("null pointer");
       }*/
       finally
       {
           System.out.println("finally block always excuted ");
       }
    }
}
