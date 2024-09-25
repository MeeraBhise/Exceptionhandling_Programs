package Exceptionhandling;

public class ABCD1 {
  static   void test()

    {
        System.out.println("test method");
    }
    public static void main(String[] args) //throws ClassNotFoundException
     {
       try{
           Class c1=Class.forName("ABCD");
       }
       catch(java.lang.Exception e)
       {
           ABCD1.test();
         //  e.printStackTrace();
          // System.out.println(e.toString());
           System.out.println(e.getMessage());
       }
       // class1.test();
        //  ABCD1.test();
       // System.out.println("hello");
    }
}
