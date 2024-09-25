package Exceptionhandling;

public class CustomeException2  extends RuntimeException{
    CustomeException2()
    {
        super("your age is not valid for voting ");
    }
}
class Voting1 extends CustomeException2{
    public static void main(String[] args)  {
     int age =12;
     if(age<18)
       {
         throw new CustomeException2();
       }
  else
       {
         System.out.println("valid age for voting");
        }
    }
}