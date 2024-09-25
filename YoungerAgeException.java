package Exceptionhandling;

public class YoungerAgeException extends RuntimeException{

    YoungerAgeException()
    {
        super("your age is not applicable");
    }
}
 class Test{
     public static void main(String[] args) throws YoungerAgeException {
       int age=20;
       if(age<18)
       {
           throw new YoungerAgeException();
       }
         else{
           System.out.println("age is applicable");
       }
         System.out.println("invalid age");
     }
 }