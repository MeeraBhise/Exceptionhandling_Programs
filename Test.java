package Exceptionhandling;

class UnderAgeException extends RuntimeException {
   UnderAgeException()
   {
       super("you are under age");
   }
   UnderAgeException(String message)
   {
       super(message);
   }
}
class Voting11{
    public static void main(String[] args) {
        int age=16;
        try{
            if(age<18)
            {
                throw new  UnderAgeException("you cannot vote as your age is below 18");

            }
        }catch(UnderAgeException e)
        {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
