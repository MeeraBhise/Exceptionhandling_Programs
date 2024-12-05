package Exceptionhandling;

public class TooYoungException extends RuntimeException{
            TooYoungException(String s)
    {
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s)
    {
        super(s);
    }
}
class CustomizedException{
    public static void main(String[] args) {
     int age=Integer.parseInt(args [200]);
     if(age>60)
     {
         throw new TooYoungException("please wait sometime ..u will get best match");
     }
         else if(age<18)
        {
         throw new TooOldException("your age already crossed...");
         }
         else{
         System.out.println("you will get match detail soon by mail");
      }
    }
}
