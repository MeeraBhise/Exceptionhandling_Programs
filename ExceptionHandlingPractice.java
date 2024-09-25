package Exceptionhandling;

public class ExceptionHandlingPractice {
    void show()
    {
        System.out.println("show method");
    }
    public static void main(String args[])
    {
        System.out.println("main method");
        ExceptionHandlingPractice ex=new ExceptionHandlingPractice();
        ex=null;
      /*  try{ex.show();}
        catch(NullPointerException e){
            System.out.println("catch ");
    }*/
        System.out.println("main ends");
    }
}
