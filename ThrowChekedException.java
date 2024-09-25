package Exceptionhandling;
import java.io.FileNotFoundException;
public class ThrowChekedException {
    void show() throws FileNotFoundException{
        throw new NullPointerException("Test Exception");
}
void fly() throws FileNotFoundException {
    throw new FileNotFoundException("You don't have wings to fly");
}
public static void main(String[] args)  {
    ThrowChekedException oo = new ThrowChekedException();
    try{
        oo.show();
        oo.fly();
    } catch (Exception ee){

    }
    System.out.println("Test message");
}
}

