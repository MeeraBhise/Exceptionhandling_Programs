package Exceptionhandling;
/*

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.practiseprograms.Array;

public class PipeLineOperatorsInJava {
    public static void main(String[] args) {
    */
/*   int a=100,b=0,c;
      try{
          c=a/b;*//*

         try {
             File file = new File("Text.txt");
             //PipeLineOperatorsInJava pipe = null;
             //System.out.println(pipe.hashCode());
             int a = 10 / 0;
             boolean t = file.createNewFile();}

         catch (NullPointerException |  IOException | ArithmeticException | ArrayIndexOutOfBoundsException  e){
            if(e instanceof NullPointerException)
            {
                System.out.println("null pointer");
            }
            if(e instanceof IOException)
            {
                System.out.println("IOException");
            }
      }catch(Exception e) {
             System.out.println("exception ");
         }}}*/

public class SingleCatchWithMultipleExceptions {
    void test() {
        System.out.println("test");
    }

    public static void main(String args[]) {
        try {
           int c = 10 / 0;
            System.out.println(c);
            SingleCatchWithMultipleExceptions s = new SingleCatchWithMultipleExceptions();
            s = null;
            s.test();

        } catch (NullPointerException | ArithmeticException   e) {
            if (e instanceof ArithmeticException) {
                System.out.println("arithmetic exception");
            }
            if (e instanceof NullPointerException) {
                System.out.println(e);
            }
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("generic exception");
        }
    }
}












