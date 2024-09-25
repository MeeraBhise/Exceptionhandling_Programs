package Exceptionhandling;

public class CustomeException  extends Exception{
    CustomeException()
    {
        super("your age is not valid");
    }
    CustomeException( String s)
    {
        super(s);
    }
}
class Voting extends CustomeException{
    public static void main(String[] args) throws CustomeException {
       int age=21;
       if(age<18)
       {
           throw new CustomeException();

       }
        else {
           System.out.println("valid age for voting");
       }
    }
}