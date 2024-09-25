package Exceptionhandling;
import java.math.BigDecimal;
public class ArithmeticException2 {
    public static void main(String[] args) {
        System.out.println("main method start");
     BigDecimal a1=new BigDecimal(12.40) ;
     BigDecimal a2=new BigDecimal(32.20);
      try{a1=a1.divide(a2);}
      catch(ArithmeticException e){
          System.out.println(e.getMessage());
        }
    }
}
